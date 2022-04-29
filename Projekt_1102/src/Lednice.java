
public class Lednice {

	private String nazev;
	private int cena;
	private int kcal;
	public String getNazev() {
		return nazev;
	}
	public void setNazev(String nazev) {
		this.nazev = nazev;
	}
	public int getCena() {
		return cena;
	}
	public void setCena(int cena) {
		this.cena = cena;
	}
	public int getKcal() {
		return kcal;
	}
	public void setKcal(int kcal) {
		this.kcal = kcal;
	}
	public Lednice(String nazev, int cena, int kcal) {
		this.nazev = nazev;
		this.cena = cena;
		this.kcal = kcal;
	}
	
	
	
	
}
