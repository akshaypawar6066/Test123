package PatternPackage.com;

public class ForLoopButterfly 
{
	public static void main(String[] args)
	{
		
		for(int b=1;b<=6;b++)
		{
			for(int a=1;a<=b;a++)
			{
				System.out.print("*");
			}
			for(int c=1; c<=(6-b);c++)
			{
				System.out.print(" ");
			}
			for(int c=1; c<=(6-b);c++)
			{
				System.out.print(" ");
			}
			for(int a=1;a<=b;a++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		for(int a=1;a<=5;a++)
		{
			for(int b=1;b<=(6-a);b++)
			{
				System.out.print("*");
			}
			for(int c=1;c<=a;c++)
			{
				System.out.print(" ");
			}
			for(int c=1;c<=a;c++)
			{
				System.out.print(" ");
			}
			for(int b=1;b<=(6-a);b++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	}

