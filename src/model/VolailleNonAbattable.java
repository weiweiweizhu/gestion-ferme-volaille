package model;

import java.util.ArrayList;

public abstract class VolailleNonAbattable extends Volaille implements Comparable<VolailleNonAbattable> {
	private static ArrayList<VolailleNonAbattable> volailleNonAbattable = new ArrayList<>();

	public VolailleNonAbattable() {
		volailleNonAbattable.add(this);
	}

	public static ArrayList<VolailleNonAbattable> getVolailleNonAbattable() {
		return volailleNonAbattable;
	}

	public int compareTo(VolailleNonAbattable o) {
		if (this.getId() > o.getId()) {
			return -1;
		} else if (this.getId() == o.getId()) {
			return 0;
		} else {
			return 1;
		}
	}

	@Override
	public String toString() {
		return "ID : " + this.getId();
	}

}
