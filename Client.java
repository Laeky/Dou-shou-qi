/**
 * Programme Client
 * @author Thomas Paris 11704079
 */
package Reseau;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client extends Thread{

    final static int port = 9632;
    public Socket socket;
    public void run(){
        String t ="";
        while(true){ // boucle infinie pour ecouter 
            try {
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream())); // écoute sur le socket les instructions du serveur
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }
    public static void main(String[] args){
        Socket socket = null;
        DataInputStream userInput;
        PrintStream theOutputStream;
        InetAddress serveur = null;
        try {
            serveur = InetAddress.getByName(args[0]); 
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        Client c = null;
        try {
            socket = new Socket(serveur, port); // on essaye de se connecter au serveur
            c = new Client(socket);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //on etabli la comunication vers le serveur
        Scanner sc = new Scanner(System.in);
        PrintStream out = null;
        try {
            out = new PrintStream(socket.getOutputStream()); 
        } catch (Exception e) {
            e.printStackTrace();
        }

        // envoie ce que l'utilisateur tape au serveur
        c.start();
        while(true){ 
            String str = sc.nextLine();
            out.println(str);  
        }
    }
    
    //creation du socket pour communiquer
    public Client(Socket socket){
        this.socket = socket;

    }

}
