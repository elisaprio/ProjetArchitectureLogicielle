package tp.v2;


public class Test {
	private static void testListe() {
		System.out.println("-- Tests Listes --");
		Liste<String> vide= Liste.vide();
		Liste<String> liste= Liste.cons("Elisa",Liste.cons("Adele", Liste.cons("Vincent", vide)));
		
		System.out.println("Test casVide() (true si la liste est vide)");
		System.out.println("Expected true "+vide.casVide());
		System.out.println("Expected false "+liste.casVide());
		System.out.println();
		
		System.out.println("Test casCons() (true si la liste n'est pas vide)");
		System.out.println("Expected true "+liste.casCons());
		System.out.println("Expected false "+vide.casCons());
		System.out.println();
		
		System.out.println("Test taille()");
		System.out.println("Expected 0 : " + vide.taille());
		System.out.println("Expected 3 : " + liste.taille());
		System.out.println();
		
		
	}
	
	public static void main(String[] args){
		
	}
	
}
