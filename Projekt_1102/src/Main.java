import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		int prumer = 0;
		int cislo1 = 1;
		int nejv = Integer.MIN_VALUE;
		int soucet = 0;
		while(cislo1 != 0 ) {
			System.out.println("Zadej èíslo: ");
			cislo1 = sc.nextInt();
			if(cislo1 != 0) {
				list.add(cislo1);
				prumer++;
				
				if(cislo1 > nejv) {
					nejv = cislo1;
					
				}
			}
			
		}
		
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
			soucet += list.get(i);
		}
		System.out.println();
		
		
		
		for(int i = 0; i < list.size();i++) {
			if(i % 2 == 0) {
				System.out.print(list.get(i) + " ");
			}
		}
		System.out.println();
		
			System.out.println((double)soucet/prumer);
	
		System.out.println();
		
			System.out.println(nejv);
			System.out.println();
			
			Collections.sort(list);
			for(int i = 0; i < list.size();i++) {
			System.out.print(list.get(i) + " ");
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
