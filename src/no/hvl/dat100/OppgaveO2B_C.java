package no.hvl.dat100;

import java.util.Scanner;

public class OppgaveO2B_C {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 1; i<=10; i++) {
		System.out.println("Skriv inn poengsum mellom 1 til 100");
		int poengsum = scanner.nextInt();

		if (poengsum > 100 || poengsum < 0) {
			System.out.println("Ugyldig poengsum. Skriv inn ny poengsum");
			continue;
		} 
			if (poengsum >= 90) {
			System.out.println("Student " + i + " sin karakter er A");
			} else if (poengsum >= 80) {
			System.out.println("Student " + i + " sin karakter er B");
			} else if (poengsum >= 70) {
			System.out.println("Student " + i + " sin karakter er C");
			} else if (poengsum >= 60) {
			System.out.println("Student " + i + " sin karakter er D");
			} else if (poengsum >= 50) {
			System.out.println("Student " + i + " sin karakter er E");
			} else  {
			System.out.println("Student " + i + " sin karakter er F");
			
		} 
	}
	
		scanner.close();
				
		}
}

