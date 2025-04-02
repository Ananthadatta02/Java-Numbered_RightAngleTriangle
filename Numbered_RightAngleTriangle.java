package number_patterns;

import java.util.Scanner;

/*
1
22
333
4444
 */
public class Numbered_RightAngleTriangle 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = s.nextInt();
		int num = 1;
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(num);
			}
			System.out.println();
			num++;
		}
	}
}
