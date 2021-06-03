

public abstract class Case {

    private int posX;
    private int posY;
    private Piece contenu;
    private boolean occupe;
    private NatureCase nature ;
    private Equipe equipe;  // attribut utilisé que pour les pièges et les tanières

    /**
    * @param contenu
    * @param occupe
    * @param nature
    * @param equipe
    */
    public Case(Piece contenu, boolean occupe, NatureCase nature, Equipe equipe ){
        this.posX = -1;
        this.posY = -1;
        this.contenu = null;
        this.occupe = false;
        this.nature = NatureCase.DEFAULT;
        this.equipe = null;
    }
    /**
     * @param contenu
     * @param n
    */
    public Case(int posX, int posY, Piece contenu, NatureCase n){
        this.posX = posX;
        this.posY = posY;
        this.contenu = contenu;
        if(contenu != null){
            this.occupe = true;
        }else{
            this.occupe = false;
        }
        this.nature = n;
        this.equipe = null;
    }
    
    /* --------------------------------------------------------------------------------- */
    /* ------------------------------------ Getters ------------------------------------ */
    /* --------------------------------------------------------------------------------- */

    /**
     * @pure
     * Renvoie la position en x de la case
     * @return l'attribut posX
     */
    public abstract int getPosX();

    /**
     * @pure
     * Renvoie la position en y de la case
     * @return l'attribut posY
     */
    public abstract int getPosY();

    /**
     * @pure
     * Renvoie l'equipe de la piece situé dans la case correspondante
     * @return l'attribut equipe
    */
    public abstract Equipe getEquipe();

    /**
        * @pure
        * Renvoie la nature de la case correspondante
        * @return l'attribut nature
    */
    public abstract NatureCase getNature();

    /**
     * @pure
     * Renvoie l' occupation de la case de l'animal ( oui ou non )
     * @return l'attribut boolean occupe
     */
    public abstract boolean IsOccupe();

    /**
     * @pure
    * Renvoie le contenu de la Piece
    * @return l'attribut contenu
    */
    public abstract Piece getContenu();

    /* --------------------------------------------------------------------------------- */
    /* ------------------------------------ Setters ------------------------------------ */
    /* --------------------------------------------------------------------------------- */

    /**
     * Initialise la position en x de la case
     * @param X l'attribut posX
     */
    public abstract void setPosX(int X);

    /**
     * Initialise la position en y de la case
     * @param Y l'attribut posY
     */
    public abstract void setPosY(int Y);
 

    /**
     *Initialise l'attribut nature d'une case à : EAU, PIEGE, TANIERE, DEFAULT
     *@param n qui est l'attribut NatureCase n
     */
    public abstract void setNature(NatureCase n);

    /* --------------------------------------------------------------------------------- */
    /* -------------------------------- Autres Méthodes -------------------------------- */
    /* --------------------------------------------------------------------------------- */

    /**
     * Réinitialise le rang du contenu d'une case à zéro lorsque la
     * pièce tombe dans le piège adverse
     */
    public abstract void entreePiege();

    /**
     * Méthode à appeler avant de déplacer une pièce à l'extérieur d'un piège,
     * et qui la remet à son rang initial
     */
    public abstract void sortiePiege();

    /**
     * @param o l'objet à comparer
     * @return true si les objets sont identiques, false sinon
     */
    public abstract boolean equals(Object o);
}
