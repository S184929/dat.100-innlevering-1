package no.hvl.dat100;

import java.util.Scanner;

public class OppgaveO2A {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Skriv inn poengsum mellom 1 til 100");
		int poengsum = scanner.nextInt();

		if (poengsum > 100 && poengsum < 0) {
				System.out.println("Ugyldig poengsum. Skriv inn ny poengsum");
		}
 
		int karakter;
		
		if (poengsum >= 90) {
			System.out.println("Karakter A");
		} else if (poengsum >= 80) {
			System.out.println("Karakter B");
		} else if (poengsum >= 70) {
			System.out.println("Karakter C");
		} else if (poengsum >= 60) {
			System.out.println("Karakter D");
		} else if (poengsum >= 50) {
			System.out.println("Karakter E");
		} else  {
			System.out.println("Karakter F");
			
		} 
		
	
		scanner.close();
				
		}
}




