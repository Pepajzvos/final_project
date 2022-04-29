import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random r = new Random();
		ArrayList<Kostka> list =  new ArrayList<Kostka>();
		ArrayList<Kostka> list2 =  new ArrayList<Kostka>();
		for(int i = 0; i < 7;i++) {
			int cislo1 = r.nextInt(7);
			int cislo2 = r.nextInt(7);
			list.add(new Kostka(cislo1,cislo2));
		}
		System.out.println("Toto jsou tvoje hrací kostièky: " +list);
		System.out.println();
		for(Kostka k2 : list) {
			k2.zmena();
			
		}
		list2.add(list.get(2));
		System.out.println(list2);
		System.out.println();
		System.out.println(list);
		
	}

}
