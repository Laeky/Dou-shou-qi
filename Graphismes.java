package org.o7planning.javafx.FileInputStream;
 
import java.io.InputStream;
 
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.FileInputStream.FileInputStream;
import javafx.scene.FileInputStream.FileInputStreamView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import java.util.Scanner;
import java.lang.Math;

 

public class GraphismesPlateau{
    FileInputStream plateau = new FileInputStream("FileInputStreams/Plateau.jpg");
    public method setupGeneral(){
    	int min = 0;
    	int max = 1000;
    	int range = max-min+1;
        int nombreAleatoire1 = (int)(Math.random() * range) + min;
        int nombreAleatoire2 = (int)(Math.random() * range) + min;
        FileInputStream chatBleu = new FileInputStream("images/Bleu/Animaux/Chat.jpg");
        FileInputStream elephantBleu = new FileInputStream("images/Bleu/Animaux/eléphant.png");
        FileInputStream lionBleu = new FileInputStream("images/Bleu/Animaux/Lion.png");
        FileInputStream loupBleu = new FileInputStream("images/Bleu/Animaux/Loup.jpeg");
        FileInputStream panthereBleu = new FileInputStream("images/Bleu/Animaux/Panthère.png");
        FileInputStream ratBleu = new FileInputStream("images/Bleu/Animaux/Rat.png");
        FileInputStream tigreBleu = new FileInputStream("images/Bleu/Animaux/Tigre.png");
        if(nombreAleatoire1 == 1){
            FileInputStream chienBleu = new FileInputStream("images/Bleu/Animaux/Chien.png");
        }else{
        FileInputStream chienBleu = new FileInputStream("images/Bleu/Animaux/Chien.jpg");
        }

        FileInputStream chatRouge = new FileInputStream("images/Rouge/Animaux/Chat.jpg");
        FileInputStream elephantRouge = new FileInputStream("images/Rouge/Animaux/eléphant.png");
        FileInputStream lionRouge = new FileInputStream("images/Rouge/Animaux/Lion.png");
        FileInputStream loupRouge = new FileInputStream("images/Rouge/Animaux/Loup.jpeg");
        FileInputStream panthereRouge = new FileInputStream("images/Rouge/Animaux/Panthère.png");
        FileInputStream ratRouge = new FileInputStream("images/Rouge/Animaux/Rat.png");
        FileInputStream tigreRouge = new FileInputStream("images/Rouge/Animaux/Tigre.png");
        if(nombreAleatoire2 == 1){
            FileInputStream chienRouge = new FileInputStream("images/Rouge/Animaux/Chien.png");
        }else{
        FileInputStream chienRouge = new FileInputStream("images/Rouge/Animaux/Chien.jpg");
        }
        

    }
    public method glisserG(int distance,FileInputStream pic){
        for(int i = 0; i<distance;i++){
            pic.translate.setX(1);
        }
    }

    public method glisserH(int distance,FileInputStream pic){
        for(int i = 0; i<distance;i++){
            pic.translate.setY(1);
        }
    }
    public method glisserD(int distance,FileInputStream pic){
        for(int i = 0; i<distance;i++){
            pic.translate.setX(-1);
        }
    }

    public method glisserB(int distance,FileInputStream pic){
        for(int i = 0; i<distance;i++){
            pic.translate.setY(-1);
        }
    }
    public method mourir(FileInputStream pic){
        while(pic.width != 0){
            pic.grow(-1,-1);
        }
    }
}