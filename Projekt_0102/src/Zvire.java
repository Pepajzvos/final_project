
public class Zvire {
	protected int vek;
	protected double hmotnost;
	
	public Zvire(int vek, double hmotnost) {
		this.vek = vek;
		this.hmotnost = hmotnost;
	}
	public int getVek() {
		return vek;
	}
	public void setVek(int vek) {
		this.vek = vek;
	}
	public double getHmotnost() {
		return hmotnost;
	}
	public void setHmotnost(int hmotnost) {
		this.hmotnost = hmotnost;
	}
	
	public String zvuk(){	
		return "Vrrr";
		}
	@Override
	public String toString() {
		return "Zvire [vek=" + vek + ", hmotnost=" + hmotnost + "]";
	}
	
	
}
