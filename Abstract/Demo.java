package Abstract;

abstract class bike
{
	public abstract void drive();
	public void start() 
	{
		System.out.println("The Is Started");
	}
}

class superbike extends bike  // concrete class
{
	public void drive() 
	{
		System.out.println("Drive the Car");
	}
}

public class Demo 
{
	public static void main(String[] args) 
	{
		bike obj = new superbike();
		obj.drive();
		obj.start();
		
	}

}
