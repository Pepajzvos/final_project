import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// cv 1
		
		ArrayList<String> list = new ArrayList<>();
		list.add("Leden");
		list.add("�nor");
		list.add("B�ezen");
		list.add("Duben");
		list.add("Kv�ten");
		list.add("�erven");
		list.add("�ervenec");
		list.add("Srpen");
		list.add("Z���");
		list.add("��jen");
		list.add("Listopad");
		list.add("Prosinec");		
		
		
		
		for(int i = 0; i < list.size(); i++) {
		if(list.get(i).length() >= 5) {
			System.out.print(list.get(i) + " ");
		}
		}
		System.out.println();
		
		
		// cv 2
		ArrayList<Kosik> list2 = new ArrayList<>();
		list2.add(new Kosik("Rohlik",2,4));
		list2.add(new Kosik("chleba",30,500));
		list2.add(new Kosik("Cocacola",25,300));
		list2.add(new Kosik("Pivo",13,500));
		list2.add(new Kosik("Maslo",20,500));
		list2.add(new Kosik("drozdi",12,15));
		for(int i=0;i < list2.size();i ++) {
			System.out.print("Cena: " + list2.get(i).getCena() + ", ");
		}
		System.out.println();
		System.out.println("V ko��ku je: " + list2.size() + " p�edm�t�");
		
	}

}
