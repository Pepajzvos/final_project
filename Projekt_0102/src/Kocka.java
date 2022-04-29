
public class Kocka extends Zvire {
protected String jmeno;
	public Kocka(int vek, double hmotnost, String j) {
		super(vek, hmotnost);
		jmeno = j;
	}
	public String getJmeno() {
		return jmeno;
	}
	public void setJmeno(String jmeno) {
		this.jmeno = jmeno;
	}
	@Override
	public String zvuk() {
		
		return "Mnau, mnau";
	}
	@Override
	public String toString() {
	
		return super.toString() + " " + jmeno;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

