package Conditional;

public class WhileLoop 
{
	public static void main(String[] args) 
	{
		int i = 1;
		while(i<=5) 
		{
			System.out.println(i);		
			int j = 1;
			while(j<=2)
				{
					System.out.println("hi " + i);
					j++;
				}
				
			i++;
			}

}


}