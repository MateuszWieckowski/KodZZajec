package pl.sda.kolkoikrzyzyk;

import java.util.HashMap;
import java.util.Map;

public class KolkoIKrzyzyk {

	public static void main(String[] args) {

		GraInterface graInterface = new GraInterface();
		int menu = graInterface.menu();
		Plansza plansza = new Plansza();

		Map<String, String> mapaGraczy = new HashMap<>();

		String gracz1 = graInterface.imie();
		String gracz2 = graInterface.imie();

		mapaGraczy.put(gracz1, "x");
		mapaGraczy.put(gracz2, "o");

		for (int i = 0; i < 9; i++) {

			graInterface.pokazPlansze(plansza);
			boolean czyWstawiono;
			String aktualnyGracz = null;
			String wstawianyZnak = null;

			if (i % 2 == 0) {

				aktualnyGracz = gracz1;
			} else {

				aktualnyGracz = gracz2;
			}
			wstawianyZnak = mapaGraczy.get(aktualnyGracz);
			do {

				int pozycja = graInterface.podajPole(aktualnyGracz);
				czyWstawiono = plansza.wstawZnak(wstawianyZnak, pozycja);

				if (!czyWstawiono) {

					graInterface.podanoNiePoprawnePole();
				}
			} while (!czyWstawiono);

		}
		graInterface.pokazPlansze(plansza);

		/*
		 * System.out.println(" | | "); System.out.println("-----");
		 * System.out.println(" | | "); System.out.println("-----");
		 */

	}

}
