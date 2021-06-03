/**
 * Classe implémentant les cases du plateau du jeu Dou Shou Qi et les méthodes associées.
 * @author Elias ALICHE 11923622
 * @author Nivetha VIJAYATHARAN 11905642
 */

import java.lang.Math;

public class Case{

    private int posX;
    private int posY;
    private Piece contenu;
    private boolean occupe;
    private NatureCase nature;
    private Equipe equipe;  // attribut utilisé que pour les pièges et les tanières


    /* --------------------------------------------------------------------------------- */
    /* --------------------------------- Constructeurs --------------------------------- */
    /* --------------------------------------------------------------------------------- */

    public Case(){
        this.posX = -1;
        this.posY = -1;
        this.contenu = null;
        this.occupe = false;
        this.nature = NatureCase.DEFAULT;
        this.equipe = null;
    }

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
    public int getPosX(){
        return posX;
    }

    /**
     * @pure
     * Renvoie la position en y de la case
     * @return l'attribut posY
    */
    public int getPosY(){
        return posY;
    }

    /**
      * @pure
      * Renvoie l'equipe de la piece situé dans la case correspondante
      * @return l'attribut equipe
    */
    public Equipe getEquipe(){
        return equipe;
    }

    /**
     * @pure
     * Renvoie la nature de la case correspondante
     * @return l'attribut nature
    */
    public NatureCase getNature(){
        return nature;
    }

    /**
     * @pure
     * Renvoie l' occupation de la case de l'animal ( oui ou non )
     * @return l'attribut boolean occupe
    */
    public boolean isOccupe(){
        return occupe;
    }

    /**
     * @pure
     * Renvoie le contenu de la Piece
     * @return l'attribut contenu
    */
    public Piece getContenu(){
        return contenu;
    }

    /* --------------------------------------------------------------------------------- */
    /* ------------------------------------ Setters ------------------------------------ */
    /* --------------------------------------------------------------------------------- */

    /**
     * Initialise la position en x de la case
     * @param X l'attribut posX
     */
    public void setPosX(int X){
        this.posX = X;
    }

    /**
     * Initialise la position en y de la case
     * @param Y l'attribut posY
     */
    public void setPosY(int Y){
        this.posY = Y;
    }

    /**
     * Initialise l'occupation de la case
     * @param occupe l'attribut occupe
     */
    public void setOccupe(boolean occupe){
        this.occupe = occupe;
    }

    /**
     * Initialise l'attribut nature d'une case à : EAU, PIEGE, TANIERE, DEFAULT
     * @param n qui est l'attribut NatureCase n
    */
    public void setNature(NatureCase n){
        this.nature = n;
    }

    /**
     * Initialise le contenu d'une case
     * @param p la pièce à mettre dans la case
    */
    public void setContenu(Piece p){
        this.contenu = p;
        if(p != null)
            this.setOccupe(true);
    }

    /**
     * Initialise l'attribut équipe d'une case
     * @param e l'équipe à mettre dans la case
    */
    public void setEquipe(Equipe e){
        this.equipe = e;
    }

    /* --------------------------------------------------------------------------------- */
    /* -------------------------------- Autres Méthodes -------------------------------- */
    /* --------------------------------------------------------------------------------- */


    /**
     * Ré-initialise le rang du contenu d'une case à zéro lorsque la
     * pièce tombe dans le piège adverse
    */
    public void entreePiege(){
        this.getContenu().setRang(0);
    }
    /**
     * Méthode à appeler avant de déplacer une pièce à l'extérieur d'un piège,
     * et qui la remet à son rang initial
    */
    public void sortiePiege(){
        this.getContenu().setRang(this.contenu.getRangInitial());
    }

    /**
     * Implémente le déplacement d'une pièce (à travers sa case) de sa case à une autre.
     * @param dest La case d'arrivée
     * @return true si le déplacement a réussi, false sinon
     */
    public boolean deplacement(Case dest){
        if(dest == null)
            return false;
        if(!this.peutAller(dest))
            return false;
        // Si dest est occupée, on vérifie si on peut capturer l'occupant
        if(dest.isOccupe() && !this.getContenu().capture(dest.getContenu()))
            return false;
        
        if(dest.isOccupe()){
            dest.getContenu().setVivant(false);
            dest.setContenu(this.getContenu());
            this.setContenu(null);
            this.setOccupe(false);
        }else{
            dest.setContenu(this.getContenu());
            dest.setOccupe(true);
            this.setContenu(null);
            this.setOccupe(false);
        }
        return true;
        
    }

    /**
     * Vérifie si le déplacement est possible entre deux cases
     * @param dest la case d'arrivée
     * @return true si c'est possible, false sinon
     */
    public boolean peutAller(Case dest){
        if(dest == null || this.equals(dest))
            return false;
        if(dest.getNature() == NatureCase.TANIERE && this.getEquipe() == dest.getEquipe())
            return false;
        if((!this.uneCase(dest)) && (!this.saut_riviere(dest)))
            return false;
        if(dest.getNature() == NatureCase.EAU && dest.getContenu().isNage() == false)
            return false;
        if(dest.isOccupe() && !this.getContenu().capture(dest.getContenu()))
            return false;
        return true;
    }

    /**
     * Vérifie si le départ et la destination sont adjacents
     * @param dest la case de destination
     * @return true si la destination est à une case de distance, false sinon
     */
    public boolean uneCase(Case dest){
        int x1 = this.getPosX();
        int y1 = this.getPosY();
        int x2 = dest.getPosX();
        int y2 = dest.getPosY();
        return ((Math.abs(x2 - x1) == 1 && (y2 == y1)) || (Math.abs(y2 - y1) == 1 && (x2 == x1)));
    }
    
    
    /**
     * Vérifie si le saut par-dessus une rivière est possible
     * @param dest la case de destination
     * @return true si c'est possible, false sinon
     */
    public boolean saut_riviere(Case dest){
        if((this.getContenu().getEspece() != Espece.TIGRE) && (this.getContenu().getEspece() != Espece.LION))
            return false;
        int x1 = this.getPosX();
        int y1 = this.getPosY();
        int x2 = dest.getPosX();
        int y2 = dest.getPosY();
        if((x1 == 0 || x1 == 3 || x1 == 6) && (y1 > 2 && y1 < 6)){
            if (Math.abs(x2 - x1) == 3 && (y2 == y1)){
                return true;
            }else
                return false;
        }
        if((y1 == 2 || y1 == 6) && (x1 == 1 || x1 == 2 || x1 == 4 || x1 == 5)){
            if (Math.abs(y2 - y1) == 4 && (x2 == x1)){
                return true;
            }else
                return false;
        }
        return false;
    }
    

    /**
     * Equals pour Case. On ignore les attributs occupe et equipe, non pertinents ici.
     * @param o l'objet à comparer
     * @return true si les objets sont identiques, false sinon
     */
    @Override
    public boolean equals(Object o){
        if(o == null) 
            return false;
        if((this.getPosX() != ((Case)o).getPosX()) || (this.getPosY() != ((Case)o).getPosY()))
            return false;
        if(this.getContenu().equals(((Case)o).getContenu()))
            return false;
        if(this.getNature() != ((Case)o).getNature())
            return false;
        return true;
    }


}
