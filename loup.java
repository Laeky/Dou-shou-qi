* <p>retourne le rang du tigre et permet de l'utilisateur en dehors de la classe Tigre</p>
* @return rang du tigre qui est CINQ
*/
  public Rang getRang(){
    return SEPT;
  }


 

/**
 * classe loup du jeu Dou Shou Qi.
 *
 * @author Gowshigan Selladurai
 * @version 0.1
 */
public class loup 
{
    // Attributs
    /**
    * <p> position en abscisse du loup . </p>
    */
      private int x;
    
    /**
    * <p> position en ordonnée du loup. </p>
    */
      private int y;
    /**
    * <p> Couleur du loup .</p>
    */
      private Couleur couleur;
    /**
    * <p> Rang du loup .</p>
    */
      private Rang rang;
    /**
    * <p> Si le loup est vivant ou non </p>
    */
      private boolean etat;
    /**
    * <p> si le loup peut sauter ou pas.</p>
    */
      private boolean saut;
    /**
    * <p> si le loup peut nager ou pas . </p>
    */
      private boolean nage;
        
      
      
    /**
     * Constructeur d'objets de classe loup
     */
    /*
    public loup(Couleur couleur)
    {
        this.estBlanc = estBlanc;
        this.etat = true;
    }*/

    /**
     * Retourne la coordonnée x du loup
     *
     * @return Les coordonnées X du loup
     */
    public int getX()
    {
        return x;
    }
    /**
     * Retourne la coordonnée y du loup
     *
     * @return Les coordonnées Y du loup
     */
    public int getY()
    {
        return y;
    }
    /**
     * Permet de définir la coordonée x du loup
     *
     * @param  x la coordonnée x du loup
     */
    public void setX(int x)
    {
        this.x = x;
    }
       /**
     * Permet de définir la coordonée y du loup
     *
     * @param  y la coordonnée y du loup
     */
    public void setY(int y)
    {
        this.y = y;
    }
    /**
     *Retourne l'etat du loup ( vivant ou mort)
     *
     * @return   boolean  etat du loup
     */
    
    public boolean etat()
    {
        return etat;
    }
    /**
     *Retourne le rang du loup et permet de l'utilisateur en dehors de la classe loup
     * 
     * @return rang du loup qui est CINQ
     */
    public Rang getRang()
    {
    return ;
    }
    
    
    /**
     * Retourne l'équipe de l'animal
     *
     * @return  l'equipe du loup
     */
    
    public Equipe getEquipe()
    {
        return equipe;
    }
    
    //equals
    //compare to
    //tostring
    
}
