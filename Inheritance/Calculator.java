package Inheritance;

import java.util.Scanner;

public class Calculator  extends AdavnceCal
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number A");
       	int a =	sc.nextInt();
       	
       	System.out.println("Enter The Number B");
       	int b = sc.nextInt();
       	

    	Calculator obj = new Calculator();
     
       	System.out.println ( "The Addition is " + obj.add(a, b));
       	System.out.println( "The Subraction is "+ obj.sub(a, b));
       	System.out.println("The Multiply is "+ obj.mul(a, b));
       	System.out.println("The Division is " + obj.div(a, b));
       	
    	sc.close();

       	       	
 	}
	
	public  int add(int a, int b) 
	{
		return a+b;
	}
	


	
       		

}
