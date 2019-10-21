package array;

import java.util.Scanner;

public class Maximu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		int size=s.nextInt();
		int[]values=new int[size];
int j=0;
		for(int i=0;i<size;i++)
		{
			values[i]=s.nextInt();
			if (values[i]>=j)
			{
				j=values[i];
			}}
			System.out.printf("%d",j);
			
		}
	}