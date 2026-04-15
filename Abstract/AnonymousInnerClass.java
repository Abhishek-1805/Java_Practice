package Abstract;
abstract class phone
{
	public abstract void show();	
}

public class AnonymousInnerClass 
{
	public static void main(String[] args) 
	{
		phone obj = new phone() 
		{
			public void show() 
			{
				System.out.println("This is my show");
			}
		};
		obj.show();
		
		
	}
	

}
