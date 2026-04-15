package Arrays;

public class Array 
{
	public static void main(String[] args) 
	{
	 student obj = new student ();
	 obj.Roll_no = 01;
	 obj.Name="Abhi";
	 obj.Mark = 99;
	 obj.Father_Name="Siva";
	 
	 student obj1 = new student ();
	 obj1.Roll_no = 02;
	 obj1.Name="Arul";
	 obj1.Mark = 80;
	 obj1.Father_Name="Velmurugan";
	 

	 student obj2 = new student ();
	 obj2.Roll_no = 03;
	 obj2.Name="Kavin";
	 obj2.Mark = 59;
	 obj2.Father_Name="Gnansen";
	 
	 
	 student stu[] =  new student[3];
	 stu[0] = obj;
	 stu[1] = obj1;
	 stu[2] = obj2;
	 
	 for(student x : stu ) 
	 {
		 System.out.println(x.Roll_no + " " + x.Name + " " + x.Mark + " " +x.Father_Name);
	 }
		
	}
}

class student 
{
	int Roll_no;
	String Name;
	int Mark;
	String Father_Name;
}
