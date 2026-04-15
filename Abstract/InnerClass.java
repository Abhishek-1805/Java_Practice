package Abstract;

class college
{
	public void KSR() 
	{
		System.out.println("This is my College");
	}
	
	class Student
	{
		public void MCA() 
		{
			System.out.println("Master Of Computer Applications");
		}
	}
	
}

public class InnerClass 
{
	public static void main(String[] args) 
	{
		college obj = new college();
		obj.KSR();
		
		college.Student obj1 = obj.new Student();
		obj1.MCA();
		

		
	}

}
