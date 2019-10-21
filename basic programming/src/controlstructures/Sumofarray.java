package controlstructures;

import java.util.Scanner;

public class Sumofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		int i=0;
		int size=s.nextInt();
		
		int[]values1=new int[size];
		int[]values2=new int[size];
		int[]values3=new int[size];
		//int[]values=new int[size];//
		System.out.println("enter elements of 1st array");
		for(i=0;i<size;i++)
		{
			System.out.println("enter the index["+i+"]");
		
		values1[i]=s.nextInt();
		}
		

		
		System.out.println("enter elements of 2nd array");
		for(i=0;i<size;i++)
		{
			System.out.println("enter the index["+i+"]");
		
		values2[i]=s.nextInt();
		}
		
		
		System.out.println("the result is ");
		for(i=0;i<size;i++)
		{
		values3[i]=values1[i]+values2[i];
		System.out.println(values3[i] );
		}
		

	}

}
