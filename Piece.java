/**
 * @author Elias ALICHE 11923622
 */

import java.util.*;

public abstract class Piece {
    
    
    private Espece espece;

    private int rang;

    private int rangInitial;

    private Equipe equipe;

    private boolean vivant;

    private boolean saut;

    private boolean nage;

    private boolean dansEau;

    // On n'est pas certains de garder dansPiege et dansTaniere
    private boolean dansPiege;

    private boolean dansTaniere;
    /* L'attribut peutCapturer n'existe que pour gérer la situation du rat, qui est la seule exception à la règle de "capture par un niveau supérieur ou égal"*/
    private ArrayList<Espece> peutCapturer;


    /**
     * Constructeur ultra-complet qui initialise tous les attributs d'une pièce
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
    public abstract Espece getEspece();

    /**
     * @pure
     * Renvoie le rang de l'animal
     * @return l'attribut rang
     */
    public abstract int getRang();

    /**
     * @pure
     * Renvoie le rang initial de l'animal
     * @return l'attribut rangInitial
     */
    public abstract int getRangInitial();

    /**
     * @pure
     * Renvoie l'équipe de l'animal
     * @return l'attribut equipe
     */
    public abstract Equipe getEquipe();

    /**
     * @pure
     * Renvoie le caractère vivant (ou par opposition mort) l'animal
     * @return l'attribut booléen vivant
     */
    public abstract boolean isVivant();


    /**
     * @pure
     * Renvoie la capacité à sauter de l'animal
     * @return l'attribut booléen saut
     */
    public abstract boolean isSaut();

    /**
     * @pure
     * Renvoie la capacité à nager de l'animal
     * @return l'attribut booléen nage
     */
    public abstract boolean isNage();

    /**
     * @pure
     * Renvoie la liste des espèces qu'il peut capturer, attribut créé pour gérer l'exception du rat
     * @return la liste
     */
    public abstract ArrayList<Espece> getPeutCapturer();

    /**
     * @pure
     * Renvoie la valeur de vérité de la présence de l'animal dans une case d'eau.
     * Utile pour l'exception de capture de l'éléphant par le rat
     * @return l'attribut booléen dansEau
     */
    public abstract boolean isDansEau();


    /**
     * @pure
     * Renvoie la valeur de vérité de la présence de l'animal dans une case piege.
     * 
     * @return l'attribut booléen dansPiege
     */
    public abstract boolean isDansPiege();

    /**
     * @pure
     * Renvoie la valeur de vérité de la présence de l'animal dans une case taniere.
     * 
     * @return l'attribut booléen dansTaniere
     */
    public abstract boolean isDansTaniere();



    /* --------------------------------------------------------------------------------- */
    /* ------------------------------------ Setters ------------------------------------ */
    /* --------------------------------------------------------------------------------- */
    

    /**
     * @pure
     * Initialise l'espèce de l'animal
     * @param e l'attribut espece
     */
    public abstract void setEspece(Espece e);

    /**
     * Initialise le rang de l'animal
     * @param rang l'attribut rang
     */
    public abstract void setRang(int rang);

    /**
     * Initialise le rang initial de l'animal
     * @param rang l'attribut rangInitial
     */
    public abstract void setRangInitial(int rangInitial);

    /**
     * Initialise l'équipe de l'animal
     * @param equipe l'attribut equipe
     */
    public abstract void setEquipe(Equipe equipe);

    /**
     * Initialise le caractère vivant (ou par opposition mort) l'animal
     * @param vivant l'attribut booléen vivant
     */
    public abstract void setVivant(boolean vivant);

    /**
     * Initialise la capacité à sauter de l'animal
     * @param saut l'attribut booléen saut
     */
    public abstract void setSaut(boolean saut);

    /**
     * Initialise la capacité à nager de l'animal
     * @param nage l'attribut booléen nage
     */
    public abstract void setNage(boolean nage);


    /* --------------------------------------------------------------------------------- */
    /* -------------------------------- Autres Méthodes -------------------------------- */
    /* --------------------------------------------------------------------------------- */


    /**
     * Initialise la règle spéciale qui dit que le rat peut capturer l'éléphant
     * @return true si l'animal est un rat ET n'est pas dans l'eau, false sinon
     */
    public abstract boolean ratPeutCapturer();


    /**
     * Fonction de capture d'une pièce par une autre
     * @param p la piece a capturer
     * @return true si la capture est possible, faux sinon
     */
    public abstract boolean capture(Piece p);

    /**
     * @param o l'objet à comparer
     * @return true si les objets sont identiques, false sinon
     */
    public abstract boolean equals(Object o);
}
