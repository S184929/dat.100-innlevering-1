package no.hvl.dat100;

import java.util.Scanner;

public class OppgaveO1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double trinn1= 0.017;
		double trinn2= 0.04;
		double trinn3= 0.136;
		double trinn4= 0.166;
		double trinn5= 0.176;
		
		
		
		System.out.print("Skriv inn din bruttoinntekt");
		double inntekt = scanner.nextDouble();
		
		if (inntekt <= 208050) {
			System.out.println("Ingen trinnskattskatt. Bruttoinntekten din er:" + inntekt+ "kr");
		} else if (inntekt >= 208050 && inntekt <= 292851) {	
			System.out.println("Bruttoinntekten din er: " + inntekt + "kr"+ " og Trinnskatten din er " + (inntekt*trinn1)+ "kr");
		} else if (inntekt >= 292851 && inntekt <= 670000 ) {	
			System.out.println("Bruttoinntekten din er: " + inntekt + "kr"+ " og Trinnskatten din er " + (inntekt*trinn2)+ "kr");
		} else if (inntekt >= 670000 && inntekt <= 937900) {	
			System.out.println("Bruttoinntekten din er: " + inntekt + "kr"+ " og Trinnskatten din er " + (inntekt*trinn3)+ "kr"); 
	    } else if (inntekt >= 937000 && inntekt <= 1350000) {	
				System.out.println("Bruttoinntekten din er: " + inntekt + "kr"+ " og Trinnskatten din er " + (inntekt*trinn4)+ "kr" );
	    } else  {	
			System.out.println("Bruttoinntekten din er: " + inntekt + "kr"+ " og Trinnskatten din er " + (inntekt*trinn5) + "kr");
	    }
			
		
		scanner.close();
		

	}

}


