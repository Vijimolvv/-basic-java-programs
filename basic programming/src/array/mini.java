package array;

import java.util.Arrays;
import java.util.Scanner;

public class mini {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		int size=s.nextInt();
		int[]values=new int[size];
int j=0;int i=0;
		for( i=0;i<size;i++)
		{
			values[i]=s.nextInt();
			
			
			////
			Arrays.parallelSort(values);
			System.out.println(values[i]);
			j=values[size-2];
		}
		System.out.println(j);
		System.out.println("second largest num");
		//System.out.println(values[i]);
		
	}}
		
			
		
		
		

	
