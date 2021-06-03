import java.net.*;
import java.io.*;
import java.util.Arrays;

public class Main extends Thread{
    final static int port = 9632;
    private Socket socket;
    public Plateau plateau;
    public Equipe equipe;
    public Main adversaire;
    public static void main (String[] args){
        Case [][] c = new Case [7][9];
        for(int i =0 ; i<7; i++){
            for(int j=0;j<9;j++){
                c[i][j] = new Case();
            }
        }
        Plateau plateau = new Plateau (c);
        plateau.initialiserPlateau();

        try {
            ServerSocket socketServeur = new ServerSocket(port);
            System.out.println("Lancement du serveur");
            Socket red = socketServeur.accept();
            Socket blue = socketServeur.accept();
            Main t = new Main(blue, plateau, Equipe.BLEU);
            Main t2 = new Main(red, plateau, Equipe.ROUGE);
            t.adversaire = t2;
            t2.adversaire = t;
            t.start(); t2.start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Main (Socket s, Plateau plateau, Equipe equipe){
        socket = s;
        this.plateau = plateau;
        this.equipe = equipe;
    }
    public void run(){
        while(plateau.getGagnant() == null) {
            BufferedReader in;
            String[] cmd = new String[2];
            try {
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                System.out.println(in.readLine());
                cmd = in.readLine().split("/");
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (plateau.getTour() != this.equipe) continue;
            // action

            switch (cmd[0]) {
                case "dep":
                    int[][] c = Arrays.stream(cmd[1].split(";"))
                            .map(s ->
                                    Arrays.stream(s.split(".")).mapToInt(i ->
                                            Integer.parseInt(i, 10)).toArray()).toArray(int[][]::new);
                    boolean succes = plateau.action(c[0][0],c[0][1],plateau.getPlateau()[c[1][0]][c[1][1]]);
                    if (succes) {
                        if (plateau.getPlateau()[c[1][0]][c[1][1]].getNature() == NatureCase.PIEGE)
                        {
                            this.send("trap/" + cmd[1]);
                            adversaire.send("trap/" + cmd[1]);
                        }
                        else {
                            this.send(cmd[0] + "/" + cmd[1]);
                            adversaire.send(cmd[0] + "/" + cmd[1]);
                        }

                    } else
                        this.send("false");
                    break;
                default:
                    this.send("false");

            }


        }
        this.send("gg/" + plateau.getGagnant().toString());
        adversaire.send("gg/" + plateau.getGagnant().toString());
    }

    public synchronized void send(String s){
        PrintStream out = null;
        try {
            out = new PrintStream(socket.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        out.println(s);
    }



}
