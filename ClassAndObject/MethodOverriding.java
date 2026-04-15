package ClassAndObject;

public class MethodOverriding
{
	public static void main(String[] args) 
	{
		calculator obj = new calculator();
		int result = obj.add(20, 40, 60);
		System.out.println(result);
		
	}

}

class calculator 
{
	public int add(int a,int b) 
	{
		return a+b;
	}
	
	public int add (int a, int b, int c) // method overloading is based on the parenthesis we pass the value which means the method name is same  and perform based on the value we pass
 	{
		return a+b+c;
	}

}
