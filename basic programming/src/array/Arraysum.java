package array;

import java.util.Scanner;

public class Arraysum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		int i=0;int j=0;int k=0;
		int sum=0,sum1=0;
		float avg1=0;float avg2=0;
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
		for(i=0;i<j;i++)
		{
			System.out.println(odd[i]);	
			sum=sum+odd[i];
			
		}
		System.out.println("even array");
		for(i=0;i<k;i++)
		{
			System.out.println(even[i]);
			sum1=sum1+even[i];
		}
		avg1=sum/j;
		avg2=sum1/k;
		System.out.println(avg1);
		System.out.println(avg2);
		
		
		
}}