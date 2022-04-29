
public class Maringotka extends Obydli {
 private int rychlost;
	public Maringotka(int pocha, int mistnosti, int rychlost) {
		super(pocha, mistnosti);
		this.rychlost = rychlost;

	}
	@Override
	public String toString() {
		return "Maringotka [rychlost=" + rychlost + ", pocha=" + pocha + ", mistnosti=" + mistnosti + "]";
	}
	public int getRychlost() {
		return rychlost;
	}
	public void setRychlost(int rychlost) {
		this.rychlost = rychlost;
	}

	
	
	
}
