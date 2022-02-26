package PatternPackage.com;

import java.util.Scanner;

public class UpperPyramid
{
  public static void main(String[] args) 
  {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any number:");
	int n=sc.nextInt();
	for(int b=1;b<=n;b++)
	{
		for(int a=1;a<=b*2-1;a++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
  }
}
