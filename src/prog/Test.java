package prog;

import model.Canard;
import model.Volaille;

public class Test {
	public static void main(String[] args) {
		Volaille v1 = new Canard(5);
//		Volaille v2 = new Canard();
//		Volaille v3 = new Canard();
		
		Tools.ajouterPoulet();
		Tools.ajouterPoulet();
		Tools.ajouterPoulet();
		Tools.ajouterPoulet();
		Tools.ajouterPoulet();
		Tools.ajouterPoulet();
	}
}
