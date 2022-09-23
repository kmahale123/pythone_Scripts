

//First day all basic program
//Komal Kishor Mahale

import java.util.Scanner;

public class Assignment_19 {

	public static void main(String[] args)
	{

		int menu_item;
		char ans;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("Menu:\n1:display a square if no is Divisible by 5  \n2:check eligble for voting or not. \n3:find greater number form 5 numbers\n4: check it is vowel or not\n5:operators");
			menu_item=sc.nextInt();
			switch(menu_item)
			 {
			
	//display a square if no is Divisible by 5	using if	
				 case 1:
					int num,square;
					System.out.println("Enter the number");
					num=sc.nextInt();
					if(num%5==0)
					{
						square=num*num;
						System.out.println(num + "  divisiable by 5 and square of that number is  = "+square);
					}else
						System.out.println(num+ " is not divisiable by 5");
				 break;
//check eligible for voting or not	using if else			 
				case 2:
					int Age;
					System.out.println("Enter the number");
					Age=sc.nextInt();
					
					if(Age>=18)
					{
						System.out.println("person eligible for voting");
					}
					else
					{
						System.out.println("person is not eligible for voting");
					}
				break;
//find greater number form 5 numbers	using else if ladder			
				case 3:
					int num1,num2,num3,num4,num5;
					System.out.println("Enter the number 1");
					num1=sc.nextInt();
					System.out.println("Enter the number 2");
					num2=sc.nextInt();
					System.out.println("Enter the number 3");
					num3=sc.nextInt();
					System.out.println("Enter the number 4");
					num4=sc.nextInt();
					System.out.println("Enter the number 5");
					num5=sc.nextInt();
					
					
					if(num1>num2 && num1>num3 && num1>num4 && num1>num5)
					{
						System.out.println("number 1 is greater = " +num1);
					}
					else if(num2>num3 && num2>num4 && num2>num5)
					{
						System.out.println("number 2 is greater = " +num2);
					}
					else if( num3>num4 && num3>num5)
					{
						System.out.println("number 3 is greater = " +num3);
					}
					else if(num4>num5)
					{
						System.out.println("number 4 is greater = " +num4);
					}
					else
					System.out.println("number 5 is greater = " +num5);
					
				break;
//check it is vowel or not 	 using if else			
				case 4:
					char ch;
					System.out.println("Enter Character");
					ch=sc.next().charAt(0);
					if(ch=='a' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
					{
						System.out.println(ch +" character is vowel");
					}
					else
					{
						System.out.println(ch +" character is consonant");
					}
				break;
				
//operators using switch case				
				case 5:
					int choice;
					System.out.println("Menu \n  1:unary Operator \n 2:Ternary Operator \n 3:Binary operator ");
					choice=sc.nextInt();
					switch(choice)
					{
					case 1:
						int a;
						System.out.println("enter number");
						a=sc.nextInt();
						int b = -a;
						System.out.println("a = "+ a +" unary minu b=-a is "+b);
						 b = ++a;
						System.out.println("a="+a+" prefix increment b= ++a is "+b);
					      b = a++;   // b = 1
						 int c = a;
						System.out.println("a="+a+" postfix increment b=a++ is "+b+" c=a is "+c);
						 b = --a;
						System.out.println("a="+a+" prefix decrement b= --a is "+b);
						 b = a--;   // b = 1
					      c = a;
						System.out.println("postfix decrement b=a-- is "+b+" c=a is "+c);
						 
						break;
					case 2:
						int x,y,result;
						System.out.println("enter first number");
						x=sc.nextInt();
						System.out.println("enter second number");
						y=sc.nextInt();
							result=(x>y)?x:y;
						System.out.println(result+"  is greater");	
						int age;
						System.out.println("enter age");
						age=sc.nextInt();
						String re= (age >= 18) ? "valid": "invalid";
								System.out.println(re);
						break;
					case 3:
						int num11,num21;
						System.out.println("Enter the number 1");
						num11=sc.nextInt();
						System.out.println("Enter the number 2");
						num21=sc.nextInt();
						System.out.println("addition of "+num11+" + "+num21+" = " +(num11+num21));
						System.out.println("Subtraction of "+num11+" - "+num21+" = " +(num11-num21));
						System.out.println("Multiplication of "+num11+" * "+num21+" = " +(num11*num21));
						System.out.println("Modulus of "+num11+" % "+num21+" = " +(num11%num21));
						System.out.println("Division of "+num11+" / "+num21+" = " +(num11/num21));
						System.out.println("bitwise and of "+num11+" & "+num21+" = " +(num11&num21));
						System.out.println("bitwise or of "+num11+" | "+num21+" = " +(num11|num21));
						System.out.println("bitwise XOR of "+num11+" ^ "+num21+" = " +(num11^num21));
						System.out.println("Division of "+num11+" and "+num21+" = " +(num11/num21));
						break;
					}
				break;
			 }
				System.out.println("Do you want to Continue   y/n");
				ans=sc.next().charAt(0);
			}while(ans=='Y'||ans=='y');
			

	}
		
}