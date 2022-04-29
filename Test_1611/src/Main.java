import java.util.Scanner;
public class Main {
//Skupina B
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Zadejte velikost polomeru valce:");
		double cislo1 = sc.nextDouble();
		System.out.println("Zadejte vysku valce:");
		double cislo2 = sc.nextDouble();
		
		Valec v1 = new Valec(cislo1,cislo2); 
		v1.vypis();
		
		System.out.println("Zadejte velikost polomeru druheho valce:");
		double cislo3 = sc.nextDouble();
		System.out.println("Zadejte vysku druheho valce:");
		double cislo4 = sc.nextDouble();
		
		Valec v2 = new Valec(cislo3,cislo4);
		v2.vypis();
		
		if(v1.Objem()>v2.Objem()) {
			System.out.println("Prvni valec ma vetsi objem");
		}else {
			System.out.println("Druhy valec ma vetsi objem");
		}
		
		Zbran z1 = new Zbran();
		z1.vypis();
		
		System.out.println("Zadej nazev zbrane:");
		String nazev1 = sc.next();
		System.out.println("Zadej kolik je potreba sily na pouzivani:");
		int sila = sc.nextInt();
		System.out.println("Zadej kolik ma poskozeni");
		int pos = sc.nextInt();
		
		Zbran z2 = new Zbran(nazev1, sila, pos);
		z2.vypis();
		
		if(z1.getSila()>z2.getSila() ) {
			System.out.println("Na prvni zbran je potreba vice sily");
		}else {
			System.out.println("Na druhou zbran je potreba vice sily");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
