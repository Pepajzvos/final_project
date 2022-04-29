
public class Student {
private double prumerZnamek;
private String Jmeno;
private String trida;
public double getPrumerZnamek() {
	return prumerZnamek;
}
public void setPrumerZnamek(double prumerZnamek) {
	this.prumerZnamek = prumerZnamek;
}
public String getJmeno() {
	return Jmeno;
}
public void setJmeno(String jmeno) {
	Jmeno = jmeno;
}
public String getTrida() {
	return trida;
}
public void setTrida(String trida) {
	this.trida = trida;
}
public Student(double p, String j, String t) {
	this.prumerZnamek = p;
	Jmeno = j;
	this.trida = t;
}
@Override
public String toString() {
	return "Student [prumerZnamek=" + prumerZnamek + ", Jmeno=" + Jmeno + ", trida=" + trida + "]";
}

}
