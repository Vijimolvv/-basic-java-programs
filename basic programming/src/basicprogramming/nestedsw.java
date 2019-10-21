package basicprogramming;

import java.util.Scanner;

public class nestedsw {

	private static char case1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the branch");
		char branch=s.next().charAt(0);
		System.out.println("enter the college year");
		int year=s.nextInt();
		switch(branch)
		{
		case1:
			System.out.println("mechanical");
		break;
		case2:
			System.out.println("computer");
		break;
		}
		

	}

	
}
