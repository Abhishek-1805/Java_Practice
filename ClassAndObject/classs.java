package ClassAndObject;

public class classs 
{
	public static void main(String[] args) 
	{
		cal obj = new cal();
		int result = obj.add(130, 150);
		System.out.println(result);
		
	}
}

class cal
{
	public int add(int a , int b) 
	{
		return a+b;
	}
}
