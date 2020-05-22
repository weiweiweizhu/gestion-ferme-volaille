package model;

public class Canard extends VolailleAbattable {

	private static final int MAXCANARD = 4;
	private static double poidsCanardAbattable = 5.5;
	private static double prixCanard = 5.5;

	public Canard(double poids) {
		super(poids);
		System.out.println(this.getId());
	}

	public static double getPoidsCanardAbattable() {
		return poidsCanardAbattable;
	}

	public static void setPoidsCanardAbattable(double poidsAbattable) {
		Canard.poidsCanardAbattable = poidsAbattable;
	}

	public static double getPrixCanard() {
		return prixCanard;
	}

	public static void setPrixCanard(double prixCanard) {
		Canard.prixCanard = prixCanard;
	}

	@Override
	public String toString() {
		return super.toString() + "\tType : Canard";
	}

	public static int getMaxcanard() {
		return MAXCANARD;
	}

}
