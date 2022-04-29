
public class Auto {
	
	protected String spz;
	protected int rychlost;
	
	public String getSpz() {
		return spz;
	}
	public void setSpz(String spz) {
		this.spz = spz;
	}
	public int getRychlost() {
		return rychlost;
	}
	public void setRychlost(int rychlost) {
		this.rychlost = rychlost;
	}
	public Auto(String spz, int r) {
		this.spz = spz;
		this.rychlost = r;
	}
	@Override
	public String toString() {
		return "Auto [spz=" + spz + ", rychlost=" + rychlost + "km/h" + "]";
	}
	
	
	
	
}
