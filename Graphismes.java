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

 /*@author Amine KHEDDAOUI 11807877*/

public class GraphismesPlateau{
    FileInputStream plateau = new FileInputStream("images/Neutre/Misc/Plateau.jpg");
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
        
        lionBleu.translate.setX(100);
        lionBleu.translate.setY(137);
        chienBleu.translate.setX(183);
        chienBleu.translate.setY(220);
        ratBleu.translate.setX(100);
        ratBleu.translate.setY(300);
        panthereBleu.translate.setX(270);
        panthereBleu.translate.setY(300);
        loupBleu.translate.setX(184);
        loupBleu.translate.setY(300);
        chatBleu.translate.setX(510);
        chatBleu.translate.setY(220);
        elephantBleu.translate.setX(590);
        elephantBleu.translate.setY(300);
        tigreBleu.translate.setX(590);
        tigreBleu.translate.setY(137);

        lionRouge.translate.setX(590);
        lionRouge.translate.setY(790);
        chienRouge.translate.setX(507);
        chienRouge.translate.setY(700);
        ratRouge.translate.setX(590);
        ratRouge.translate.setY(625);
        panthereRouge.translate.setX(430);
        panthereRouge.translate.setY(625);
        loupRouge.translate.setX(265);
        loupRouge.translate.setY(625);
        chatRouge.translate.setX(200);
        chatRouge.translate.setY(700);
        elephantRouge.translate.setX(100);
        elephantRouge.translate.setY(625);
        tigreRouge.translate.setX(100);
        tigreRouge.translate.setY(790);


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
