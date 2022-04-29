
public class Pes extends Zvire {
	protected String rasa;
	public Pes(int vek, double hmotnost, String r) {
		super(vek, hmotnost);
		rasa = r;
	}
	@Override
	public String zvuk() {
		return super.zvuk() + ", Haf, Haf ";
	}
	public String getRasa() {
		return rasa;
	}
	public void setRasa(String rasa) {
		this.rasa = rasa;
	}
	@Override
	public String toString() {
		return rasa + " "+ super.toString();
	}
	

	
	
	
	
}
