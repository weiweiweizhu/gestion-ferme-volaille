package model;

public class Cygne extends VolailleNonAbattable {

	private static final int MAXCYGNE = 2;

	@Override
	public int compareTo(VolailleNonAbattable o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return super.toString() + "\tType : Cygne";
	}

	public static int getMaxcygne() {
		return MAXCYGNE;
	}
	
}
