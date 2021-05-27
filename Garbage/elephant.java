/**
* <p>Une classe java nommée Panthere qui permet de représenter les élephants 
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
* @author Amine KHEDDAOUI 11807877
*/


public class Elephant{
	/* attributs */
	
	/**
	 * <p>La couleur de la élephant</p>
	 */
	private Couleur couleur;
	
	/**
	 *<p>Le rang de la élephant</p>
	 */
	private Rang rang;
	
	/**
	 *<p>L'équipe de la élephant</p>
	 */
	private Equipe equipe;
	
	/**
	 *<p>L'état de la élephant vivante ou morte</p>
	 */
	private boolean etat;
	
	/**
	 *<p>Si la élephant peut nager ou pas</p>
	 */
	private boolean nage;
	
	/**
	 *<p>Si la élephant peut sauter ou pas</p>
	 */
	private boolean saute;
	
	/**
	 * <p>La position x de la élephant</p>
	 */
	private int x;
	
	/**
	 * <p>La position y de la élephant</p>
	 */
	private int y;
	
	/**
        * <p>retourne l'équipe de la élephant et permet de l'utilisé en dehors de la classe élephant</p> 
        * @return equipe de la élephant
        */
	public Equipe getEquipe(){
		return equipe;
	}
	
	/**
        * <p>retourne la couleur de la élephant</p>
        * @return <code> ROUGE </code> si l'équipe de la élephant est LES_ROUGES 
        * @return <code> NOIR </code> sinon
        */
	public Couleur getCouleur(){
		if(equipe == Equipe.LES_ROUGES){
			return Couleur.ROUGE;
		}
		
		return Couleur.NOIR;
	}
	
	/**
         * <p>retourne le rang de la élephant et permet de l'utilisé en dehors de la classe élephant</p>
         * @return rang de la élephant qui est CINQ
         */
	public Rang getRang(){
		return CINQ;
	}
	
	/**
	 * <p>retourne l'état de la élephant et permet de l'utilisé en dehors de la classe élephant</p>
	 * @return etat de la élephant 
	 */
	public boolean etat(){
		return etat;
	}
	
	/**
	 * <p>retourne si la élephant peut nager ou pas et permet de l'utiliséen dehors de la classe élephant</p>
	 * @return false car la élephant ne peut pas nager
	 */
	public boolean nage(){
		return false;
	}
	
	/**
	 * <p>retourne si la élephant peut sauter ou pas et permet de l'utiliséen dehors de la classe élephant</p>
	 * @return false car la élephant ne peut pas sauter
	 */
	public boolean saute(){
		return false;
	}
	
	/**
	 * <p>retourne la position x de la élephant et permet de l'utiliséen dehors de la classe élephant</p>
	 * @return x
	 */
	public int getX(){
		return x;
	}
	
	/**
	 * <p>retourne la position y de la élephant et permet de l'utiliséen dehors de la classe élephant</p>
	 * @return y
	 */
	public int getY(){
		return y;
	}
	
	/**
	 * <p>permet de modifier la position x de la élephant</p>
	 */
	public void setX(int x){
		this.x = x;
	}
	
	/**
	 * <p>permet de modifier la position y de la élephant</p>
	 */
	public void setY(int Y){
		this.y = y;
	}
	
	/**
         * <p>Un constructeur qui permet de creer des élephants</p> 
         * @param e qui caractérise l'équipe de la élephant 
         * @param v qui caractérise l'état de la élephant 
         */
	public Elephant(Equipe e, boolean v){
		this.equipe = e;
		this.etat = v;
	}	
	
}
	
	
