package etape0;

// TODO: Auto-generated Javadoc
/**
 * The Interface File.
 */
public interface File {
	
	/**
	 * Tete.
	 *
	 * @return the e
	 */
	//http://www.grall.name/teaching/softwareArchitecture/2018/interfaceDesign.html#orge41c82b
	E tete();
	
	/**
	 * Retirer.
	 *
	 * @return the file
	 */
	File retirer();
	
	/**
	 * Ajouter.
	 *
	 * @param dernier the dernier
	 * @return the file
	 */
	File ajouter(E dernier);

}
