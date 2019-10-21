package controlstructures;

import java.util.Scanner;

public class Lcmhcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner s=new Scanner(System.in);
		
			int min;int max;int i;int gcd=0;int lcm=0;
			System.out.println(" enter the 1st number");
			int a=s.nextInt();
			System.out.println(" enter the 2nd number");
			int b=s.nextInt();
			
			min=(a<b)?a:b;
			System.out.printf("min");
			System.out.println(min);
			
			for(i=min;i>0;i--)
			{
				if (a%i==0 && b%i==0)
				{
					gcd=i;
				break;
			}}
			System.out.println("gcd");
			System.out.println(gcd);
			
	max=(a>b)?a:b;
	System.out.printf("max");
			System.out.println(max);
			
			
			for(i=max;i<=(a*b);i++)
			{
				if (i%a==0 && i%b==0)
				{
					lcm=i;
				break;
			}}
			System.out.printf("lcm");
			System.out.println(lcm);
			s.close();
	}

}
