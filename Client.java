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
        while(true){
            try {
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                //System.out.println(in.readLine());
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
            socket = new Socket(serveur, port);
            c = new Client(socket);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scanner sc = new Scanner(System.in);
        PrintStream out = null;
        try {
            out = new PrintStream(socket.getOutputStream());
        } catch (Exception e) {
            e.printStackTrace();
        }

        c.start();
        while(true){
            String str = sc.nextLine();
            out.println(str);
        }
    }
    public Client(Socket socket){
        this.socket = socket;

    }

}
