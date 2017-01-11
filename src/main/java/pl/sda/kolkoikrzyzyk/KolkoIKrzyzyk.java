package pl.sda.kolkoikrzyzyk;

public class KolkoIKrzyzyk {

	public static void main(String[] args) {

		GraInterface graInterface = new GraInterface();
		int menu = graInterface.menu();
		Plansza plansza = new Plansza();

		String gracz1 = graInterface.imie();
		String gracz2 = graInterface.imie();

		int pozycja = graInterface.podajPole(gracz1);
		boolean czyWstawiono = plansza.wstawZnak("x", pozycja);
		System.out.println(plansza.toString());
		int pozycja2 = graInterface.podajPole(gracz2);
		czyWstawiono = plansza.wstawZnak("O", pozycja + 1);
		System.out.println(plansza.toString());
		
		/*
		 * System.out.println(" | | "); System.out.println("-----");
		 * System.out.println(" | | "); System.out.println("-----");
		 */

	}

}
