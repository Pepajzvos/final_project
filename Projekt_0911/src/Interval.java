
public class Interval {

	private int minimum;
	private int maximum;
	private int hodnota;
	
	
	public Interval(int min, int max , int h) {
		this.minimum = min;
		this.maximum = max;
		this.hodnota = h;
	}
	
	public void setInterval(int max, int min) {
		this.maximum = max;
		this.minimum = min;
		
	}
	public boolean hodnota() {
		
		if(hodnota >= this.minimum && hodnota <= this.maximum) {
			System.out.println("Hodnota je v danem intervalu");
		}else {
			System.out.println("Hodnota v tomto intervalu neni");
		}
		return false;
	}

		
	
	
	
}
