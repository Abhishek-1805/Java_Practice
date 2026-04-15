package Encapsulation.java;

public class Constructor 
{
	public static void main(String[] args) 
	{
		
College obj = new College();
College obj2 = new College(200,"mouni");


System.out.println(obj.getmark() + " : "+ obj.getname());
System.out.println(obj2.getmark()  + " : "+ obj2.getname());
		
	}

}


class College
{
	private int mark;
	private String name;
	
	public College() 
	{
		mark = 100;
		name = "abhi";
	}
	
	public College(int mark , String name) 
	{
	this.mark = mark;
	this.name = name;
	}
	
	
	public int getmark() 
	{
		return mark;
	}
	
	public void setmark(int mark) 
	{
		this.mark = mark;
	}
	
	public String getname()
	{
		return name;
	}
	public void setname(String name) 
	{
		this.name = name;
	}
	
}