import java.util.Random;
public class Kostka {
private int strany;

Random r = new Random();


public void setStrany(int s) {
	this.strany = s;
}

public int getStrany() {
	return this.strany;
}

public Kostka() {
	this.strany = getStrany();
}

public int hod() {
	return r.nextInt(this.strany)+1;
}

}
