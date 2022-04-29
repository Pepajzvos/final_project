import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Zadej minimum intervalu");
		int minimum = sc.nextInt();
		System.out.println("Zadej maximum intervalu");
		int maximum = sc.nextInt();
		System.out.println("Zadej hodnotu");
		int hodnota = sc.nextInt();
		
		Interval i1 = new Interval(minimum , maximum, hodnota);
		 System.out.println(i1.hodnota());
		
		System.out.println("Zadej stranu a");
		int a = sc.nextInt();
		System.out.println("Zadej stranu b");
		int b = sc.nextInt();
		System.out.println("Zadej stranu c");
		int c = sc.nextInt();
	
		Trojuhelnik t1 = new Trojuhelnik(a,b,c);
		
		System.out.println(t1.setaveni());
		
		System.out.println(t1.druh());
	
	}
	

}
