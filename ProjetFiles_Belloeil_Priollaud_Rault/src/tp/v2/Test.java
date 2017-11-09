package tp.v2;


public class Test {
	private static <E extends Liste<E> & ListeMutable<E>> void testListeMutable() {
		Liste<E> liste = Liste.vide();
		System.out.println("Vide? "+liste.casVide());
		
		ListeMutable<E> liste2 = ListeMutable.vide();
		E tete = "tete";
		liste2.changerTete(tete);
		liste2.changerReste(ListeMutable.cons(E t, cons(E t2, ListeMutable.vide())));
		
		
	}
	
	public static void main(String[] args){
		
	}
	
}
