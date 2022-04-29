
public class Napoj {

	protected String nazev;
	protected int cena;
	public Napoj(String n, int c) {
		this.nazev = n;
		this.cena = c;
	}
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
	@Override
	public String toString() {
		return "Napoj [nazev=" + nazev + ", cena=" + cena + "]";
	}
	
	
	
	
	
	
	
	
	
}
