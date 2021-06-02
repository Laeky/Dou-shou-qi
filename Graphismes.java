import graphics


public class GraphismesPlateau{
    Picture plateau = new Picture("images/Plateau.jpg");
    public method setupGeneral(){
    /**
    Le placement n'est pas encore terminé mais toutes les images sont implantées sur le plateau (dans le vide mais elles sont là)
    */
        int nombreAleatoire1 = Math.random(0 - 1000);
        int nombreAleatoire2 = Math.random(0 - 1000);
        Picture chatBleu = new Picture("images/Bleu/Animaux/Chat.jpg");
        Picture elephantBleu = new Picture("images/Bleu/Animaux/eléphant.png");
        Picture lionBleu = new Picture("images/Bleu/Animaux/Lion.png");
        Picture loupBleu = new Picture("images/Bleu/Animaux/Loup.jpeg");
        Picture panthereBleu = new Picture("images/Bleu/Animaux/Panthère.png");
        Picture ratBleu = new Picture("images/Bleu/Animaux/Rat.png");
        Picture tigreBleu = new Picture("images/Bleu/Animaux/Tigre.png");
        if(nombreAleatoire1 == 1){
            Picture chienBleu = new Picture("images/Bleu/Animaux/Chien.png");
        }else{
        Picture chienBleu = new Picture("images/Bleu/Animaux/Chien.jpg");
        }

        Picture chatRouge = new Picture("images/Rouge/Animaux/Chat.jpg");
        Picture elephantRouge = new Picture("images/Rouge/Animaux/eléphant.png");
        Picture lionRouge = new Picture("images/Rouge/Animaux/Lion.png");
        Picture loupRouge = new Picture("images/Rouge/Animaux/Loup.jpeg");
        Picture panthereRouge = new Picture("images/Rouge/Animaux/Panthère.png");
        Picture ratRouge = new Picture("images/Rouge/Animaux/Rat.png");
        Picture tigreRouge = new Picture("images/Rouge/Animaux/Tigre.png");
        if(nombreAleatoire2 == 1){
            Picture chienRouge = new Picture("images/Rouge/Animaux/Chien.png");
        }else{
        Picture chienRouge = new Picture("images/Rouge/Animaux/Chien.jpg");
        }

    }
    /**
    ici les distances sont à compter en pixels
    */
    public method glisserG(int distance,Picture pic){
        for(int i = 0; i<distance;i++){
            pic.translate(1,0);
        }
    }

    public method glisserH(int distance,Picture pic){
        for(int i = 0; i<distance;i++){
            pic.translate(0,1);
        }
    }
    public method glisserD(int distance,Picture pic){
        for(int i = 0; i<distance;i++){
            pic.translate(-1,0);
        }
    }

    public method glisserB(int distance,Picture pic){
        for(int i = 0; i<distance;i++){
            pic.translate(0,-1);
        }
    }
    public method mourir(Picture pic){
        while(pic.width != 0){
            pic.grow(-1,-1);
        }
    }
}
