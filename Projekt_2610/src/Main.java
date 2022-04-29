import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Napis cislo: ");
		int cislo1 = sc.nextInt();
		
		if(cislo1%2 == 0) {
			System.out.println("Cislo je sude");
		}
		
		else {
			System.out.println("Cislo je liche");
		}
		
		System.out.println("Jak dlouhe je akvarium : ");
		int cislo2 = sc.nextInt();
		System.out.println("Jak siroke je akvarium : ");
		int cislo3 = sc.nextInt();
		System.out.println("Jak vysoke je akvarium : ");
		int cislo4 = sc.nextInt();
		System.out.println("Kolik litru vody tam date : ");
		int cislo5 = sc.nextInt();
		Akvarium a1 = new Akvarium(cislo2,cislo3,cislo4,cislo5);
		System.out.println(a1.pravda());
		
		int cislo0 = 10;
		
		Ctverec c1 = new Ctverec(cislo0);
		System.out.println("Obvod ctverce je: " + c1.obvod() + " a obsah je: " + c1.obsah());
		
		System.out.println("Zadej stranu ctverce :");
		int cislo6 = sc.nextInt();
		c1.setStrana(cislo6);
		System.out.println("Nova strana je: " + cislo6 + " a jeho obvod je: " + c1.obvod() + " a obsah je: " + c1.obsah());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
