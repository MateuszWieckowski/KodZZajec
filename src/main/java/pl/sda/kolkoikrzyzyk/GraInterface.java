package pl.sda.kolkoikrzyzyk;

import java.util.Scanner;

public class GraInterface {

	public Integer menu() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("1. Start");
		System.out.println("0. Koniec");

		Integer opcja = scanner.nextInt();
		return opcja;
	}

	public String imie() {

		System.out.println("Podaj swoje imie: ");
		Scanner scanner = new Scanner(System.in);
		String imie = scanner.nextLine();
		return imie;
	}

	public int podajPole(String imie) {

		System.out.println("Grasz " + imie);
		System.out.println("Podaj numer pola: ");

		Scanner scanner = new Scanner(System.in);
		int pozycja = scanner.nextInt();
		return pozycja;

	}
	
	public void pokazPlansze(Plansza plansza){
		
		System.out.println(plansza.toString());
	}
	
	public void podanoNiePoprawnePole(){
		
		System.out.println("Podano niepoprawne pole. Spróbuj jeszcze raz.");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
	}
}
