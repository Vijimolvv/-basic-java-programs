package basicprogramming;

import java.util.Scanner;

public class profile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter name");
		String c=s.nextLine();
		System.out.println("enter college name");
		String d=s.nextLine();
		
		System.out.println("enter  degree");
		String e=s.nextLine();
		System.out.println("enter branch");
		String f=s.nextLine();
	
		
		//s.nextLine();
		System.out.printf("NAME%S",c);
		System.out.printf("college name;%S",d);System.out.printf("degree%S",e);
		System.out.printf("BRANCH:%S",f);
	}

}
