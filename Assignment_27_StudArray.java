
/*
 * WAP to accept  accept Student name , Marks of 5 subject, calculate the Percentage and display the grade
 * Komal Mahale
 */



import java.util.Scanner;

public class Assignment_27_StudArray 
{

	public static void main(String[] args)
	{
		Assignment_27_StudArray as= new Assignment_27_StudArray();
		as.acceptName();
		int arr[]=as.acceptMarks();
		as.Percentage(arr);
	}
	
	public static String[] acceptName()     ///student name
	{
		int i,size;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of Student");  
		size=sc.nextInt();                       //size accept from user
		String name[]=new String[size];
		for(i=0;i<size;i++)
		{
			System.out.println("Enter name of Student = "+(i+1));
			name[i]=sc.next();
		}
		return name;
	}
	
	public static int[] acceptMarks()   //student marks
	{
		int i;
		Scanner sc=new Scanner(System.in);
		int Marks[]=new int[5];
		for(i=0;i<5;i++)                 ///size by programmer
		{
			System.out.println("Enter marks of Subject = "+(i+1));
			Marks[i]=sc.nextInt();
		}
		return Marks;
	}
	
	
	public static void Percentage(int Marks[])    //from that marks get the percentage  and grade
	{
		int i,sum=0,per;
		for(i=0;i<Marks.length;i++)
		{
			sum=sum+Marks[i];
		}
		System.out.println("Sum of all Marks is : " +sum);
		per=(sum*100)/500;
		System.out.println("Percentage is : " +per+ "%");
		
		
		//find the grade
		System.out.println("grade");
		if(per>=90)
		{
			System.out.println("A ");
		}else if(per>80 && per>70)
		{
			System.out.println("B");
		}
		else if(per>60 && per>50)
		{
			System.out.println("C");
		}
		else 
		{
			System.out.println("Fail");
		}
	}
	    
	

}
