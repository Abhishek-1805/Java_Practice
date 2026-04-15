package Interface;

interface School
{
	void bus();
	void teach();
	
}

class higer implements School
{
	public void bus() 
	{
		System.out.println("Pick the Students");
	}
	
	public void teach() 
	{
		System.out.println("Student Teaches");
	}
	}

public class first 
{
	public static void main(String[] args) 
	{
		 School obj = new higer();
		  obj.bus();
		  obj.teach();
		
	}
	 
	  
	 
	

}
