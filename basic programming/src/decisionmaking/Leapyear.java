package decisionmaking;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println(" enter the year");
		int leap=s.nextInt();
		
		if ((leap%4==0 && leap%100!=0)||(leap%400==0))
		{
		
			System.out.println(" leap year");
		}
			else
			{
				System.out.println(" not a leap year");
			}
		}

}
