package Etape1;

/**
 * The Interface Files.
 *
 * @param <T> the generic type
 */
public interface Files<T> {
	
	/**
	 * Est vide.
	 *
	 * @return true, if successful
	 */
	default boolean estVide(){
		return true;
	};
	
	/**
	 * Dernier element.
	 *
	 * @return the t
	 */
	default T dernierElement(){
		return null;
	}

}
