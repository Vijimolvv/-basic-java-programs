package basicprogramming;

import java.util.Scanner;

public class spac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter a string");
		
		String a=s.nextLine();
		System.out.println("enter a number");
		int n=s.nextInt();
		
		
System.out.println("enter a 2string\n");
		
		String b=s.nextLine();
		System.out.println("enter a 2number\n");
		int m=s.nextInt();
		System.out.printf("%-15s %03d\n", a,n);
		
		System.out.printf("%-15s %03d\n", b,m);
		

	}

}
