/**
 * Classe implémentant les pièces du jeu Dou Shou Qi, ou les "animaux".
 * @author Elias ALICHE 11923622
 */

import java.util.*;

public class Piece{
    
    private Espece espece;

    private int rang;

    private int rangInitial;

    private Equipe equipe;

    private boolean vivant;

    private boolean saut;

    private boolean nage;

    private boolean dansEau;

    private boolean dansPiege;

    private boolean dansTaniere;
    /* L'attribut peutCapturer n'existe que pour gérer la situation du rat, qui est la seule exception à la règle de "capture par un niveau supérieur ou égal"*/
    private ArrayList<Espece> peutCapturer;
    
    /* --------------------------------------------------------------------------------------- */
    /* ------------------------------------ Constructeurs ------------------------------------ */
    /* --------------------------------------------------------------------------------------- */


    /**
     * 
     * @param espece l'espece de l'animal
     * @param rang le rang
     * @param equipe l'équipe
     * @param vivant le caractère vivant
     * @param saut la capacité à sauter
     * @param nage la capacité à nager
     * @param peutCapturer une liste des animaux qu'il peut capturer
     */
    public Piece(Espece espece, int rang, int rangInitial, Equipe equipe, boolean vivant, boolean saut, boolean nage, ArrayList<Espece> peutCapturer){
        this.espece = espece;
        this.rang = rang;
        this.rangInitial = rangInitial;
        this.equipe = equipe;
        this.vivant = vivant;
        this.saut = saut;
        this.nage = nage;
        this.peutCapturer = peutCapturer;
        this.dansEau = false;
        this.dansPiege = false;
        this.dansTaniere = false;
    }
    

    /* --------------------------------------------------------------------------------- */
    /* ------------------------------------ Getters ------------------------------------ */
    /* --------------------------------------------------------------------------------- */


    /**
     * @pure
     * Renvoie l'espèce de l'animal
     * @return l'attribut espece
     */
    public Espece getEspece(){
        return espece;
    }

    /**
     * @pure
     * Renvoie le rang de l'animal
     * @return l'attribut rang
     */
    public int getRang(){
        return rang;
    }

    /**
     * @pure
     * Renvoie le rang initial de l'animal
     * @return l'attribut rangInitial
     */
    public int getRangInitial(){
        return rangInitial;
    }


    /**
     * @pure
     * Renvoie l'équipe de l'animal
     * @return l'attribut equipe
     */
    public Equipe getEquipe(){
        return equipe;
    }

    /**
     * @pure
     * Renvoie le caractère vivant (ou par opposition mort) l'animal
     * @return l'attribut booléen vivant
     */
    public boolean isVivant(){
        return vivant;
    }

    /**
     * @pure
     * Renvoie la capacité à sauter de l'animal
     * @return l'attribut booléen saut
     */
    public boolean isSaut(){
        return saut;
    }

    /**
     * @pure
     * Renvoie la capacité à nager de l'animal
     * @return l'attribut booléen nage
     */
    public boolean isNage(){
        return nage;
    }

    /**
     * @pure
     * Renvoie la liste des espèces qu'il peut capturer, attribut créé pour gérer l'exception du
     * @return la liste
     */
    public ArrayList<Espece> getPeutCapturer(){
        return peutCapturer;
    }

    /**
     * @pure
     * Renvoie la valeur de vérité de la présence de l'animal dans une case d'eau.
     * Utile pour l'exception de capture de l'éléphant par le rat
     * @return l'attribut booléen dansEau
     */
    public boolean isDansEau(){
        return dansEau;
    }

    /**
     * @pure
     * Renvoie la valeur de vérité de la présence de l'animal dans une case piege.
     * 
     * @return l'attribut booléen dansPiege
     */
    public boolean isDansPiege(){
        return dansPiege;
    }

    /**
     * @pure
     * Renvoie la valeur de vérité de la présence de l'animal dans une case taniere.
     * 
     * @return l'attribut booléen dansTaniere
     */
    public boolean isDansTaniere(){
        return dansTaniere;
    }

    /* --------------------------------------------------------------------------------- */
    /* ------------------------------------ Setters ------------------------------------ */
    /* --------------------------------------------------------------------------------- */

    /**
     * @pure
     * Initialise l'espèce de l'animal
     * @param e l'attribut espece
     */
    public void setEspece(Espece e){
        this.espece = e;
    }

    /**
     * Initialise le rang de l'animal
     * @param rang l'attribut rang
     */
    public void setRang(int rang){
        this.rang = rang;
    }

    /**
     * Initialise le rang initial de l'animal
     * @param rang l'attribut rangInitial
     */
    public void setRangInitial(int rangInitial){
        this.rangInitial = rangInitial;
    }

    /**
     * Initialise l'équipe de l'animal
     * @param equipe l'attribut equipe
     */
    public void setEquipe(Equipe equipe){
        this.equipe = equipe;
    }

    /**
     * Initialise le caractère vivant (ou par opposition mort) l'animal
     * @param vivant l'attribut booléen vivant
     */
    public void setVivant(boolean vivant){
        this.vivant = vivant;
    }

    /**
     * Initialise la capacité à sauter de l'animal
     * @param saut l'attribut booléen saut
     */
    public void setSaut(boolean saut){
        this.saut = saut;
    }

    /**
     * Initialise la capacité à nager de l'animal
     * @param nage l'attribut booléen nage
     */
    public void setNage(boolean nage){
        this.nage = nage;
    }
    


    /* --------------------------------------------------------------------------------- */
    /* -------------------------------- Autres Méthodes -------------------------------- */
    /* --------------------------------------------------------------------------------- */

    /**
     * Initialise la règle spéciale qui dit que le rat peut capturer l'éléphant
     * @return true si l'animal est un rat ET n'est pas dans l'eau, false sinon
     */
    public boolean ratPeutCapturer(){
        ArrayList<Espece> peutCap = new ArrayList<Espece>();
        if(this.espece == Espece.RAT){
            peutCap.add(Espece.ELEPHANT);
            return true;
        }
        return false;
    }

    /**
     * Fonction de capture d'une pièce par une autre
     * @param p la piece a capturer
     * @return true si la capture est possible, faux sinon
     */
    public boolean capture(Piece p){
        if(this.getEquipe() == p.getEquipe())
            return false;
        if((this.getRang() >= p.getRang() || this.getPeutCapturer().contains(p.espece)) && !this.isDansEau() && !p.isDansEau()){
            p.setVivant(false);
            return true;
        }
        return false;
    }

    /**
     * @param o l'objet à comparer
     * @return true si les objets sont identiques, false sinon
     */
    @Override
    public boolean equals(Object o){
        if(o == null)
            return false;
        if(this.espece != ((Piece)o).espece)
            return false;
        if(this.rangInitial != ((Piece)o).rangInitial)
            return false;
        if(this.equipe != ((Piece)o).equipe)
            return false;
        return true;
    }
   
    public String toString(){
        switch (espece) {
            case CHAT:
                return "C";
            case TIGRE:
                return "T";
            case LION:
                return "L";
            case RAT:
                return "R";  
            case LEOPARD:
                return "P";
            case CHIEN:
                return "D";
            case LOUP:
                return "W";
            case ELEPHANT:
                return "E";  
                default:
                return "X";
        }
    }


}
