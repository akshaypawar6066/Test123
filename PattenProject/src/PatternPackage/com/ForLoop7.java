package PatternPackage.com;

public class ForLoop7 {
	public static void main(String[] args) {
		for(int b=1;b<=6;b++)
		{
			for(int a=(6-b);a>=1;a--)
			{
				System.out.print(" ");
				
			}
			for(int c=1;c<=2*b-1;c++)
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
				for(int f=1;f<=2*d-1;f++)
				{
					System.out.print("*");
				}
				System.out.println();
		}
	}
	

}
