package Etape1;

public interface Files<T> {

	default boolean isEmpty(){
		return false;
	};
	
	default T dernierElement(){
		return null;
	}
}
