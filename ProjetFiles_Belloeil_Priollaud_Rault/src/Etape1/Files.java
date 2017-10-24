package Etape1;

public interface Files<T> {

	default boolean isEmpty(){
		return true;
	};
	
	default T dernierElement(){
		return null;
	}
}
