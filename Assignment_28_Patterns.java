import java.util.Scanner;

public class Assignment_28_Patterns 
{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Assignment_28_Patterns as=new Assignment_28_Patterns();
		as.pattern1();
		as.pattern2();
		as.pattern3();
		as.pattern4();
		
	}
	
	
	
	/*
 A
AB
ABC
ABCD
ABCDE

	 */
	
	public static void pattern1()
	{
		Scanner sc=new Scanner(System.in);
		int size,i,j;
		char ch;
		System.out.println("Enter the size:");
		size=sc.nextInt();
		for(i=1;i<=size;i++)
		{
			for(j=1,ch=65;j<=i;j++,ch++)
			{
				System.out.print(ch);
				
			}
			System.out.println();
		}
	}
	
  /*  
    1
   12
  123
 1234
12345
*/
	
	public static void pattern2()
	{
		Scanner sc=new Scanner(System.in);
		int size,i,j,k;
		char ch;
		System.out.println("Enter the size:");
		size=sc.nextInt();
		for(i=1;i<=size;i++)
		{
			for(j=i;j<=size;j++)
			{
				System.out.print(" ");
			}	
			for(k=1;k<=i;k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}
	

	
	
	/*  
    * 
   ***
  *****
 *******
*********
	 */
	
	public static void pattern3()
	{
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.println("Enter the size:");
		size=sc.nextInt();
		 for (int i=1; i<=size; i++) //outer loop for number of rows(n) 
         { 
			 for (int j=i; j<=size; j++ )
			 {
				 System.out.print(" "); //print space
	         }  
			 for (int j=1; j<i; j++ )
			 {
				 System.out.print("*"); //print space

			 }
			 for (int j=1; j<=i; j++ )
			 {
				 System.out.print("*"); //print space

			 }
          
         System.out.println(); //ending line after each row
     } 
	
}
	
/*	
	10101
	 0101
	  101
	   01
	    1 
*/
	
	public static void pattern4()
	{
		Scanner sc=new Scanner(System.in);
		int size,i,j,k;
		char ch;
		System.out.println("Enter the size:");
		size=sc.nextInt();
		for(i=1;i<=size;i++)
		{
			for(j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for( k=i;k<=size;k++)
			{
				if(k%2==0)
				{
					System.out.print("0");
				}
				else
				{
				System.out.print("1");
				}
				
			}
			System.out.println();
		}
	}
	
}
