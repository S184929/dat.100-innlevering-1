package no.hvl.dat100;

import java.util.Scanner;

public class OppgaveO3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Skriv inn et heltall n>0: ");
		long n =scanner.nextLong();
		
		long resultat = 1;
		for (long i = 2; i<=n; i++) {
			resultat = resultat*i;
			
		}	System.out.println("n! av " + n + " er " + resultat);
		
		
			
			
			scanner.close();
			
		}

	}



