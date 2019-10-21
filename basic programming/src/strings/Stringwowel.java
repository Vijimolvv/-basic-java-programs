package strings;

import java.util.Scanner;

public class Stringwowel {

	public static void main(String[] args) {

Scanner s=new Scanner(System.in);
System.out.println("enter a string");

String str = s.nextLine();
int count=0;int j,k;
for(int i=0; i<str.length();i++){
  char ch = str.charAt(i);
 
	  //
  
  if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='u'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
  {
	  count++;
	  for(j=0;j<count;j++)
	  { System.out.printf("*"); }
	  System.out.print(ch);
	  for(k=0;k<count;k++)
	  {
		  System.out.print('*');
	  }
	  
	  
	  
  }
  else
  {
 
	  System.out.printf("%s",ch);
  
}

}




	}

}
