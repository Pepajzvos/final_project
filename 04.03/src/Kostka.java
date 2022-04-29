
public class Kostka {
	private int cislo;
	private int cislo2;
	
	public int getCislo() {
		return cislo;
	}
	public void setCislo(int cislo) {
		this.cislo = cislo;
	}
	public int getCislo2() {
		return cislo2;
	}
	public void setCislo2(int cislo2) {
		this.cislo2 = cislo2;
	}
	public Kostka(int cislo, int cislo2) {
		this.cislo = cislo;
		this.cislo2 = cislo2;
	}
	public void zmena() {
		int tmp = cislo;
		cislo = cislo2; 
		cislo2 = tmp;
	}
	@Override
	public String toString() {
		return "[ " + cislo + " | " +  cislo2 + " ]";
	}
	
	
	
	
	
	
	
	
}
