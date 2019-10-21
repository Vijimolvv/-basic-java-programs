package controlstructures;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reverse {

public static void main(String[] args) throws NumberFormatException, IOException {
		
		// TODO Auto-generated method stub
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));



	System.out.println(" enter the number");
	int a=Integer.parseInt(br.readLine());
	int r;int sum=0;
	while(a!=0)
	{
		r=a%10;
		sum=(sum*10)+r;
		a=a/10;
	}
	System.out.println(sum);
}
}
