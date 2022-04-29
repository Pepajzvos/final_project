
public class Akvarium {
private int delka;
private int sirka;
private int vyska;
private int voda;
private int obem;



public Akvarium(int d , int s, int v,int o) {
	this.delka = d;
	this.sirka = s;
	this.vyska = v;
	this.voda = o;
	this.obem = d*s*v;
}
public boolean pravda() {
	if(obem >= voda == true) {
		System.out.println("Voda se vam tam vejde.");
	}
	else {
		System.out.println("Kupte vetsi akvarium.");
	}
	return false;
}







}
