/**
* <p>Une classe java nommée Chien qui permet de représenter les chiens 
* cette classe est caractérisée par:
* <ul> 
*      <li>une equipe : une instance de la classe enum Equipe valant : </li>
*         <ul>
*              <li> LES_ROUGES </li>
*              <li> LES_NOIRS </li>
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
*              <li> NOIR </li>
*          </ul>
* </ul>
* </p>
* @author Amanda ZANE 11809869
*/


public class Chien{
	/* attributs */
	
	/**
	 * <p>La couleur de la chien</p>
	 */
	private Couleur couleur;
	
	/**
	 *<p>Le rang de la chien</p>
	 */
	private Rang rang;
	
	/**
	 *<p>L'équipe de la chien</p>
	 */
	private Equipe equipe;
	
	/**
	 *<p>L'état de la chien vivante ou morte</p>
	 */
	private boolean etat;
	
	/**
	 *<p>Si la chien peut nager ou pas</p>
	 */
	private boolean nage;
	
	/**
	 *<p>Si la chien peut sauter ou pas</p>
	 */
	private boolean saute;
	
	/**
	 * <p>La position x de la chien</p>
	 */
	private int x;
	
	/**
	 * <p>La position y de la chien</p>
	 */
	private int y;
	
	/**
        * <p>retourne l'équipe de la chien et permet de l'utilisé en dehors de la classe chien</p> 
        * @return equipe de la chien
        */
	public Equipe getEquipe(){
		return equipe;
	}
	
	/**
        * <p>retourne la couleur de la chien</p>
        * @return <code> ROUGE </code> si l'équipe de la chien est LES_ROUGES 
        * @return <code> NOIR </code> sinon
        */
	public Couleur getCouleur(){
		if(equipe == Equipe.LES_ROUGES){
			return Couleur.ROUGE;
		}
		
		return Couleur.NOIR;
	}
	
	/**
         * <p>retourne le rang de la chien et permet de l'utilisé en dehors de la classe chien</p>
         * @return rang de la chien qui est CINQ
         */
	public Rang getRang(){
		return CINQ;
	}
	
	/**
	 * <p>retourne l'état de la chien et permet de l'utilisé en dehors de la classe chien</p>
	 * @return etat de la chien 
	 */
	public boolean etat(){
		return etat;
	}
	
	/**
	 * <p>retourne si la chien peut nager ou pas et permet de l'utiliséen dehors de la classe chien</p>
	 * @return false car la chien ne peut pas nager
	 */
	public boolean nage(){
		return false; //Le chien ne nage pas dans cette variante du jeu
	}
	
	/**
	 * <p>retourne si la chien peut sauter ou pas et permet de l'utiliséen dehors de la classe chien</p>
	 * @return false car la chien ne peut pas sauter
	 */
	public boolean saute(){
		return false;
	}
	
	/**
	 * <p>retourne la position x de la chien et permet de l'utiliséen dehors de la classe chien</p>
	 * @return x
	 */
	public int getX(){
		return x;
	}
	
	/**
	 * <p>retourne la position y de la chien et permet de l'utiliséen dehors de la classe chien</p>
	 * @return y
	 */
	public int getY(){
		return y;
	}
	
	/**
	 * <p>permet de modifier la position x de la chien</p>
	 */
	public void setX(int x){
		this.x = x;
	}
	
	/**
	 * <p>permet de modifier la position y de la chien</p>
	 */
	public void setY(int Y){
		this.y = y;
	}
	
	/**
         * <p>Un constructeur qui permet de creer des chiens</p> 
         * @param e qui caractérise l'équipe de la chien 
         * @param v qui caractérise l'état de la chien 
         */
	public Chien(Equipe e, boolean v){
		this.equipe = e;
		this.etat = v;
	}	
	
}
	
	
