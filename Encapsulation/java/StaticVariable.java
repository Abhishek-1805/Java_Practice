package Encapsulation.java;



public class StaticVariable 
{
	public static void main(String[] args) 
	{
		cricket obj = new cricket();
		obj.jerry_no= 5;
		obj.name="Rohit Sharma";
		obj.hunders=88;
		
		cricket obj2 = new cricket();
		obj2.jerry_no =7;
		obj2.name = "Dhoni";
		obj2.hunders=100;
		
	    cricket.team_name = "India";
	    
	    obj.show();
	    obj2.show();
	}

}

class cricket
{
	int jerry_no;
	String name;
	int hunders;
	static String team_name;
	
	public void show() 
	{
		System.out.println(jerry_no + " -----> " + name + " -----> " + hunders + " ----->   " + team_name);

	}
	
}
