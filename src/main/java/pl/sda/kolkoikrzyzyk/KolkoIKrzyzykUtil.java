package pl.sda.kolkoikrzyzyk;

public class KolkoIKrzyzykUtil {

	public static boolean isDigit(String text) {

		char[] tablica = text.toCharArray();

		if (tablica.length > 1) {

			return false;
		}

		char znak = tablica[0];

		if (znak >= 49 && znak <= 57) {

			return true;
		}

		return false;
	}
}
