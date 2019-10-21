package decisionmaking;

import java.util.Scanner;

public class Nnnn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println(" branch");
		int branch=s.nextInt();
		
		
		
switch(branch)

{
case 1:
	System.out.println("enter cs options");
	char cs=s.next().charAt(0);


  switch(cs) { 
  case 'a':System.out.println("computer");
  break;
  
  case 'b':System.out.println("computer science");
  
  break;
  
  case 'c':System.out.println("computer application");
  break;
  
	  
  }
break;
case 2:		System.out.println("enter ec options");
 
char ec=s.next().charAt(0);

switch(ec)
{
case 'd':System.out.println("electronics");
break;

case 'e':System.out.println("electronics science");

break;

case 'f':System.out.println("electronics application");
break;
}
break;
default:System.out.println("invalid");
}
	}

}
