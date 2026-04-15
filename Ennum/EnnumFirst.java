package Ennum;

enum day
{
	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}

public class EnnumFirst 
{
	public static void main(String[] args) 
	{
		day[] obj = day.values();
		
		for(day ss : obj) 
		{
			System.out.println(ss);
		}
		 
	}

}
