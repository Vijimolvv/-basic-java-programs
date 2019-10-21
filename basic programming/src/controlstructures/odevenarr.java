package controlstructures;

import java.util.Scanner;

public class odevenarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		int i=0;int j=0;int k=0;
		int size=s.nextInt();
		
		int[]odd=new int[size];
		int[]even=new int[size];
		int[]inp=new int[size];
		//int[]values=new int[size];//
		System.out.println("enter elements of array");
		for(i=0;i<size;i++)
		{
			//System.out.println("enter the index["+i+"]");//
		
		inp[i]=s.nextInt();
		}
		if (inp[i]%2==0)
		{
			even[j]=inp[i];
					j++;
					}
		else
		{
			odd[k]=inp[i];
				k++;
		}}
			
		System.out.println("odd array");
		for(i=0;i<k;i++)
		{
			System.out.println(odd[i]);	
		}
		System.out.println("even array");
		for(i=0;i<j;i++)
		{
			System.out.println(even[i]);	
		}
}}

			
			
			
			
			
			
		

	}

}
