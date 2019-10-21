package basicprogramming;

import java.util.Scanner;

public class Normalswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter a character");
		
		//int num=s.nextInt();//
		//char n=s.next().charAt(0);
		String n=s.next();
switch(n)

{
case "start":
System.out.println("running");
break;
case "stop":
System.out.println("stopped");
break;
default:
	System.out.println("wrong");
	

}
	}

}
