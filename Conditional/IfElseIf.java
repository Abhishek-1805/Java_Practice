package Conditional;

public class IfElseIf 
{
	public static void main(String[] args) 
	{
		int age = 16;
		
		if(age>=18 && age<21)
		{
			System.out.println("Elligible For Vote");
		}
		
		else if(age>21 && age < 60) 
		{
			System.out.println("Is An Adult");
		}
		
		else if(age > 60)
		{
			System.out.println("Senior Citizen");
		}
		
		else 
		{
			System.out.println("Not Elligile For Vote");
			
		}
		
	}

}
