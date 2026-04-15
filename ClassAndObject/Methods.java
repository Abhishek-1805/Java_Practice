package ClassAndObject;

public class Methods 
{
	public static void main(String[] args) 
	{
		method obj = new  method();
		obj.name();
		String Str =obj.ball(25);
		System.out.println(Str);
		
		
	}

}


class method
{
	public void name() 
	{
		System.out.println("This is Abhi");
	}
	
	public String ball(int cost) 
	{
		if(cost>=25) 
		{
			return("The Ball Is Gud For Sales");
					
		}
		
		else
			return ("The Mininum Amount is 25");
	} 
	
}
