
public class Trojuhelnik {
private int stranaA;
private int stranaB;
private int stranaC;
	
	public Trojuhelnik(int a, int b, int c) {
		this.stranaA = a;
		this.stranaB = b;
		this.stranaC =c;
	}
	
	public void setA(int a) {
		this.stranaA = a;
		if(a<0) {
			System.out.println("Nejde");
		}
	}
	
	public void setB(int b) {
		this.stranaB = b;
		if(b<0) {
			System.out.println("Nejde");
		}
	}
	
	public void setC(int c) {
		this.stranaC = c;
			if(c<0) {
				System.out.println("Nejde");
			}
	
	}
	
	public boolean setaveni() {
		
		if(stranaA > stranaB + stranaC && stranaB > stranaA + stranaC && stranaC > stranaA + stranaB ) {
			System.out.println("Trojuhelnik nejde sestavit");
		}else {
			System.out.println("Trojuhelnik jde sestavit");
		}
		
		
		
		
		return false;
		
	}
	
	
	
	
	
	
	
	
	public boolean druh() {
		
		if(stranaA == stranaB && stranaB == stranaC) {
			System.out.println("Trojuhelnik je rovnostranny");
		}if(stranaA == stranaB && stranaB > stranaC) {
			System.out.println("Trojuhelnik je rovnoramenny");
		}if(stranaA * stranaA + stranaB * stranaB == stranaC * stranaC && stranaB * stranaB + stranaC * stranaC == stranaA * stranaA && stranaC * stranaC + stranaA * stranaA == stranaB * stranaB ) {
			System.out.println("Trojuhelnik je pravouhly");
		}else {
			System.out.println("Trojuhelnik je obecny");
		}
		
		return false;
		}
	

	
	
	
	
	
}





