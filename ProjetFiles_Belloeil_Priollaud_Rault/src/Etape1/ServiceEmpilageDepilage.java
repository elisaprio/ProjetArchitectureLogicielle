package Etape1;

/**
 * The Interface ServiceEmpilageDepilage.
 *
 * @param <T> the generic type
 */
public interface ServiceEmpilageDepilage<T> {
	
	/**
	 * Empiler.
	 *
	 * @param t the t
	 */
	void empiler(T t);
	
	/**
	 * Depiler.
	 *
	 * @return the t
	 */
	T depiler();
}
