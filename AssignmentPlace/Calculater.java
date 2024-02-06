package AssignmentPlace;

import java.util.Scanner;

abstract public class Calculater {
	
	abstract public void menu();
	abstract public void input();
	abstract public void addition();
	abstract public void substraction();
	abstract public void muliplication();
	abstract public void division();
	abstract public void mod();
	abstract public void square();
	abstract public void squareroot();
	abstract public void rept();
	
	
	public static void main(String[]args) throws InterruptedException {
		Calculater_info ob=new Calculater_info();
		try {
		ob.menu();
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER YOUR CHOICE:");
		int a=sc.nextInt();
		 Thread.sleep(200);
		if(a==1) {
			ob.addition();
		}
		else if(a==2) {
			ob.substraction();
		}
		else if(a==3) {
			ob.muliplication();
		}
		else if(a==4) {
			ob.division();
		}
		else if(a==5) {
			ob.mod();;
		}
		else if(a==6) {
			ob.square();
		}
		else if(a==7) {
			ob.squareroot();		}
		else {
			Thread.sleep(200);
			System.out.println();
			Thread.sleep(200);
			System.out.println("INVALIDE CHOICE!!!!!!!!!");
			 Thread.sleep(400);
			System.out.println("Enter choice which is present in menu...");
			Thread.sleep(200);
			System.out.println();
			System.out.println();
			Thread.sleep(400);
			ob.rept();
		}
		}
		catch (Exception e) {
			Thread.sleep(200);
			System.out.println();
			Thread.sleep(200);
			System.out.println("INVALIDE CHOICE!!!!!!!!!");
			Thread.sleep(200);
			System.out.println("Can't enter anything other then digits");
			Thread.sleep(200);
			System.out.println();
			Thread.sleep(200);
			ob.rept();
		}
	}

}
