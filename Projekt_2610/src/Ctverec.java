
public class Ctverec {

	private int strana;
	
	public Ctverec(int s) {
		this.strana = s;
	}
	public void setStrana(int s) {
		this.strana = s;
	}
	
	public int getStrana() {
		return this.strana;
	}
	public int obvod() {
		return this.strana*4;
	}
	public int obsah() {
		return this.strana*this.strana; 
	}
	
	
}
