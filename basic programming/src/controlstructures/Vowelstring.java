package controlstructures;

import java.util.Scanner;

public class Vowelstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		
		int size=s.nextInt();
		int i;
	
		String vow[]=new String[size];
		
		
		
		for( i=0;i<size;i++)
		{
		
		
		
		vow[i]=s.next();
		}
		char c;
		for(i=0;i<size;i++)
		{
			c=vow[i].charAt(0);
		
		if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='U'||c=='u')
	
			{
			System.out.println(vow[i]);
		
			}
		}
		s.close();
	
	

}
}
