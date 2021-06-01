/**
 * 
 */
public class Plateau {
    
    private Case plateau[][];
    private Equipe gagnant;

    /**
     * Constructeur de base d'un plateau. Met l'attribut gagnant à null
     * @param plateau le plateau 
     */
    public Plateau(Case plateau[][]){
        this.plateau = plateau;
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


    /* --------------------------------------------------------------------------------- */
    /* -------------------------------- Autres Méthodes -------------------------------- */
    /* --------------------------------------------------------------------------------- */

    /**
     * Initialise les cases d'un plateau et place les pièces à leurs positions respectives.
     * ATTENTION : code très long, difficile de réduire plus que ça
     */
    public void InitialiserPlateau(){
        this.plateau = new Case[7][9];
        for(int i = 0; i < 7; i++){
            for(int j = 0; j < 9; j++){
                this.plateau[i][j] = new Case();
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
        this.plateau[2][0].setNature(NatureCase.PIEGE);
        this.plateau[3][1].setNature(NatureCase.PIEGE);
        this.plateau[4][0].setNature(NatureCase.PIEGE);
        this.plateau[3][0].setNature(NatureCase.TANIERE);

        this.plateau[2][8].setNature(NatureCase.PIEGE);
        this.plateau[3][7].setNature(NatureCase.PIEGE);
        this.plateau[4][8].setNature(NatureCase.PIEGE);
        this.plateau[3][8].setNature(NatureCase.TANIERE);

        // Placement des pièces de l'équipe ROUGE 
        this.plateau[0][0].setContenu();
    }

}
