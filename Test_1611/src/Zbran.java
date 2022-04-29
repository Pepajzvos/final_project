
public class Zbran {

	private String nazev;
	private int sila;
	private int poskozeni;
	
	
	public Zbran() {
		this.nazev = "Remdih";
		this.sila = 20;
		this.poskozeni = 30;
		
	}
	
	public Zbran(String n ,int s, int p) {
		this.nazev = n;
		this.sila = s;
		this.poskozeni = p;
	}
	
	
	public void setSila(int sil) {
		this.sila = sil;
	}
	
	public int getSila() {
		return this.sila;
	}
	
	public void setPoskozeni(int pos) {
		this.poskozeni = pos;
	}
	
	public int getPoskozeni() {
		return this.poskozeni;
	}
	
	public void setNazev(String naz) {
		this.nazev = naz;
	}
	
	public String getNazev() {
		return this.nazev;
	}
	
	public void vypis() {
		System.out.println("Nazev zbrane je: " + this.nazev);
		System.out.println("Potrebna sila na pouzivani je: " + this.sila);
		System.out.println("Jednim utokem ubere: " + this.poskozeni);
	}
	
}
