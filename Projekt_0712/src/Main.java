import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cislo = 1;
		int cislo1 = 1;
		int cislo2 = 1;
		
		for(int i = 0;i < 100; i++) {
			System.out.print(cislo + " ");
			cislo++;
		}
		
		System.out.println();
		
		while(cislo1 <= 100) {
			System.out.print(cislo1 + " ");
			cislo1++;
		}
		System.out.println();
		do {
			System.out.print(cislo2 + " ");
			cislo2++;
		}while(cislo2 <= 100);
		//cv2
		Scanner sc = new Scanner(System.in);
		
		System.out.println("napis teplotu v Kelvinech");
		System.out.println("teploty piste dokud nezadate 0");
		System.out.println();
		int t = 1;
		int p =0;
		int soucet = 0;
		int nejnizsi = 100000000;
		int nejvyssi = 0;
		
		while(t>0) {
			System.out.println("teplotu prosim ");
			t = sc.nextInt();
			soucet += t;
			p++;
			if(t > nejvyssi) {
				nejvyssi=t;
				
			}if(t<nejnizsi&&t!=0) {
				nejnizsi=t;
			}
		}
		
		System.out.println("celkem bylo zadano teplot: " + p);
		System.out.println("prumerna teplota v klevinech je : " + (double)soucet/p + " a ve stupnich celsia je: " + (double)((soucet/p)-272));
		System.out.println("nejvyssi teplota je: " + nejvyssi);
		System.out.println("nejnizsi teplota je: " + nejnizsi);
		
		//cv3
		
		
		Ucet u = new Ucet();
		u.setJmeno("Jan Novak");
		u.setZustatek(50000);
		u.setDebet(20000);
		System.out.println("Toto je váš úèet vyberte operaci");
		
		int op = 0;
		int plus = 0;
		int minus = 0;
		boolean funguj = true;
		
		while(funguj) {
			System.out.println("[1] vypsat zustatek");
			System.out.println("[2] vklad");
			System.out.println("[3] vyber");
			System.out.println("[4] konec programu");
			System.out.println();
			op = sc.nextInt();
			
			if(op == 1) {
				System.out.println("Vas zustatek je: " + u.getZustatek());
			}else if(op == 2) {
				System.out.println("Zadejte kolik chcete vlozit:");
				plus = sc.nextInt();
				u.setZustatek(u.getZustatek()+plus);
				System.out.println("Vlozil jste: " + plus + "Kc");
			}else if(op==3) {
				System.out.println("Zadejte kolik chcete vybrat: ");
				minus = sc.nextInt();
				if(minus > (u.getZustatek()+u.getDebet())) {
					System.out.println("Mas malo penez");
					
				}else if(minus<=0) {
					System.out.println("Nulu nevyberes kamo");
					
				}else {
					u.setZustatek(u.getZustatek()-minus);
					System.out.println("Odebral jste castku: " + minus);
				}
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
