import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// A
		Random r = new Random();
		int prumer =0;
		int soucet = 0;
		int jedna = 0;
		 int[] cislo = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1 };
		for(int i= 0; i < cislo.length ; i++) {
		int p =	r.nextInt(200)-100;
		cislo[i] += p;
		System.out.print(cislo[i] + ", ");
		if(cislo[i] > 0) {
			prumer++;
			soucet = cislo[i];
		}else if(cislo[i] > -10 && cislo[i] < 10) {
			jedna = cislo[i];
			
		}
		}
		System.out.println();
		System.out.println("prumer je: " + (double)soucet/prumer);
		System.out.println();
		
		
		
		
		
		//cv2
		
		int nej = Integer.MAX_VALUE;
		Obydli[] pole = {new Maringotka (120,2,50), new Obydli(320,5),new Maringotka (125,3,75),new Obydli (200,4),new Maringotka (80,1,85)
				
		};
		
		
		for(int i = 0; i < pole.length; i++) {
			System.out.print(pole[i] + ", ");
			if(pole[i].getPocha() < nej) {
				nej = pole[i].getPocha();
			}
		}
		System.out.println();
		System.out.println("Nejmenší plocha je: " + nej);
		
		
		
	}

}
