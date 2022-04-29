
public class Kosik {
private String nazev;
private int cena;
private int velikost;

public String getNazev() {
	return nazev;
}
public void setNazev(String nazev) {
	this.nazev = nazev;
}
public int getCena() {
	return cena;
}
public void setCena(int cena) {
	this.cena = cena;
}
public int getVelikost() {
	return velikost;
}
public void setVelikost(int velikost) {
	this.velikost = velikost;
}
public Kosik(String nazev, int cena, int velikost) {
	this.nazev = nazev;
	this.cena = cena;
	this.velikost = velikost;
}
@Override
public String toString() {
	return "Kosik [nazev=" + nazev + ", cena=" + cena + ", velikost=" + velikost + "]";
}

public String ceny() {
	return "cena: " + cena;
}


}
