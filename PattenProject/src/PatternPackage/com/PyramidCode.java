package PatternPackage.com;

public class PyramidCode 
{
public static void main(String[] args)
    {
	
	
	for(int a=1;a<=6;a++)
	    {
		   for(int b=1;b<=(6-a);b++)
		     {
			System.out.print(" ");
		     }
		       for(int c=1;c<=a;c++)
		        {
			     System.out.print("* ");
		        }
		       for(int b=1;b<=(6-a);b++)
			     {
				System.out.print("  ");
			     }
		       for(int c=1;c<=a;c++)
		        {
			     System.out.print("* ");
		        }
		      
		        System.out.println();
	   }
	    
	for(int a=1;a<=6;a++)
	{
		 for(int c=1;c<=a;c++)
	        {
		     System.out.print(" ");
	        }
		 for(int b=1;b<=(6-a);b++)
	     {
		System.out.print("* ");
	     }
		 for(int c=1;c<=a;c++)
	        {
		     System.out.print("o ");
	        }
	       for(int b=1;b<=(6-a);b++)
		     {
			System.out.print("* ");
		     }
		 System.out.println();
	 
   }
	for(int a=1;a<=6;a++)
    {
	   for(int b=1;b<=(6-a);b++)
	     {
		System.out.print(" ");
	     }
	       for(int c=1;c<=a;c++)
	        {
		     System.out.print("* ");
	        }
	       for(int b=1;b<=(6-a);b++)
		     {
			System.out.print("o ");
		     }
	       for(int c=1;c<=a;c++)
	        {
		     System.out.print("* ");
	        }
	      
	        System.out.println();
   }
    
for(int a=1;a<=6;a++)
{
	 for(int c=1;c<=a;c++)
        {
	     System.out.print(" ");
        }
	 for(int b=1;b<=(6-a);b++)
     {
	System.out.print("* ");
     }
	 for(int c=1;c<=a;c++)
        {
	     System.out.print("  ");
        }
       for(int b=1;b<=(6-a);b++)
	     {
		System.out.print("* ");
	     }
	 System.out.println();
 
}
    }
}
