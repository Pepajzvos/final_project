
public class Bojovnik {
 protected String jmeno;
 protected int lvl;
 protected int sila;
 protected int xp;
public Bojovnik(String jmeno, int lvl, int sila, int xp) {
	this.jmeno = jmeno;
	this.lvl = lvl;
	this.sila = sila;
	this.xp = xp;
}
public String getJmeno() {
	return jmeno;
}
public void setJmeno(String jmeno) {
	this.jmeno = jmeno;
}
public int getLvl() {
	return lvl;
}
public void setLvl(int lvl) {
	this.lvl = lvl;
}
public int getSila() {
	return sila;
}
public void setSila(int sila) {
	this.sila = sila;
}
public int getXp() {
	return xp;
}
public void setXp(int xp) {
	this.xp = xp;
}
@Override
public String toString() {
	return "Bojovnik [jmeno=" + jmeno + ", lvl=" + lvl + ", sila=" + sila + ", xp=" + xp + "]";
}
 
 
 
}
