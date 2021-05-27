/**
 * Classe Chat du jeu Dou Shou Qi, ou Jeu du Combat des Animaux
 * 
 * @author Elias ALICHE - 11923622
*/

import java.util.*;

public class Chat{


    private int posX;

    private int posY;

    private Rang rang;

    private Equipe equipe;

    private boolean etat;

    private boolean saut;

    private boolean nage;

    private ArrayList<Rang> peutCapturer;
    
    /* --------------------------------------------------------------------------------------- */
    /* ------------------------------------ Constructeurs ------------------------------------ */
    /* --------------------------------------------------------------------------------------- */

    /**
     * 
     * @param posX la position en X
     * @param posY la position en Y
     * @param rang le rang
     * @param equipe l'équipe
     * @param etat l'état du chat
     * @param saut la capacité à sauter
     * @param nage la capacité à nager
     */
    public Chat(int posX, int posY, Equipe equipe, boolean etat, ArrayList<Rang> peutCapturer){
        this.posX = posX;
        this.posY = posY;
        this.rang = Rang.DEUX;
        this.equipe = equipe;
        this.etat = etat;
        this.saut = false;
        this.nage = false;
        this.peutCapturer = peutCapturer;
    }

    

    /* --------------------------------------------------------------------------------- */
    /* ------------------------------------ Getters ------------------------------------ */
    /* --------------------------------------------------------------------------------- */

    /**
     * @pure
     * Renvoie la position en x du chat
     * @return l'attribut posX
     */
    public int getX(){
        return posX;
    }

    /**
     * @pure
     * Renvoie la position en y du chat
     * @return l'attribut posY
     */
    public int getY(){
        return posY;
    }

    /**
     * @pure
     * Renvoie le rang du chat
     * @return l'attribut rang
     */
    public Rang getRang(){
        return rang;
    }


    /**
     * @pure
     * Renvoie l'équipe du chat
     * @return l'attribut equipe
     */
    public Equipe getEquipe(){
        return equipe;
    }

    /**
     * @pure
     * Renvoie l'état du chat
     * @return l'attribut booléen etat
     */
    public boolean getEtat(){
        return etat;
    }

    /**
     * @pure
     * Renvoie la capacité à sauter du chat
     * @return l'attribut booléen saut
     */
    public boolean saut(){
        return saut;
    }

    /**
     * @pure
     * Renvoie la capacité à nager du chat
     * @return l'attribut booléen nage
     */
    public boolean nage(){
        return nage;
    }

    /**
     * @pure
     * Renvoie la liste des espèces qu'il peut capturer
     * @return la liste
     */
    public ArrayList<Rang> getPeutCapturer(){
        return peutCapturer;
    }

    /* --------------------------------------------------------------------------------- */
    /* ------------------------------------ Setters ------------------------------------ */
    /* --------------------------------------------------------------------------------- */

    /**
     * Initialise la position en x du chat
     * @param X l'attribut posX
     */
    public void setPosX(int X){
        this.posX = X;
    }

    /**
     * Initialise la position en y du chat
     * @param Y l'attribut posY
     */
    public void setPosY(int Y){
        this.posY = Y;
    }

    /**
     * Initialise le rang du chat
     * @param rang l'attribut rang
     */
    public void setRang(Rang rang){
        this. rang = rang;
    }

    /**
     * Initialise l'équipe du chat
     * @param equipe l'attribut equipe
     */
    public void setEquipe(Equipe equipe){
        this.equipe = equipe;
    }

    /**
     * Initialise l'état du chat
     * @param etat l'attribut booléen etat
     */
    public void setEtat(boolean etat){
        this.etat = etat;
    }

    /**
     * Initialise la capacité à sauter du chat
     * @param saut l'attribut booléen saut
     */
    public void setSaut(boolean saut){
        this.saut = saut;
    }

    /**
     * Initialise la capacité à nager du chat
     * @param nage l'attribut booléen nage
     */
    public void setNage(boolean nage){
        this.nage = nage;
    }

