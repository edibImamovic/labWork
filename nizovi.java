package zadaca0112;

import java.util.Scanner;

public class zadatakCetiri {

	public static void main(String[] args) {
	Scanner unos = new Scanner(System.in);
		System.out.println("unesite broj clanova u nizu");
		int brojClanova = unos.nextInt();
		
		int[] edib = new int[brojClanova];
		
		edib = funkcija(edib);
		
		for (int i=0; i<edib.length; i++){
		System.out.print(edib[i] + " ");
		}
		}

	private static int[] funkcija(int[] edib) {
		Scanner unos = new Scanner(System.in);
		int[] goga = new int[edib.length];
		for (int i=0; i<edib.length; i++){
			goga [i] = unos.nextInt();
		}
		return goga;
	}
	}
		
