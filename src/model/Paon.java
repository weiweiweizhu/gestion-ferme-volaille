package model;

public class Paon extends VolailleNonAbattable {

	private static final int MAXPAON = 3;

	@Override
	public int compareTo(VolailleNonAbattable o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return super.toString() + "\tType : Cygne";
	}

	public static int getMaxpaon() {
		return MAXPAON;
	}
	
}
