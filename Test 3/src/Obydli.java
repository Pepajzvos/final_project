
public class Obydli {

	protected int pocha;	
	protected int mistnosti;
	public int getPocha() {
		return pocha;
	}
	public void setPocha(int pocha) {
		this.pocha = pocha;
	}
	public int getMistnosti() {
		return mistnosti;
	}
	public void setMistnosti(int mistnosti) {
		this.mistnosti = mistnosti;
	}
	public Obydli(int pocha, int mistnosti) {
		this.pocha = pocha;
		this.mistnosti = mistnosti;
	}
	@Override
	public String toString() {
		return "Obydli [pocha=" + pocha + ", mistnosti=" + mistnosti + "]";
	}
	
	
	
}
