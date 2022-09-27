import java.util.Scanner;

/*WAP to Accept a no from the user and perform the following task
1:Logical Operator
2: Arithmetic Operation
3: Reverse of the No
4: swapping of two no with third variable
5:Swapping without third variable
6:Accept the value find out the factorial and pass the value of factorial to another function 7
7:Find out the sm of digit

*/


public class Assignment_26 
{
 int a,b,c;
 Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		Assignment_26 ass=new Assignment_26();
		ass.accept_Num();
		ass.logical_Operator();
		ass.Arithmetic_Operation();
		ass.swap_Using_temp();
		ass.Swap();
	  
		int num;
		System.out.println("Enter number");
		 num=ob.nextInt();
		System.out.println("factorial is = "+ ass.Factorial(num));
		int fact=ass.Factorial(num);
		System.out.println("Sum of Digit is ="+ass.SOD(fact));
	}
		
	public void accept_Num()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		a=sc.nextInt();
		System.out.println("Enter number");
		b=sc.nextInt();
		System.out.println("Enter number");
		c=sc.nextInt();
	}
	
		public void logical_Operator()
		{
			
			System.out.println("Logical And (&&)  "); //if both condition is true then and only then loop will executed
		     if(a>b && a>c)
		     {
		    	 System.out.println(a+" is greater ");
		     }
		     else if(b>c)
		     {
		    	 System.out.println(b+" is greater ");
		     }
		     else
		    	 System.out.println(c+" is greater ");
		     
		     System.out.println("Logical or (||) ");//if any one of them  condition is true then  loop will executed
		     if(a>b || a>c || b>a || c>b)
		     {
		    	 System.out.println("if condition is true add a b and c = "+(a+b+c));
		     }
		     
		    
			    System.out.println("NOT Operator(!)");   // ! operator
			    System.out.println(!(a == b));  
			    System.out.println(!(a > b));
			    System.out.println(!(a < b));  
		}
		
		public void Arithmetic_Operation()
		{
			System.out.println("Addition of "+a+" + "+b+ " = "+(a+b));
			System.out.println("Subtraction of "+a+" - "+b+ " = "+(a-b));
			System.out.println("Mulptication of "+a+" * "+b+ " = "+(a*b));
			System.out.println("Division of "+a+" / "+b+ " = "+(a/b));
			System.out.println("Modules of "+a+" % "+b+ " = "+(a%b));
		
		}
		
		public int reverse() 
		{
			int num= a+b+c,r,rev=1; // for multiplication operation we initialize 1  
			
			if(num<=0)
			{
				System.out.println(" number = "+num);
				r=num%10;  //remainder
				num=num/10;
				rev=rev*10+r; // reverse 
			}
			return rev;
			
		}
		
		public void swap_Using_temp()
		{
			
			System.out.println("Before Swapping a = "+a+" b= "+b);
			c=a;
			a=b;
			b=c;
			System.out.println("After Swapping a = "+a+" b= "+b);
			
		}
		

		public void Swap()
		{
			System.out.println("Before Swapping a = "+a+" b= "+b); //a=10 b=20
			a=a+b;   // we take addition of no for getting numbers //  a= 10+20=30
			b=a-b;  //b=30-20=10
			a=a-b;    //a=30-10=20
			System.out.println("After Swapping a = "+a+" b= "+b);
			
			
		}
		public int Factorial(int num)
		{
		    int f=1;
			
			while(num!=0)
			{
				f=f*num;  // f=1*6=6  f=6*5=30 f30*4 120*2 240*1 240
				num--;
			}
		return f;
		 
		}
		
		public int SOD(int num)
		{
			int sum=0,d;
			while(num!=0) //we take while because we want stop this loop when number is  not equal to  0 
			{
				d=num%10;   
				sum=sum+d;
				num=num/10;
			}
			return sum;
		}

}
