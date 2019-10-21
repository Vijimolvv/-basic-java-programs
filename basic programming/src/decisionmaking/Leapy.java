package decisionmaking;

import java.util.Scanner;

public class Leapy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println(" enter the year");
		int leap=s.nextInt();
		
		if (leap%4==0  )
		{
			if (leap%100==0)
			{
				
		if (leap%400==0)
		
		
			System.out.println(" leap year");
		
			else
			
				System.out.println(" not a leap year");
			}
			else 
				System.out.println("  a leap year");
		}
		else 
			System.out.println(" not a leap year");
		s.close();
		}
	
	}


	