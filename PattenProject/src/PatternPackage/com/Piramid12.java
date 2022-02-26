package PatternPackage.com;

import java.util.Scanner;

public class Piramid12
{
	public static void main(String[] args)
	{
		
	
	Scanner scn=new Scanner(System.in);
    System.out.println("Enter the no :-");
    int N=scn.nextInt();
    
		for (int a = 1; a<= N; a++)
		{
			for (int b = 1; b<= N - a; b++) 
			{
				System.out.print("  ");
			}
			for (int b = 1; b<= a; b++) 
			{
				System.out.print(b + " ");
			}
			for(int b=a-1; b>=1; b--)
			{
				System.out.print(b + " ");
			}
			System.out.println();
		}
	}
}
