package prog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import model.Canard;
import model.Cygne;
import model.Paon;
import model.Poulet;
import model.Volaille;
import model.VolailleAbattable;
import model.VolailleNonAbattable;

public class Tools {

	private static ArrayList<Volaille> ferme = new ArrayList<>();
	private static int counterPoulet = 0;
	private static int counterTotal = 0;
	private static int counterCanard = 0;
	private static int counterPaon = 0;
	private static int counterCygne = 0;

	public static void init() {
		System.out.println("0 - Quiter le program");
		System.out.println("1 - Ajouter une volaille");
		System.out.println("2 - Modifier poids abattage");
		System.out.println("3 - Modifier prix du jour");
		System.out.println("4 - Modifier poids d'une volaille");
		System.out.println("5 - Voir le nombre de volailles par type");
		System.out.println("6 - Voir le total de prix des volailles abattables");
		System.out.println("7 - Vendre une volaille");
		System.out.println("8 - Rendre un paon au parc");
		System.out.println("9 - Lister les volailles dans la ferme");
	}

	public static void err() {
		System.out.println("Votre saisie n'est pas correcte");
	}

	public static void bye() {
		System.out.println("Au revoir");
	}

	public static void menu1() {
		System.out.println("0 - Quiter le program");
		System.out.println("1 - Ajouter un poulet");
		System.out.println("2 - Ajouter un canard");
		System.out.println("3 - Ajouter un paon");
		System.out.println("4 - Ajouter un cygne");
	}

	public static void ajouterPoulet() {
		if (counterTotal >= Volaille.getMaxtotal()) {
			System.out.println("Votre ferme est complet");
			return;
		}

		if (counterPoulet >= Poulet.getMaxpoulet()) {
			System.out.println("Vous ne pouvez plus ajouter le poulet");
			return;
		}

		System.out.println("Entrer le poid de ce poulet");
		Scanner in = new Scanner(System.in);
		double poids = in.nextDouble();
		Volaille v = new Poulet(poids);
		ferme.add(v);
		counterPoulet++;
		counterTotal++;
		if (counterPoulet <= Poulet.getMaxpoulet() && counterTotal <= Volaille.getMaxtotal()) {
			System.out.println("Ce poulet est enreigistre. \nID : " + v.getId() + "\tPoid : " + poids);
		}
	}

	public static void ajouterCanard() {
		if (counterTotal >= Volaille.getMaxtotal()) {
			System.out.println("Votre ferme est complet");
			return;
		}

		if (counterCanard >= Canard.getMaxcanard()) {
			System.out.println("Vous ne pouvez plus ajouter le canard");
			return;
		}

		System.out.println("Entrer le poid de ce canard");
		Scanner in = new Scanner(System.in);
		double poids = in.nextDouble();
		Volaille v = new Canard(poids);
		ferme.add(v);
		counterCanard++;
		counterTotal++;
		if (counterCanard <= Canard.getMaxcanard() && counterTotal <= Volaille.getMaxtotal()) {
			System.out.println("Ce canard est enreigistre. \nID : " + v.getId() + "\tPoid : " + poids);
		}
	}

	public static void ajouterPaon() {
		if (counterTotal >= Volaille.getMaxtotal()) {
			System.out.println("Votre ferme est complet");
			return;
		}

		if (counterPaon >= Paon.getMaxpaon()) {
			System.out.println("Vous ne pouvez plus ajouter le paon");
			return;
		}

		Volaille v = new Paon();
		ferme.add(v);
		counterPaon++;
		counterTotal++;
		if (counterPaon <= Paon.getMaxpaon() && counterTotal <= Volaille.getMaxtotal()) {
			System.out.println("Ce paon est enreigistre. \nID : " + v.getId());
		}
	}

	public static void ajouterCygne() {
		if (counterTotal >= Volaille.getMaxtotal()) {
			System.out.println("Votre ferme est complet");
			return;
		}

		if (counterCygne >= Cygne.getMaxcygne()) {
			System.out.println("Vous ne pouvez plus ajouter le cygne");
			return;
		}

		Volaille v = new Cygne();
		ferme.add(v);
		counterCygne++;
		counterTotal++;
		if (counterCygne <= Cygne.getMaxcygne() && counterTotal <= Volaille.getMaxtotal()) {
			System.out.println("Ce cygne est enreigistre. \nID : " + v.getId());
		}
	}

	public static void menu2() {
		System.out.println("0 - Quiter le program");
		System.out.println("1 - Modifier le poids abattable du poulet");
		System.out.println("2 - Modifier le poids abattable du canard");
	}

	public static void modifierPoidsPoulet() {
		System.out.println("Entrez le nouveau poids abattable");
		Scanner in = new Scanner(System.in);
		double poids = in.nextDouble();
		Poulet.setPoidsPouletAbattable(poids);
		System.out.println("Votre modification est validee.\nLe poids abattable du poulet est " + poids);
	}

	public static void modifierPoidsCanard() {
		System.out.println("Entrez le nouveau poids abattable");
		Scanner in = new Scanner(System.in);
		double poids = in.nextDouble();
		Canard.setPoidsCanardAbattable(poids);
		System.out.println("Votre modification est validee.\nLe poids abattable du canard est " + poids);
	}

	public static void menu3() {
		System.out.println("0 - Quiter le program");
		System.out.println("1 - Modifier le prix du jour du poulet");
		System.out.println("2 - Modifier le prix du jour du canard");
	}

	public static void modifierPrixPoulet() {
		System.out.println("Entrez le nouveau prix du jour pour poulet");
		Scanner in = new Scanner(System.in);
		double prix = in.nextDouble();
		Poulet.setPrixPoulet(prix);
		System.out.println("Votre modification est validee.\nLe prix du poulet est " + prix);
	}

	public static void modifierPrixCanard() {
		System.out.println("Entrez le nouveau prix du jour pour canard");
		Scanner in = new Scanner(System.in);
		double prix = in.nextDouble();
		Canard.setPoidsCanardAbattable(prix);
		System.out.println("Votre modification est validee.\nLe prix du canard est " + prix);
	}

	public static void modifierPoidsVolaille() {
		System.out.println("Entrez l'ID de volaille que vous voulez modifier");
		Scanner in = new Scanner(System.in);
		int id = in.nextInt();

		for (VolailleAbattable vol : VolailleAbattable.getVolailleAbattable()) {
			if (vol.getId() == id) {
				System.out.println("Veuillez entrer le nouveau poids de ce volaille");
				int poids = in.nextInt();
				vol.setPoids(poids);
				System.out.println("Votre modification est validee.\nLe poids de ce volaille est " + poids);
				return;
			}
		}
		System.out.println("Le poids de ce volaille ne peut pas etre modifier");
	}

	public static void checkNb() {
		int nbPoulet = 0;
		int nbCanard = 0;
		int nbPaon = 0;
		int nbCygne = 0;
		for (Volaille vol : Volaille.getVolaille()) {
			if (vol instanceof Poulet) {
				nbPoulet++;
			} else if (vol instanceof Canard) {
				nbCanard++;
			} else if (vol instanceof Paon) {
				nbPaon++;
			} else if (vol instanceof Cygne) {
				nbCygne++;
			}
		}
		System.out.println("Vouz avez en ce moment dans la ferme :\nPoulet : " + nbPoulet + "\nCanard : " + nbCanard
				+ "\nPaon : " + nbPaon + "\nCygne : " + nbCygne);
	}

	public static void checkPrix() {
		int nbPoulet = 0;
		int nbCanard = 0;
		int poidsPoulet = 0;
		int poidsCanard = 0;

		for (VolailleAbattable vol : VolailleAbattable.getVolailleAbattable()) {
			if (vol instanceof Poulet && vol.getPoids() >= Poulet.getPoidsPouletAbattable()) {
				nbPoulet++;
				poidsPoulet += vol.getPoids();
			} else if (vol instanceof Canard && vol.getPoids() >= Canard.getPoidsCanardAbattable()) {
				nbCanard++;
				poidsCanard += vol.getPoids();
			}
		}

		double total = poidsPoulet * Poulet.getPrixPoulet() + poidsCanard * Canard.getPrixCanard();
		String strp = (nbPoulet >= 0 || nbPoulet <= 1) ? " poulet peut" : " poulets peuvent";
		String strc = (nbCanard >= 0 || nbCanard <= 1) ? " canard peut" : " canards peuvent";

		System.out.println("Vous avez " + nbPoulet + strp + " etre vendre et " + nbCanard + strc + " etre vendre");
		System.out.println("Le total de prix pour les volailles abattables est : " + total + " euro");
	}

	public static void vendreVolaille() {
		System.out.println("Entrez l'ID de volaille que vous voulez vendre");
		Scanner in = new Scanner(System.in);
		int id = in.nextInt();

		for (int i = 0; i < Volaille.getVolaille().size(); i++) {
			if (Volaille.getVolaille().get(i).getId() == id && (Volaille.getVolaille().get(i) instanceof Canard
					|| Volaille.getVolaille().get(i) instanceof Poulet)) {
				Volaille.getVolaille().remove(i);

				for (int j = 0; j < VolailleAbattable.getVolailleAbattable().size(); j++) {
					if (VolailleAbattable.getVolailleAbattable().get(j).getId() == id) {
						VolailleAbattable.getVolailleAbattable().remove(j);
					}
				}
				System.out.println("Le volaille est supprime de votre ferme");
				return;
			}

		}
		System.out.println("Ce n'est pas pour le parc");

	}

	public static void rendrePaon() {
		System.out.println("Entrez l'ID de volaille que vous voulez rendre");
		Scanner in = new Scanner(System.in);
		int id = in.nextInt();

		for (int i = 0; i < Volaille.getVolaille().size(); i++) {
			if (Volaille.getVolaille().get(i).getId() == id && (Volaille.getVolaille().get(i) instanceof Paon
					|| Volaille.getVolaille().get(i) instanceof Cygne)) {
				Volaille.getVolaille().remove(i);

				for (int j = 0; j < VolailleNonAbattable.getVolailleNonAbattable().size(); j++) {
					if (VolailleNonAbattable.getVolailleNonAbattable().get(j).getId() == id) {
						VolailleNonAbattable.getVolailleNonAbattable().remove(j);
					}
				}
				System.out.println("Le volaille est supprime de votre ferme");
				return;
			}

		}
		System.out.println("Ce n'est pas pour le parc");

	}

	public static void menu9() {
		System.out.println("0 - Quiter le program");
		System.out.println("1 - Lister les volailles gardees pour les parcs");
		System.out.println("2 - Lister les volailles abattables");
	}

	public static void listerAbattable() {
		Collections.sort(VolailleAbattable.getVolailleAbattable());
		System.out.println("------- Info volailles abattables -------");
		for (VolailleAbattable vol : VolailleAbattable.getVolailleAbattable()) {
			System.out.println(vol);
		}

	}

	public static void listerNonAbattable() {
		Collections.sort(VolailleNonAbattable.getVolailleNonAbattable());

		System.out.println("------- Info volailles gardees -------");
		for (VolailleNonAbattable vol : VolailleNonAbattable.getVolailleNonAbattable()) {
			System.out.println(vol);
		}

	}

}