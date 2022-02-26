package PatternPackage.com;
import java.util.*;
public class ForLoop15 
{
	
public static void main(String[] args) 
{
	int a, b,n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any number");
	n=sc.nextInt();
	for(int i=1; i<=n; i++)
	{
		for( b=1; b<=i; b++)
		{
			System.out.print(i);
			
		}
		System.out.println();
	}
}
}
