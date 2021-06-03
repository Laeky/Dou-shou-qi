

public abstract class Plateau {
    
    private Case plateau[][];
    private Equipe tour;
    private Equipe gagnant;

    /**
     * Constructeur de base d'un plateau. Met l'attribut gagnant à null
     * @param plateau le plateau 
     */
    public Plateau(Case plateau[][]){
        this.plateau = plateau;
        this.tour = Equipe.NOIR;
        this.gagnant = null;
    }


    /* --------------------------------------------------------------------------------- */
    /* ------------------------------------ Getters ------------------------------------ */
    /* --------------------------------------------------------------------------------- */

    /**
     * Renvoie l'attribut plateau d'un plateau
     * @return l'attribut plateau
     */
    public abstract Case[][] getPlateau();

    /**
     * Méthode qui vérifie à qui le tour appartient
     * @return l'équipe dont le tour est arrivé.
     */
    public abstract Equipe getTour();

    /**
     * Méthode à appeler après chaque action. Elle vérifie si quelqu'un a gagné ! 
     * @return l'équipe gagnante
     */
    public abstract Equipe getGagnant();

    /* --------------------------------------------------------------------------------- */
    /* ------------------------------------ Setters ------------------------------------ */
    /* --------------------------------------------------------------------------------- */


    /**
     * Initialise l'attribut plateau 
     * @param p
     */
    public abstract void setPlateau(Case[][] p);

    /**
     * Initialise l'attribut gagnant du plateau 
     * Exemple d'utilisation : après un déplacement gagnant par une pièce p, on appelle setGagnant(p.getEquipe()).
     * Au début du tour suivant, un appel à getGagnant() est fait, ce qui renvoie l'équipe gagnante et annonce la fin de la partie.
     * @param g l'équipe gagnante
     */
    public abstract void setGagnant(Equipe g);

    /**
     * Modifie l'attribut tour qui est à NOIR par défaut
     * @param e l'équipe à affecter à tour
     */
    public abstract void setTour(Equipe e);


    /* --------------------------------------------------------------------------------- */
    /* -------------------------------- Autres Méthodes -------------------------------- */
    /* --------------------------------------------------------------------------------- */

    /**
     * Initialise les cases d'un plateau et place les pièces à leurs positions respectives.
     * ATTENTION : code très long, difficile de réduire plus que ça
     */
    public abstract void initialiserPlateau();

    /**
     * Implémente le déplacement d'une pièce (à travers sa case) de sa case à une autre.
     * Fait passer l'attribut tour à l'équipe opposée
     * @param orig La case de départ
     * @param dest La case d'arrivée
     * @return true si le déplacement a réussi, false sinon
     */
    public abstract boolean deplacement(Case orig, Case dest);


    


}
