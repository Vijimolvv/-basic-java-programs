package basicprogramming;

import java.util.Scanner;

public class round {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number");
		Scanner s=new Scanner(System.in);
		float n=s.nextFloat();
		//int k=("%f, Math.floor(n)");
		
		System.out.println(Math.round(n));
		
		System.out.println(Math.ceil(n));
		
		System.out.println(Math.floor(n));
		


	}

}
