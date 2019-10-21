package controlstructures;

import java.util.Scanner;

public class Strongnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s=new Scanner(System.in);
		
	int r;int i;
	int sum=0;
		
		System.out.println(" enter the number");
		 
		int n=s.nextInt();
		int b=n;
		 while(n!=0) 
		 {
			 int fact=1;
			 r=n%10;
			 for(i=1;i<=r;i++)
			 {
		 fact=fact*i;
			 }
			 
			 
		sum=sum+fact;
		 
		 n=n/10;
		 }
		if (sum==b)	
			System.out.println("strong number ");
		else
		{
			System.out.println("not a strong number ");
		}
		s.close();
			}
	}


