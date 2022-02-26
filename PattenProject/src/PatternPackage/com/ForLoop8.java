package PatternPackage.com;

public class ForLoop8 {
	public static void main(String[] args) {
		for(int b=1;b<=6;b++)
		{
			for(int a=(6-b);a>=1;a--)
			{
				System.out.print(" ");
			}
			for(int c=1;c<=b;c++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int d=5;d>=1;d--)
		{
			for(int e=(6-d);e>=1;e--)
			{
				System.out.print(" ");
				
			}
			for(int f=1;f<=d;f++)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
		
	
	}

}
