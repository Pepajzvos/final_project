
public class Kouzelnik extends Bojovnik {
	private int inteligence;
	public Kouzelnik(String jmeno, int lvl, int sila, int xp, int in) {
		super(jmeno, lvl, sila, xp);
		this.inteligence = in;
	}
	public int getInteligence() {
		return inteligence;
	}
	public void setInteligence(int inteligence) {
		this.inteligence = inteligence;
	}
	@Override
	public String toString() {
		return "Kouzelnik [jmeno=" + jmeno + ", lvl=" + lvl + ", sila=" + sila
				+ ", xp=" + xp + " inteligence=" + inteligence +"]";
	}
	
	
	

}
