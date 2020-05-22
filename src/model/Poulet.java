package model;

public class Poulet extends VolailleAbattable {

	private static final int MAXPOULET = 5;
	private static double poidsPouletAbattable = 3;
	private static double prixPoulet = 3;

	public Poulet(double poids) {
		super(poids);
	}

	public static double getPoidsPouletAbattable() {
		return poidsPouletAbattable;
	}

	public static void setPoidsPouletAbattable(double poidsPouletAbattable) {
		Poulet.poidsPouletAbattable = poidsPouletAbattable;
	}

	public static double getPrixPoulet() {
		return prixPoulet;
	}

	public static void setPrixPoulet(double prixPoulet) {
		Poulet.prixPoulet = prixPoulet;
	}

	@Override
	public int compareTo(VolailleAbattable o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return super.toString() + "\tType : Poulet";
	}

	public static int getMaxpoulet() {
		return MAXPOULET;
	}

}
