
public class Zlomek {
private int citatel;
private int jmenovatel;

public Zlomek(int c,int j) {
	this.citatel = c;
	this.jmenovatel = j;
}

public void setJmenovatel(int j) {
	this.jmenovatel = j;
	if(j == 0) {
		System.out.println("To nepujde");
	}else {
		
	}
}
public void vypis() {
	System.out.println(this.citatel + "/" + this.jmenovatel);
}




}
public boolean rovnostranny() {
	
	if(stranaA == stranaB && stranaB == stranaC) {
		System.out.println("Trojuhelnik je rovnostranny");
	}else {
		System.out.println("Trojuhelnik neni rovnostranny");
	}
return false;
}

public boolean rovnoramenny() {
	
	if(stranaA == stranaB && stranaB > stranaC) {
		System.out.println("Trojuhelnik je rovnoramenny");
	}else {
		System.out.println("Trojuhelnik neni rovnoramenny");
	}
return false;
}

public boolean pravouhly() {

if(stranaA * stranaA + stranaB * stranaB == stranaC * stranaC && stranaB * stranaB + stranaC * stranaC == stranaA * stranaA && stranaC * stranaC + stranaA * stranaA == stranaB * stranaB ) {
	System.out.println("Trojuhelnik je pravouhly");
}else {
	System.out.println("Trojuhelnik neni pravouhly");
}
return false;
}