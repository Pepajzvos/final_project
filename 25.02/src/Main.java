import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		ArrayList<String> list = new ArrayList<>();
		list.add("Když vyjdu tyhle schody, tak budu nahoøe");
		list.add("No time to die");
		list.add("S holkou se nemá cenu hádat");
		list.add("Láska je slepá, protože mì nevidí");
		list.add("just do it");
		list.add("fake it till you make it");
		int cislo = r.nextInt(6)+1;
		System.out.println(list.get(cislo));
		System.out.println();
		//cv 2
		ArrayList<Integer> list2 = new ArrayList<>();
		ArrayList<Integer> list3 = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			int cislo2 = r.nextInt(40)-20;
			list2.add(cislo2);
			if(cislo2>= 0) {
				list3.add(cislo2);
			}
		}
		System.out.println(list2);
		System.out.println();
		System.out.println(list3);
		System.out.println();
		
		
			}

}
