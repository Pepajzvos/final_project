
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pocet = 0;
		int pocet1 = 0;
		String[] pole = {"krakatit", "traktor", "auto", "mravenec", "baterka", "rez", "srnka", "leporelo", "auto", "mravenec", "Auto", "automobil", "traktor", "auto"};
		System.out.println("pole má celkem: " + pole.length + " prvkù");
		for(int i = 0; i < 14; i++) {
			System.out.print(" " + pole[i] + " ");
			if(pole[i].equalsIgnoreCase("Auto")) {
				pocet++;
			}else if(pole[i].length() == 7) {
				pocet1++;
			}
		}
		System.out.println();
		System.out.println("slovo auto je tam: " + pocet);
		System.out.println("Pocet slov se sedmi pismeny je: " + pocet1);
		
		
		Zvire[] zvirata = { new Pes(7, 35.4,"vlcak" ), new Pes( 3, 15,"jezevcik"), new Kocka( 4, 4.5,"Micka"),new Kocka( 2, 3,"Mourek"), new Pes( 4, 45.3,"tibetska doga"), new Pes( 6, 18,"kolie"), new Kocka( 3, 2.8,"Liza"), new Pes( 10, 20,"dalmatin")};
		int pocet2 = 0;
		int nejmladsi = Integer.MAX_VALUE;
	
		for(int i = 0; i < zvirata.length; i++) {
			System.out.print(" " + zvirata[i].zvuk() + " ");
		if(zvirata[i] instanceof Pes) {
			Pes tmp = (Pes) zvirata[i];
			if(tmp.getRasa().equalsIgnoreCase("jezevcik")) {
				pocet2++;
			}
		}
		if(zvirata[i].getVek() < nejmladsi) {
			nejmladsi = zvirata[i].getVek();
		}	
		}
		
		
			
		
		System.out.println();
		System.out.println("Pocet jezevciku je: " + pocet2);
		System.out.println("Nejmladsimu zvireti je: " + nejmladsi);
		
		
		
		
		
		
		
	}

}
