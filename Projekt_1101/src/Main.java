
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Napoj n = new Napoj("Cola", 25);
		AlkoNapoj al = new AlkoNapoj("Malibu", 330,21);
		System.out.println(al.toString());
		System.out.println(n.toString());
		Auto a1 = new Auto("ABC 52 36", 50);
		NakladniAuto na = new NakladniAuto("A3D 25 42",70,25);
		System.out.println(a1.toString());
		System.out.println(na.toString());
	}

}
