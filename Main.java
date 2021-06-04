/**
 * Programme principal/Serveur
 * @author Amanda Zane 11809869
 * @author Gowshigan Selladurai 11707606
 */
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
            t.start(); t2.start(); // activation des threads

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
            if(this.equipe==Equipe.BLEU){
                System.out.println(plateau.toString());
            }
            BufferedReader in;
            String[] cmd = new String[2]; //cmd prend la commande reçu
            try {
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                //System.out.println(in.readLine()); //mettre dans "in" ce qu'on lit
                cmd = in.readLine().split("/");//séparer la chaine de caractère en deux avec la commande et les coordonées
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(cmd[0]); 
            System.out.println(cmd[1]); 
            if (plateau.getTour() != this.equipe) continue;// check si c'est toujours le tour de l'équipe
            // action

            switch (cmd[0]) {
                case "dep": // si déplacement
                    int[][] c = new int[2][2];
                    String[] splt=cmd[1].split(";");
                    for(int i=0; i<2;i++){
                        String[] tmp = splt[i].split("-");
                        System.out.println(splt[i]); 
                        c[i][0]=Integer.parseInt(tmp[0]);
                        
                        c[i][0]=Integer.parseInt(tmp[1]);
                    }
                    
                    boolean succes = plateau.action(c[0][0],c[0][1],plateau.getPlateau()[c[1][0]][c[1][1]]);
                    if (succes) {
                        if (plateau.getPlateau()[c[1][0]][c[1][1]].getNature() == NatureCase.PIEGE)
                        {
                            this.send("trap/" + cmd[1]); // renvoie la commande avec piège au joueur
                            adversaire.send("trap/" + cmd[1]); // renvoie la commande avec piège à l'adversaire
                        }
                        else {
                            this.send(cmd[0] + "/" + cmd[1]);// renvoie la commande avec case vide  au joueur
                            adversaire.send(cmd[0] + "/" + cmd[1]);// renvoie la commande avec case vide  à l'adversaire
                        }

                    } else
                        this.send("false"); //renvoie au joueur false , le déplacement n'a pas pu être effecuté
                    break;
                default:
                    this.send("false");//renvoie au joueur false , le déplacement n'a pas pu être effecuté

            }
            
        }
        this.send("gg/" + plateau.getGagnant().toString()); // le joueur à gagné
        adversaire.send("gg/" + plateau.getGagnant().toString()); // l'adversaire à gagné
    }
//agit comme un verrou sur le thread afin d'eviter des conflits
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
