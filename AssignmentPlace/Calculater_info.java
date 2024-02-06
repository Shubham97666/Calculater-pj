package AssignmentPlace;

import java.util.Scanner;

public class Calculater_info extends Calculater {
int a,b;

	public void menu() {
		try {
			System.out.println("**************MENU***************");
			Thread.sleep(200);
			System.out.println();
			Thread.sleep(200);
			System.out.println("       1)ADDITION");
			Thread.sleep(200);
			System.out.println("       2)SUBTRACTION");
			Thread.sleep(200);
			System.out.println("       3)MULTIPLICATION");
			Thread.sleep(200);
			System.out.println("       4)DIVISION");
			Thread.sleep(200);
			System.out.println("       5)MOD");
			Thread.sleep(200);
			System.out.println("       6)SQUARE");
			Thread.sleep(200);
			System.out.println("       7)SQUARE ROOT");
			Thread.sleep(200);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

	
	public void input() {
		try {
			Scanner sc=new Scanner(System.in); 
			Thread.sleep(200);
			System.out.println("enter your number:");
			 a=sc.nextInt();
			 Thread.sleep(200);
			 System.out.println();
			Thread.sleep(400);
			System.out.println();
		   } 
		
		catch (Exception e) {
			System.out.println(e);
		}
	}

	
	public void addition() {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int i=1;
		System.out.println("enter number to add or press 0 to end calculation");
		while (i!=0)
		{
			i=sc.nextInt();
			sum=sum+i;
		}
		System.out.println("sum="+sum);
		try {
		Thread.sleep(200);
		System.out.println();
		Thread.sleep(200);
		System.out.println("Press 1 to use again..");
		Thread.sleep(200);
		System.out.println();
		Thread.sleep(200);
		System.out.println("For exit press other than one....");
			Thread.sleep(200);
			System.out.println("enter your choice:");
			 int f=sc.nextInt();
			if (f==1) {
				rept();
			} else {
				System.out.println("Thankuu.....");
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		 
	}

	
	public void substraction() {
		Scanner sc=new Scanner(System.in);
		input();
		int sub=a;
		int i=1;
		while (i!=0) {
			i=sc.nextInt();
			sub=sub-i;
		}
		System.out.println("Subtraction is="+sub);
		try {
			Thread.sleep(200);
			System.out.println();
			Thread.sleep(200);
			System.out.println("Press 1 to use again..");
			Thread.sleep(200);
			System.out.println();
			Thread.sleep(200);
			System.out.println("For exit press other than one....");
				Thread.sleep(200);
				System.out.println("enter your choice:");
				 int f=sc.nextInt();
				if (f==1) {
					rept();
				} else {
					System.out.println("Thankuu.....");
				}
				
			} catch (Exception e) {
				System.out.println(e);
			}
	}

	
	public void muliplication() {
		Scanner sc=new Scanner(System.in);
		int mul=1;
		int i=1;
		System.out.println("enter number for multiplication or press 0 to end calculation");
		while (i!=0)
		{
			i=sc.nextInt();
			if (i!=0) {
				mul=mul*i;
			}
		}
		System.out.println("mul="+mul);
		try {
			Thread.sleep(200);
			System.out.println();
			Thread.sleep(200);
			System.out.println("Press 1 to use again..");
			Thread.sleep(200);
			System.out.println();
			Thread.sleep(200);
			System.out.println("For exit press other than one....");
				Thread.sleep(200);
				System.out.println("enter your choice:");
				 int f=sc.nextInt();
				if (f==1) {
					rept();
				} else {
					System.out.println("Thankuu.....");
				}
				
			} catch (Exception e) {
				System.out.println(e);
			}
	}

	
	public void division() {
		Scanner sc=new Scanner(System.in);
		input();
		b=sc.nextInt();
		System.out.println("Division  is="+(a/b));
		try {
			Thread.sleep(200);
			System.out.println();
			Thread.sleep(200);
			System.out.println("Press 1 to use again..");
			Thread.sleep(200);
			System.out.println();
			Thread.sleep(200);
			System.out.println("For exit press other than one....");
				Thread.sleep(200);
				System.out.println("enter your choice:");
				 int f=sc.nextInt();
				if (f==1) {
					rept();
				} else {
					System.out.println("Thankuu.....");
				}
				
			} catch (Exception e) {
				System.out.println(e);
			}
	}
	
	public void mod() {
		input();
		Scanner sc=new Scanner(System.in);
		b=sc.nextInt();
		System.out.println("Reminder  is="+(a%b));
		try {
			Thread.sleep(200);
			System.out.println();
			Thread.sleep(200);
			System.out.println("Press 1 to use again..");
			Thread.sleep(200);
			System.out.println();
			Thread.sleep(200);
			System.out.println("For exit press other than one....");
				Thread.sleep(200);
				System.out.println("enter your choice:");
				 int f=sc.nextInt();
				if (f==1) {
					rept();
				} else {
					System.out.println("Thankuu.....");
				}
				
			} catch (Exception e) {
				System.out.println(e);
			}
	}
	
	public void square() {
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter number for square:");
		int  x=sc.nextInt();
		System.out.println("Square  is="+(x*x));
		try {
			Thread.sleep(200);
			System.out.println();
			Thread.sleep(200);
			System.out.println("Press 1 to use again..");
			Thread.sleep(200);
			System.out.println();
			Thread.sleep(200);
			System.out.println("For exit press other than one....");
				Thread.sleep(200);
				System.out.println("enter your choice:");
				 int f=sc.nextInt();
				if (f==1) {
					rept();
				} else {
					System.out.println("Thankuu.....");
				}
				
			} catch (Exception e) {
				System.out.println(e);
			}
	}
	
	public void squareroot() {
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter number for squareroot");
		double  y=sc.nextDouble();
		System.out.println("Squareroot  is="+(Math.sqrt(y)));
		try {
			Thread.sleep(200);
			System.out.println();
			Thread.sleep(200);
			System.out.println("Press 1 to use again..");
			Thread.sleep(200);
			System.out.println();
			Thread.sleep(200);
			System.out.println("For exit press other than one....");
				Thread.sleep(200);
				System.out.println("enter your choice:");
				 int f=sc.nextInt();
				if (f==1) {
					rept();
				} else {
					System.out.println("Thankuu.....");
				}
				
			} catch (Exception e) {
				System.out.println(e);
			}
	}
	
	public void rept() {
		menu();
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER YOUR CHOICE");
		int a=sc.nextInt();
		if(a==1) {
			addition();
		}
		else if(a==2) {
			substraction();
		}
		else if(a==3) {
			muliplication();
		}
		else if(a==4) {
			division();
		}
		else if(a==5) {
			mod();;
		}
		else if(a==6) {
			square();
		}
		else if(a==7) {
			squareroot();		}
		else {
			try {
				System.out.println();
				Thread.sleep(200);
				System.out.println("INVALIDE CHOICE!!!!!!!!!");
				Thread.sleep(400);
				System.out.println("Enter choice which is present in menu...");
				Thread.sleep(200);
				System.out.println();
				rept();
		        } 
			catch (Exception e)
			{
			System.out.println(e);
		    }
			
		}
	
	}
	
}
