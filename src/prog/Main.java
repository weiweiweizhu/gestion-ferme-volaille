package prog;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int choix;
		boolean continuer = true;

		while (continuer) {
			boolean sousMenuActif = true;
			Tools.init();
			choix = in.nextInt();

			switch (choix) {

			case 0:
				Tools.bye();
				continuer = false;
				break;

			case 1:
				while (sousMenuActif) {
					Tools.menu1();
					int choix2 = in.nextInt();

					switch (choix2) {
					case 0:
						sousMenuActif = false;
						break;
					case 1:
						Tools.ajouterPoulet();
						break;
					case 2:
						Tools.ajouterCanard();
						break;
					case 3:
						Tools.ajouterPaon();
						break;
					case 4:
						Tools.ajouterCygne();
						break;
						
					default:
						Tools.err();
						break;
					}
				}
				break;

			case 2:
				while (sousMenuActif) {
					Tools.menu2();
					int choix2 = in.nextInt();

					switch (choix2) {
					case 0:
						sousMenuActif = false;
						break;
					case 1:
						Tools.modifierPoidsPoulet();
						break;
					case 2:
						Tools.modifierPoidsCanard();
						break;
					default:
						Tools.err();
						break;
					}
				}
				break;

			case 3:
				while (sousMenuActif) {
					Tools.menu3();
					int choix2 = in.nextInt();

					switch (choix2) {
					case 0:
						sousMenuActif = false;
						break;
					case 1:
						Tools.modifierPrixPoulet();
						break;
					case 2:
						Tools.modifierPrixCanard();
						break;
					default:
						Tools.err();
						break;
					}
				}
				break;

			case 4:
				Tools.modifierPoidsVolaille();
				break;

			case 5:
				Tools.checkNb();
				break;

			case 6:
				Tools.checkPrix();
				break;

			case 7:
				Tools.vendreVolaille();
				break;

			case 8:
				Tools.rendrePaon();
				break;

			case 9:
				while (sousMenuActif) {
					Tools.menu9();
					int choix2 = in.nextInt();

					switch (choix2) {
					case 0:
						sousMenuActif = false;
						break;
					case 1:
						Tools.listerNonAbattable();
						break;
					case 2:
						Tools.listerAbattable();
						break;
					default:
						Tools.err();
						break;
					}
				}
				break;
				
			default:
				Tools.err();
				break;
			}

		}

	}

}
