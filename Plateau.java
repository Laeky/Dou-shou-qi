/**
 * Classe implémentant le plateau du jeu Dou Shou Qi, ainsi que les actions qui lui sont liées
 * @author Elias ALICHE 11923622
 */


import java.util.ArrayList;

public class Plateau {
    
    private Case plateau[][];
    private Equipe tour;
    private Equipe gagnant;

    /**
     * Constructeur de base d'un plateau. Met l'attribut gagnant à null
     * @param plateau le plateau 
     */
    public Plateau(Case plateau[][]){
        this.plateau = plateau;
        this.tour = Equipe.BLEU;
        this.gagnant = null;
    }


    /* --------------------------------------------------------------------------------- */
    /* ------------------------------------ Getters ------------------------------------ */
    /* --------------------------------------------------------------------------------- */

    /**
     * Renvoie l'attribut plateau d'un plateau
     * @return l'attribut plateau
     */
    public Case[][] getPlateau(){
        return plateau;
    }

    /**
     * Méthode qui vérifie à qui le tour appartient
     * @return l'équipe dont le tour est arrivé.
     */
    public Equipe getTour(){
        return tour;
    }

    /**
     * Méthode à appeler après chaque action. Elle vérifie si quelqu'un a gagné ! 
     * @return l'équipe gagnante
     */
    public Equipe getGagnant(){
        return gagnant;
    }


    /* --------------------------------------------------------------------------------- */
    /* ------------------------------------ Setters ------------------------------------ */
    /* --------------------------------------------------------------------------------- */
    /**
     * Initialise l'attribut plateau 
     * @param p
     */
    public void setPlateau(Case[][] p){
        this.plateau = p;
    }
    /**
     * Initialise l'attribut gagnant du plateau 
     * Exemple d'utilisation : après un déplacement gagnant par une pièce p, on appelle setGagnant(p.getEquipe()).
     * Au début du tour suivant, un appel à getGagnant() est fait, ce qui renvoie l'équipe gagnante et annonce la fin de la partie.
     * @param g l'équipe gagnante
     */
    public void setGagnant(Equipe g){
        this.gagnant = g;
    }

    /**
     * Modifie l'attribut tour qui est àBLEU par défaut
     * @param e l'équipe à affecter à tour
     */
    public void setTour(Equipe e){
        this.tour = e;
    }


    /* --------------------------------------------------------------------------------- */
    /* -------------------------------- Autres Méthodes -------------------------------- */
    /* --------------------------------------------------------------------------------- */

    /**
     * Initialise les cases d'un plateau et place les pièces à leurs positions respectives.
     * ATTENTION : code très long, difficile de réduire plus que ça en gardant de la lisibilité
     */
    public void initialiserPlateau(){
        this.plateau = new Case[7][9];
        for(int i = 0; i < 7; i++){
            for(int j = 0; j < 9; j++){
                this.plateau[i][j] = new Case();
                this.plateau[i][j].setPosX(i);
                this.plateau[i][j].setPosY(j);
            }
        }
        for(int i = 1; i < 3; i++){
            for(int j = 3; j < 6; j++){
                this.plateau[i][j].setNature(NatureCase.EAU);
            }
        }
        for(int i = 4; i < 6; i++){
            for(int j = 3; j < 6; j++){
                this.plateau[i][j].setNature(NatureCase.EAU);
            }
        }
        
        // Mise en place des cases spéciales des deux équipes
        this.plateau[2][0].setNature(NatureCase.PIEGE);
        this.plateau[2][0].setEquipe(Equipe.BLEU);
        this.plateau[3][1].setNature(NatureCase.PIEGE);
        this.plateau[3][1].setEquipe(Equipe.BLEU);
        this.plateau[4][0].setNature(NatureCase.PIEGE);
        this.plateau[3][1].setEquipe(Equipe.BLEU);
        this.plateau[3][0].setNature(NatureCase.TANIERE);
        this.plateau[3][0].setEquipe(Equipe.BLEU);


        this.plateau[2][8].setNature(NatureCase.PIEGE);
        this.plateau[2][8].setEquipe(Equipe.ROUGE);
        this.plateau[3][7].setNature(NatureCase.PIEGE);
        this.plateau[2][8].setEquipe(Equipe.ROUGE);
        this.plateau[4][8].setNature(NatureCase.PIEGE);
        this.plateau[2][8].setEquipe(Equipe.ROUGE);
        this.plateau[3][8].setNature(NatureCase.TANIERE);
        this.plateau[3][8].setEquipe(Equipe.ROUGE);


        // Création des objets correspondant aux différentes pièces
        ArrayList<Espece> peutCap = new ArrayList<Espece>();
        peutCap.add(Espece.ELEPHANT);

        Piece elephant_n = new Piece(Espece.ELEPHANT, 8, 8, Equipe.BLEU, true, false, false, null);
        Piece lion_n = new Piece(Espece.LION, 7, 7, Equipe.BLEU, true, true, false, null);
        Piece tigre_n = new Piece(Espece.TIGRE, 6, 6, Equipe.BLEU, true, true, false, null);
        Piece leopard_n = new Piece(Espece.LEOPARD, 5, 5, Equipe.BLEU, true, false, false, null);
        Piece chien_n = new Piece(Espece.CHIEN, 4, 4, Equipe.BLEU, true, false, false, null);
        Piece loup_n = new Piece(Espece.LOUP, 3, 3, Equipe.BLEU, true, false, false, null);
        Piece chat_n = new Piece(Espece.CHAT, 2, 2, Equipe.BLEU, true, false, false, null);
        Piece rat_n = new Piece(Espece.RAT, 1, 1, Equipe.BLEU, true, false, true, peutCap);

        Piece elephant_r = new Piece(Espece.ELEPHANT, 8, 8, Equipe.ROUGE, true, false, false, null);
        Piece lion_r = new Piece(Espece.LION, 7, 7, Equipe.ROUGE, true, true, false, null);
        Piece tigre_r = new Piece(Espece.TIGRE, 6, 6, Equipe.ROUGE, true, true, false, null);
        Piece leopard_r = new Piece(Espece.LEOPARD, 5, 5, Equipe.ROUGE, true, false, false, null);
        Piece chien_r = new Piece(Espece.CHIEN, 4, 4, Equipe.ROUGE, true, false, false, null);
        Piece loup_r = new Piece(Espece.LOUP, 3, 3, Equipe.ROUGE, true, false, false, null);
        Piece chat_r = new Piece(Espece.CHAT, 2, 2, Equipe.ROUGE, true, false, false, null);
        Piece rat_r = new Piece(Espece.RAT, 1, 1, Equipe.ROUGE, true, false, true, peutCap);

        //BLEUS EN BAS, ROUGES EN HAUT 
        // Placement des pièces de l'équipe "BLEU"
        this.plateau[0][0].setContenu(tigre_n);
        this.plateau[0][6].setContenu(lion_n);
        this.plateau[1][1].setContenu(chat_n);
        this.plateau[1][5].setContenu(chien_n);
        this.plateau[2][0].setContenu(elephant_n);
        this.plateau[2][2].setContenu(loup_n);
        this.plateau[2][4].setContenu(leopard_n);
        this.plateau[2][6].setContenu(rat_n);
        
        // Placement des pièces de l'équipe "ROUGE"
        this.plateau[8][6].setContenu(tigre_r);
        this.plateau[8][0].setContenu(lion_r);
        this.plateau[7][5].setContenu(chat_r);
        this.plateau[7][1].setContenu(chien_r);
        this.plateau[6][6].setContenu(elephant_r);
        this.plateau[6][4].setContenu(loup_r);
        this.plateau[6][2].setContenu(leopard_r);
        this.plateau[6][0].setContenu(rat_r);

    }

    /**
     * Gère une action (un déplacement) sur le plateau.
     * @param x l'abcisse de la case
     * @param y l'ordonnée de la case
     * @param dest la case de destination de l'action
     * @return true si l'action a pu se dérouler, false sinon
     */
    public boolean action(int x, int y, Case dest){
        Case orig = this.plateau[x][y];
        if(!orig.deplacement(dest))
            return false;
        if(orig.getNature() == NatureCase.PIEGE)
            orig.sortiePiege();
        // Si la destination est la tanière adverse, on affecte l'équipe de la pièce qui agit à l'attribut gagnant du plateau.
        if(dest.getNature() == NatureCase.TANIERE && orig.getEquipe() != dest.getEquipe())
            this.setGagnant(orig.getContenu().getEquipe());
        if(dest.getNature() == NatureCase.PIEGE && orig.getEquipe() != dest.getEquipe())
            orig.entreePiege();
        return true;
    }
    
}
