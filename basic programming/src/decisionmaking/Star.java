package decisionmaking;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println(" enter the limit");
		int v=s.nextInt();
		for(int i=0;i<=v;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.printf(" *");
			}
			System.out.printf(" \n");
	}

}
}
