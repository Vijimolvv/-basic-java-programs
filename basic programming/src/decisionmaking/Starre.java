package decisionmaking;

import java.util.Scanner;

public class Starre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println(" enter the limit");
		int v=s.nextInt();
		for(int i=v;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.printf(" *");
			}
			System.out.printf(" \n");

	}

}
}