package Inheritance;


class dog
{

	public dog()
	{
		System.out.println("The Dog is loyal ");
	}
}

class cat extends dog
{
	public cat() // constructor
	{
		System.out.println("The cat is cute");
	}
	
}


public class First  
{
	public static void main(String[] args) 
	{
		
	
		new cat(); //Anomalous object creation
		
	}


}

  