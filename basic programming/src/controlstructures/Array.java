package controlstructures;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
@SuppressWarnings("resource")
Scanner s=new Scanner(System.in);
System.out.println("enter the size");
int size=s.nextInt();
int[]values=new int[size];
//int sum=0//
for(int i=0;i<size;i++) {
	System.out.println("enter the index["+i+"]");
	values[i]=s.nextInt();

}for(int i=0;i<size;i++)
{System.out.println("enter the index["+i+"]");
System.out.println(values[i]);

}

	}

}
