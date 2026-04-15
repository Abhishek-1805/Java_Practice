package Encapsulation.java;

public class GetterSetter 
{
	public static void main(String[] args) 
	{
		student obj = new student();
		obj.SetName("Abhi");
		obj.SetRoll_No(01);
		
		System.out.println(obj.GetName());
		
		
	}

}

class student
{
	private int Roll_No;
	private String Name;
	
	public int GetRoll_No() 
	{
		return Roll_No;
		
	}
	
	public void SetRoll_No(int Roll_No) 
	{
		this.Roll_No = Roll_No;	
		
	}
	
	public String GetName() 
	{
		return Name;
	}
	
	public void SetName(String Name) 
	{
		this.Name = Name;
		
	}
	
	
	
	
}