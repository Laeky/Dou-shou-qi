/**
 * Classe Animal du jeu Dou Shou Qi, ou Jeu du Combat des Animaux
 * 
 * @author Elias ALICHE - 11923622
*/

import java.util.*;

public class Animal{


    private int posX;

    private int posY;
    
    private Espece espece;

    private Rang rang;

    private Equipe equipe;

    private boolean vivant;

    private boolean saut;

    private boolean nage;

    private ArrayList<Espece> peutCapturer;
    
    /* --------------------------------------------------------------------------------------- */
    /* ------------------------------------ Constructeurs ------------------------------------ */
    /* --------------------------------------------------------------------------------------- */

    /**
     * 
     * @param posX la position en X
     * @param posY la position en Y
     * @param rang le rang
     * @param equipe l'équipe
     * @param vivant le caractère vivant
     * @param saut la capacité à sauter
     * @param nage la capacité à nager
     */
    public Animal(int posX, int posY, Espece espece, Rang rang, Equipe equipe, boolean vivant, boolean saut, boolean nage, ArrayList<Espece> peutCapturer){
        this.posX = posX;
        this.posY = posY;
        this.espece = espece;
        this.rang = rang;
        this.equipe = equipe;
        this.vivant = vivant;
        this.saut = saut;
        this.nage = nage;
        this.peutCapturer = peutCapturer;
    }

    

    /* --------------------------------------------------------------------------------- */
    /* ------------------------------------ Getters ------------------------------------ */
    /* --------------------------------------------------------------------------------- */

    /**
     * @pure
     * Renvoie la position en x de l'animal
     * @return l'attribut posX
     */
    public int getPosX(){
        return posX;
    }

    /**
     * @pure
     * Renvoie la position en y de l'animal
     * @return l'attribut posY
     */
    public int getPosY(){
        return posY;
    }

    /**
     * @pure
     * Renvoie le rang de l'animal
     * @return l'attribut rang
     */
    public Rang getRang(){
        return rang;
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
     * Renvoie la liste des espèces qu'il peut capturer
     * @return la liste
     */
    public ArrayList<Espece> getPeutCapturer(){
        return peutCapturer;
    }

    /* --------------------------------------------------------------------------------- */
    /* ------------------------------------ Setters ------------------------------------ */
    /* --------------------------------------------------------------------------------- */

    /**
     * Initialise la position en x de l'animal
     * @param X l'attribut posX
     */
    public void setPosX(int X){
        this.posX = X;
    }

    /**
     * Initialise la position en y de l'animal
     * @param Y l'attribut posY
     */
    public void setPosY(int Y){
        this.posY = Y;
    }

    /**
     * Initialise le rang de l'animal
     * @param rang l'attribut rang
     */
    public void setRang(Rang rang){
        this. rang = rang;
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



}
