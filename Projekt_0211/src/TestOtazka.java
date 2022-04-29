
public class TestOtazka {

	private String text;
	private String odpoved1;
	private String odpoved2;
	private String odpoved3;
	private int sodpoved;
	
	public TestOtazka(String t, String o1, String o2, String o3, int so) {
		this.text = t;
		this.odpoved1 = o1;
		this.odpoved2 = o2;
		this.odpoved3 = o3;
		this.sodpoved = so;
	}
	
	public void vypis() {
		System.out.println(this.text);
		System.out.println();
		System.out.println("1)" + this.odpoved1);
		System.out.println();
		System.out.println("2)" + this.odpoved2);
		System.out.println();
		System.out.println("3)" + this.odpoved3);
		
	}
	
	public String sprav(int odpoved) {
		if(odpoved == this.sodpoved) {
			return ("Spravne");
			
		}else {
			return("Spatne");
		}
	}
	
	
	
	
	
	
	
}
