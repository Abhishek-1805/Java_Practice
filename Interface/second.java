package Interface;

abstract class computer
{
	public abstract void show();
}

class desktop extends computer
{
	public void show() 
	{
		System.out.println(" this is faster than the laptop");
		
	}
}
class laptop extends desktop
{
	public void show() 
	{
		System.out.println("This is laptop with easy to carry");
	}
}

class devloper 
{
	public void dev(computer lap) 
	{
		lap.show();
	}
	
}

public class second
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("unused")
		computer lap  = new laptop();
		computer desk = new  desktop();
		
		devloper obj = new devloper();
		obj.dev(desk);
		
	}

}
