package Arrays;

import java.util.Arrays;

public class CreatingArray 
{
	public static void main(String[] args) 
	{
		int num[] = {111,34,55,66}; // Create this with random number
		System.out.println(Arrays.toString(num));
		
		
		int num1[] = new int[5]; // creating the array with fixed number
		num1[0] = 55;
		num1[1] = 66;
		num1[2] = 77;
		num1[3] = 88;
		num1[4] = 28;
		
		for(int i = 0 ;i<5 ; i++) 
		{
			System.out.println(num1[i]);
		}
 	}

}
