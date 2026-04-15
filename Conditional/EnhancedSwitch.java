package Conditional;

import java.util.Scanner;

public class EnhancedSwitch 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter The Fruit Name");
		String name = sc.next();
		
	switch(name) 
	{
	case " Mango" -> System.out.println("King of the Fruit");
	case "Apple" -> System.out.println("Sweet And Taste");
	default -> System.out.println("Enter the Valid Fruit");
	
	}
	sc.close();
		
		
	}

}
