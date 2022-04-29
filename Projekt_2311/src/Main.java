import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random();
		
		int soucetCisel = 0;
		int maximum = 0; 
		int minimum =0;
		int pocet = 0;
		int pocetKladnych = 0;
		int pocetZapornych = 0;
		int jednocif = 0;
		
		
		for(int i = 0; i < 20; i++) {
			int cislo = r.nextInt(200)-100;
			System.out.print(cislo + " ");
			soucetCisel =+ cislo;
			if(cislo > maximum) {
				maximum = cislo;
			}if(cislo < minimum) {
				minimum = cislo;
			}
			pocet++;
			
			if(cislo > 0) {
				pocetKladnych++;
			}
			if(cislo < 0) {
				pocetZapornych++;
			}
			if(cislo > -9 && cislo < 9) {
				jednocif++;
			}
			
		}
		double ar = soucetCisel/pocet;
		System.out.println();
		System.out.println("Maximum je: " + maximum);
		System.out.println("Minimum je: " + minimum);
		System.out.println("Aritmeticky prumer je: " + ar);
		System.out.println("Pocet kladnych cisel je: " + pocetKladnych + " pocet zapornych je: " + pocetZapornych);
		System.out.println("Jednocifernych cisel je: " + jednocif);
		
		
		
		
		
		
		
		
		
		
		
	}

}
