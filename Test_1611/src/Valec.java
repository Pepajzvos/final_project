
public class Valec {

	private double polomer;
	private double vyska;
	
	
	public Valec(double p, double v) {
		this.polomer = p;
		this.vyska = v;
	}
	
	public Valec() {
		polomer = 2;
		vyska = 25;
	}
	
	public double Povrch() {
		return 2*Math.PI*polomer*(polomer+vyska);
	}
	public double Objem() {
		return Math.PI*polomer*2*vyska;
	}
	
	public void vypis() {
		 System.out.println("Valec ma povrch: " + Povrch());
		 System.out.println("Valec ma objem: " + Objem());
	}
	
	
	
	
	
}
