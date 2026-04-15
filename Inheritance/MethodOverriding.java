package Inheritance;

class method
{
	public void show() 
	{
		System.out.println("This is First Show");
	}
	
}

class ridding extends method
{
	public void show() 
	{
		System.out.println("This is Second");
	}
}

public class MethodOverriding 
{
	public static void main(String[] args) 
	{
		method obj = new ridding();
		obj.show();
		
	}

}
