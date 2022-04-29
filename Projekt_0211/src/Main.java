import java.util.Scanner;

import com.sun.tools.example.debug.expr.ExpressionParser.GetFrame;

import java.util.Random;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		TestOtazka o1 = new TestOtazka("Ve kterém roce se narodil Karel IV?", "1212","1316","1424",2);
		
		o1.vypis();
		int odpoved = sc.nextInt();
		System.out.println(o1.sprav(odpoved));
		
		int cislo1 = r.nextInt(20)-10;
		int cislo2 = r.nextInt(20)-10;
		int cislo3 = r.nextInt(20)-10;
		int cislo4 = r.nextInt(20)-10;
		int cislo5 = r.nextInt(20)-10;
		int cislo6 = r.nextInt(20)-10;
		int cislo7 = r.nextInt(20)-10;
		int cislo8 = r.nextInt(20)-10;
		
		
		
		Zlomek z1 = new Zlomek(cislo1,cislo2);
		z1.vypis();
		Zlomek z2 = new Zlomek(cislo3,cislo4);
		z2.vypis();
		Zlomek z3 = new Zlomek(cislo5,cislo6);
		z3.vypis();
		Zlomek z4 = new Zlomek(cislo7,cislo8);
		z4.vypis();
		
		Kostka k1 = new Kostka();
		System.out.println("Kolik má kostka stran?");
		int kolikstr = sc.nextInt();
		k1.hod();
		
		
		
		
		
		
		
		
		
		
	}

}
