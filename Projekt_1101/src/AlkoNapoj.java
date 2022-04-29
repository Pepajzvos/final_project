
public class AlkoNapoj extends Napoj {
	private int alko;
	public AlkoNapoj(String n, int c, int a) {
		super(n, c);
		this.alko = a;
	}
	@Override
	public String toString() {
		return "AlkoNapoj [  nazev=" + nazev + ", cena=" + cena +"kè"+ "alkohol=" + alko +"%"+ "]";
	}
	public int getAlko() {
		return alko;
	}
	public void setAlko(int alko) {
		this.alko = alko;
	}
	

	
	
	
	
	
}
