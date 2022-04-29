
public class NakladniAuto extends Auto {
	
	private int hmotnost;
	public NakladniAuto(String spz, int r, int h) {
		super(spz, r);
		this.hmotnost = h;
	}
	public int getHmotnost() {
		return hmotnost;
	}
	public void setHmotnost(int hmotnost) {
		this.hmotnost = hmotnost;
	}
	@Override
	public String toString() {
		return "NakladniAuto [ spz=" + spz + ", rychlost=" + rychlost +" km/h"+" uveze "+ hmotnost +" tun"+ "]";
	}
	
	
	
	
	
	

}
