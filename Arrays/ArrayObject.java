package Arrays;

public class ArrayObject 
{
	public static void main(String[] args)
	{
		csk obj = new csk();
		obj.JerseyNo = 7;
		obj.Name ="Thala";
		obj.cup = 5;
		
		csk obj1 = new csk();
		obj1.JerseyNo = 31;
		obj1.Name ="Rutu";
		obj1.cup = 2;
		
		csk chennai [] = new csk[2];
		chennai[0] = obj;
		chennai[1] = obj1;
		
		for(csk m : chennai) 
		{
			System.out.println( m.Name + " " + m.JerseyNo +"  " +  m.cup);
		}
		
		
	}

}

class csk
{
	int JerseyNo;
	String Name;
	int cup;
}
