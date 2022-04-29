import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cislo1 = 0; 
		int cislo2 =0;
		
		Scanner sc = new Scanner(System.in);
		boolean lk = true;
		boolean kl = true;
	
		while(lk) {
			System.out.println("Napis kolikateho je");
			 cislo1 = sc.nextInt();
			 if(cislo1 <= 30) {
				lk = false ;
			 }
		}
		
		while(kl) {
		System.out.println("Napis cislo mesice");
		 cislo2 = sc.nextInt();
		 if(cislo2 <=12) {
			 kl = false;
		 }
		}
		
		System.out.println("Napiste rok");
		int cislo3 = sc.nextInt();
		
		
		
		Datum d1 = new Datum(cislo1 ,cislo2, cislo3);
		
		System.out.println("Datum je: " + d1.getDen() + "." + d1.getMesic() + "." + d1.getRok());
		
		//cv2
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
