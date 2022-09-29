import java.util.Scanner;

//  WAP to accept a no from user and display the multiplication table (5*1=5-------5*10=50)


public class Assignment_28_Table
{

	public static void main(String[] args)
	{


	  Assignment_28_Table obj = new Assignment_28_Table();
      obj.mul1();
      obj.mul2();

}
	public void mul1()    //Single table display
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number:");
		int n = s.nextInt();
		for (int i = 1; i <= 10; i++)
		{
			System.out.println(n + " * " + i + " = " + n * i);
		}
	}

	public void mul2()  //1 to 10 table display
	{
		System.out.println("The Multiplication Table from 1 to 10: \n");
		for (int i = 1; i <= 10; i++)
		{
			for (int j = 1; j <= 10; j++)
			{
				System.out.print(j + "*" + i + "=" + i * j + "\t");
			}
			System.out.println();
		}
	}

}