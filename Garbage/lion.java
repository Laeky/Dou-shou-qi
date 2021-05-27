/*
* <p>Lion : une classe Java où l'animal tigre est décrit par :
*   <ul>
*      <li>une equipe : une instance de la classe enum Equipe valant : </li>
*         </ul>
*              <li> LES_ROUGES </li>
*              <li> LES_BLEUES </li>
*         </ul>
*      <li>un rang : une instance de la classe enum rang valant : </li>
*          <ul>
*               <li> UN </li>
*               <li> DEUX </li>
*               <li> TROIS </li>
*               <li> QUATRE </li>
*               <li> CINQ </li>
*               <li> SIX </li>
*               <li> SEPT </li>
*               <li> HUIT </li>
*          </ul>
*      <li>une couleur : une instance de la classe enum couleur valant : </li>
*          <ul>
*              <li> ROUGE </li>
*              <li> BLEUE </li>
*          </ul>
* </ul>
* </p>
* @author Amanda ZANE 11809869
* @author Thomas PARIS 11704079
* </p>*/

public class Lion{
	/* attributs */
	
	/**
	 * <p>La couleur de la panthère</p>
	 */
	private Couleur couleur;
	
	/**
	 *<p>Le rang de la panthère</p>
	 */
	private Rang rang;
	
	/**
	 *<p>L'équipe de la panthère</p>
	 */
	private Equipe equipe;
	
	/**
	 *<p>L'état de la panthère vivante ou morte</p>
	 */
	private boolean etat;
	
	/**
	 *<p>Si la panthère peut nager ou pas</p>
	 */
	private boolean nage;
	
	/**
	 *<p>Si la panthère peut sauter ou pas</p>
	 */
	private boolean saute;
	
	/**
	 * <p>La position x de la panthère</p>
	 */
	private int x;
	
	/**
	 * <p>La position y de la panthère</p>
	 */
	private int y;
	
	/**
        * <p>retourne l'équipe de la panthère et permet de l'utilisé en dehors de la classe panthère</p> 
        * @return equipe de la panthère
        */
	public Equipe getEquipe(){
		return equipe;
	}
	
	/**
        * <p>retourne la couleur de la panthère</p>
        * @return <code> ROUGE </code> si l'équipe de la panthère est LES_ROUGES 
        * @return <code> NOIR </code> sinon
        */
	public Couleur getCouleur(){
		if(equipe == Equipe.LES_ROUGES){
			return Couleur.ROUGE;
		}
		
		return Couleur.NOIR;
	}
	
	/**
         * <p>retourne le rang de la panthère et permet de l'utilisé en dehors de la classe panthère</p>
         * @return rang de la panthère qui est CINQ
         */
	public Rang getRang(){
		return CINQ;
	}
	
	/**
	 * <p>retourne l'état de la panthère et permet de l'utilisé en dehors de la classe panthère</p>
	 * @return etat de la panthère 
	 */
	public boolean etat(){
		return etat;
	}
	
	/**
	 * <p>retourne si la panthère peut nager ou pas et permet de l'utiliséen dehors de la classe panthère</p>
	 * @return false car la panthère ne peut pas nager
	 */
	public boolean nage(){
		return false;
	}
	
	/**
	 * <p>retourne si la panthère peut sauter ou pas et permet de l'utiliséen dehors de la classe panthère</p>
	 * @return false car la panthère ne peut pas sauter
	 */
	public boolean saute(){
		return true;
	}
	
	/**
	 * <p>retourne la position x de la panthère et permet de l'utiliséen dehors de la classe panthère</p>
	 * @return x
	 */
	public int getX(){
		return x;
	}
	
	/**
	 * <p>retourne la position y de la panthère et permet de l'utiliséen dehors de la classe panthère</p>
	 * @return y
	 */
	public int getY(){
		return y;
	}
	
	/**
	 * <p>permet de modifier la position x de la panthère</p>
	 */
	public void setX(int x){
		this.x = x;
	}
	
	/**
	 * <p>permet de modifier la position y de la panthère</p>
	 */
	public void setY(int Y){
		this.y = y;
	}
	
	/**
         * <p>Un constructeur qui permet de creer des panthères</p> 
         * @param e qui caractérise l'équipe de la panthère 
         * @param v qui caractérise l'état de la panthère 
         */
	public Lion(Equipe e, boolean v){
		this.equipe = e;
		this.etat = v;
	}	
	
}