import java.net.*;
import java.io.*;

public class server {

    public static void main(String[] args) throws IOExeception{
        ServerSocket ss= new ServerSocket(4999);
        Socket s = ss.accept();

        System.out.printLn("client connected");
    }



}
