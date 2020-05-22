package model;

import java.util.ArrayList;

public abstract class Volaille {

	private int id;
	private static int counter;
	private static final int MAXTOTAL = 7;
	private static ArrayList<Volaille> volaille = new ArrayList<>();


	public Volaille() {
		this.id = ++counter;
		volaille.add(this);
	}

	public int getId() {
		return id;
	}

	public static ArrayList<Volaille> getVolaille() {
		return volaille;
	}

	public static int getMaxtotal() {
		return MAXTOTAL;
	}

}
