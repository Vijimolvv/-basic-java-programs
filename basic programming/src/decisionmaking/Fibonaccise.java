package decisionmaking;

import java.util.Scanner;

public class Fibonaccise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println(" fibonacci series");
		System.out.println(" enter a count");
		int a=0;int b=1;
		int n=s.nextInt();
		
		System.out.println(" \n 0");
		System.out.println(" \n 1");
		for(int i=0;i<n;i++)
		{int c=a+b;
		System.out.println(c);
		a=b;b=c;
		}
		
	}

}
