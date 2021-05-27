/*
* <p>Tigre : une classe Java où l'animal tigre est décrit par des Attributs </p>:
* @author Amanda Zane 11905642
* @author Nivetha VIJAYATHARAN 11905642
* </p>*/
public class Tigre{
// Attributs
/**
* <p> position en abscisse du Tigre . </p>
*/
  private int x;

/**
* <p> position en ordonnée du Tigre. </p>
*/
  private int y;
/**
* <p> Couleur du Tigre .</p>
*/
  private Couleur couleur;
/**
* <p> Rang du tigre .</p>
*/
  private Rang rang;
/**
* <p> Si le tigre est vivant ou non </p>
*/
  private boolean etat;
/**
* <p> si le tigre peut sauter ou pas.</p>
*/
  private boolean saute;
/**
* <p> si le tigre peut nager ou pas . </p>
*/
  private boolean nage;
/**
* <p> si le tigre appartient à l'équipe . </p>
*/
private Equipe equipe;
/**
* <p>retourne l'Equipe du tigre et permet de l'utilisateur en dehors de la classe Tigre</p>
* @return equipe du tigre
*/
  public Equipe getEquipe(){
    return equipe;
  }

/**
* <p> retourne la couleur du tigre </p>
* @return <code> ROUGE </code> si l'Equipe du tigre est LES_ROUGES
* @return <code> BLEUE </code> sinon
*/
  public Couleur getCouleur(){
    if(equipe == Equipe.LES_ROUGES){
      return Couleur.ROUGE;
    }
    return Couleur.BLEUE;
  }

/**
* <p>retourne le rang du tigre et permet de l'utilisateur en dehors de la classe Tigre</p>
* @return rang du tigre qui est CINQ
*/
  public Rang getRang(){
    return SEPT;
  }

/**
* <p>retourne l'état du tigre et permet de l'utilisateur en dehors de la classe Tigre</p>
* @return etat du tigre
*/
  public boolean etat(){
    return etat;
  }

  /**
   * <p>retourne si le tigre peut nager ou pas et permet de l'utilisateur en dehors de la classe Tigre</p>
   * @return false car le tigre ne peut pas nager
   */
  public boolean nage(){
    return false;
  }

  /**
   * <p>retourne si le tigre peut sauter ou pas et permet de l'utilisateur en dehors de la classe Tigre</p>
   * @return true car le tigre peut sauter
   */
  public boolean saute(){
    return true;
  }

  /**
   * <p>retourne la position x du tigre et permet de l'utilisateur en dehors de la classe Tigre</p>
   * @return x
   */
  public int getX(){
    return x;
  }

  /**
   * <p>retourne la position y du tigre et permet de l'utilisateur en dehors de la classe Tigre</p>
   * @return y
   */
  public int getY(){
    return y;
  }

  /**
   * <p>permet de modifier la position x du tigre</p>
   */
  public void setX(int x){
    this.x = x;
  }

  /**
   * <p>permet de modifier la position y du tigre</p>
   */
  public void setY(int Y){
    this.y = y;
  }

/**
* <p>Un constructeur qui permet de creer des Tigres</p>
* @param e qui caractérise l'Equipe du tigre
* @param v qui caractérise l'état du tigre
*/
  public Tigre(Equipe e, boolean v){
    this.equipe = e;
    this.etat = v;
  }

}
