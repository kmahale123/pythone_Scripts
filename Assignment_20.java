//wap for hotel menu to calculate bill and display menu item
//Komal Kishor Mahale

import java.util.Scanner;

public class Assignment_20  
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int menu_item,menu1,total=0;
		char ans;
		Scanner sc=new Scanner(System.in);
		do
		{
System.out.println("Menu:\n1:Starters \n2:Main course \n3:Deserts");
			menu_item=sc.nextInt();
			switch(menu_item)
			{
			case 1:
				System.out.println("1:Veg Momos 1                \t\t 250Rs.");
				System.out.println("2:Mini Pizza Topped with Olive \t\t 300RS");
				System.out.println("3:Panipuri                  \t\t 100RS");
				menu1=sc.nextInt();
				if(menu1==1)
				{
					total=total+250;
					System.out.println("Veg Momos  "+total);
				}else if(menu1==2)
				{
					total=total+300;
					System.out.println("Mini Pizza Topped with Olive "+total);
				}else  if(menu1==3)
				{
					total=total+100;
					System.out.println("Panipuri "+total);
				}	
				
				break;
			case 2:
				System.out.println("1:Butter Chicken\t 500Rs");
				System.out.println("2:Palak Paneer\t\t 300Rs.");
				System.out.println("3:Biryani \t\t 250Rs");
				menu1=sc.nextInt();
				if(menu1==1)
				{
					total=total+500;
					System.out.println("Butter Chicken "+total);
				}else if(menu1==2)
				{
					total=total+300;
					System.out.println("Palak Paneer "+total);
				}else  if(menu1==3)
				{
					total=total+250;
					System.out.println("Biryani "+total);
				}
				break;
			case 3:
				System.out.println("1:Rasmali Cakes\t\t 700Rs");
				System.out.println("2:Ice Cream\t\t 250Rs");
				System.out.println("3:CupCake\t\t 400Rs");
				menu1=sc.nextInt();
				if(menu1==1)
				{
					total=total+700;
					System.out.println("Rasmali Cakes  "+total);
				}else if(menu1==2)
				{
					total=total+250;
					System.out.println("Ice Cream "+total);
				}else  if(menu1==3)
				{
					total=total+400;
					System.out.println("CupCake "+total);
				}
				break;
			
			}
			System.out.println("Do you want to addd another item y/n");
			ans=sc.next().charAt(0);
		}
		while(ans=='Y'||ans=='y');
		System.out.println("Thanks for coming");
		System.out.println("Bill  "+total);
	}

}