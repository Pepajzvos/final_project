import java.util.Scanner;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		 
		int cena = 0;
		int cena2 = 0;
		int cena3 = 0;
		int cena4 = 0;
		int cena5 = 0;
		String nazev = "";
		String nazev2 = "";
		String nazev3 = "";
		String nazev4 = "";
		String nazev5 = "";
		 
		System.out.println("Napište název potraviny");
		nazev = sc.next();
		System.out.println("Napište cenu potraviny");
		cena = sc.nextInt();
		System.out.println("Napište název další potraviny");
		nazev2 = sc.next();
		System.out.println("Napište cenu další potraviny");
		cena2 = sc.nextInt();
		System.out.println("Napište název další potraviny");
		nazev3 = sc.next();
		System.out.println("Napište cenu další potraviny");
		cena3 = sc.nextInt();
		System.out.println("Napište název další potraviny");
		nazev4 = sc.next();
		System.out.println("Napište cenu další potraviny");
		cena4 = sc.nextInt();
		System.out.println("Napište název další potraviny");
		nazev5 = sc.next();
		System.out.println("Napište cenu další potraviny");
		cena5 = sc.nextInt();
		
		if(cena > cena2 && cena > cena3 && cena > cena4 && cena > cena5) {
			System.out.println("Nejdražší potravina je: " + nazev + " a její cena je: " + cena);
		}else if(cena2 > cena && cena2 > cena3 && cena2 > cena4 && cena2 > cena5) {
			System.out.println("Nejdražší potravina je: " + nazev2 + " a její cena je: " + cena2);
		}else if(cena3 > cena && cena3 > cena2 && cena3 > cena4 && cena3 > cena5) {
			System.out.println("Nejdražší potravina je: " + nazev3 + " a její cena je: " + cena3);
		}else if(cena4 > cena && cena4 > cena2 && cena4 > cena3 && cena4 > cena5) {
			System.out.println("Nejdražší potravina je: " + nazev4 + " a její cena je: " + cena4);
		}else if(cena5 > cena && cena5 > cena2 && cena5 > cena3 && cena5 > cena4) {
			System.out.println("Nejdražší potravina je: " + nazev5 + " a její cena je: " + cena5);
		}
		
		
		
		Kostka k = new Kostka();
		boolean funguj = true;
		int ope = 0;
		
		while(funguj) {
			System.out.println("[1] šestistìnná");
			System.out.println("[2] osmistìnná");
			System.out.println("[3] desetistìnná");
			System.out.println("[4] dvacetistìnná");
			System.out.println();
			ope = sc.nextInt();
		
		if(ope == 1) {
			k.setSteny(6);
			k.hod();
		}else if(ope == 2) {
			k.setSteny(8);
			k.hod();
		}else if(ope == 3) {
			k.setSteny(10);
			k.hod();
		}else if(ope == 4) {
			k.setSteny(20);
			k.hod();
		}
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
