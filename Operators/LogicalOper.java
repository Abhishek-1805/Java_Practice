package Operators;

public class LogicalOper 
{
	public static void main(String[] args) 
	{
		int a = 15;
		int b = 20;
		
		float c = 15.2f;
		float d = 16.2f;
		
	boolean result = a<b && c<d; // and 
	boolean result2 = a>b || c<d; // or
	boolean s = ! result2; // not
	
	
	System.out.println(result);
	System.out.println(result2);
	System.out.println(s);
		
		
	}

}
