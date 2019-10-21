package controlstructures;
//java io.BufferedReader;//
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Armstr {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// TODO Auto-generated method stub
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a,r;
int sum=0;
System.out.println(" enter the number");
 a=Integer.parseInt(br.readLine());
 int b=a;
 while(a!=0) 
 {
	 r=a%10;
 sum=sum+(r*r*r);
 a=a/10;
 
 
 }
if (sum==b)	
	System.out.println("yes ");
else
	System.out.println("no ");
	}

}
