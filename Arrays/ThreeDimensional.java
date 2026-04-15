package Arrays;

public class ThreeDimensional 
{
	public static void main(String[] args) 
	{
		int num [][][] = new int[3][4][];
		
		 
		
		for(int i =0;i<num.length;i++) 
		{
			System.out.println("Block" + i);
			for(int j=0;j<num[i].length;j++) 
			{
				for(int k=0;k<num[i][j].length;k++) 
				{
					num[i][j][k] = (int)(Math.random() * 100);
					System.out.print(num[i][j][k] + "  ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
