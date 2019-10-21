package controlstructures;

import java.util.Scanner;

public class Switchmonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		char c;char d;char e;
		System.out.println("enter the date");
		
		String size=s.nextLine();

		System.out.println("the date");

		System.out.println(size);
		String str=""+size.charAt(3)+size.charAt(4);
		
		switch(str)
		{
		case"01":System.out.println("jan");
		break;
		case"02":System.out.println("feb");
		break;
		case"03":System.out.println("mar");
		break;
		case"04":System.out.println("apr");
		break;
		case"05":System.out.println("may");
		break;
		case"06":System.out.println("june");
		break;
		case"07":System.out.println("july");
		break;
		case"08":System.out.println("aug");
		break;
		case"09":System.out.println("sep");
		break;
		
		case"10":System.out.println("oct");
		break;
		case"11":System.out.println("nov");
		
		break;
		
		case"12":System.out.println("dec");
		break;
		}
		s.close();
		
		
		
		
	}

}
