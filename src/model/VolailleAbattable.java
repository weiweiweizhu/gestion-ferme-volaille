package model;

import java.util.ArrayList;

public abstract class VolailleAbattable extends Volaille implements Comparable<VolailleAbattable> {

	private double poids;
	private static ArrayList<VolailleAbattable> volailleAbattable = new ArrayList<>();

	public VolailleAbattable(double poids) {
		this.poids = poids;
		volailleAbattable.add(this);
	}

	public double getPoids() {
		return poids;
	}

	public void setPoids(double poids) {
		this.poids = poids;
	}

	public static ArrayList<VolailleAbattable> getVolailleAbattable() {
		return volailleAbattable;
	}

	@Override
	public int compareTo(VolailleAbattable o) {
		if (this.getPoids() > o.getPoids()) {
			return -1;
		} else if (this.getPoids() == o.getPoids()) {
			return 0;
		} else {
			return 1;
		}
	}

	@Override
	public String toString() {
		return "ID : " + this.getId() + "\tPoids : " + this.poids;
	}

}
