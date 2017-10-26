package Etape1;

public interface Files<T> {
	
	// methode testant si la file est vide et qui par defaut renvoie False

	default boolean estVide(){
		return true;
	};
	
	// methode retournant le dernier élément de la liste et qui par defaut renvoie null
	
	default T dernierElement(){
		return null;
	}

}
