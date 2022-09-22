
/*
Create a menu for food counter and accept the items from user and display the final Bill amount with the item is ordered
*/



import java.util.Scanner;

public class Assignment_21 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int menu_item,menu1,i_price=0,quantity=0;
		char ans;
		String i_name="";
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
				switch(menu1)   //second switch for counting the bill,display item name and calculate quantity
				{
				case 1:
					i_price+=250;    //for price
					i_name+="\n Veg Momos ";   //for item name
					quantity+=1;     ///add quantity name
					break;
				case 2:
					i_price+=300;
					i_name+="\nMini Pizza Topped with Olive";
					quantity+=1;
					break;
				case 3:
					i_price+=100;
					i_name+="\nPanipuri";
					quantity+=1;
					break;
				default:
					System.out.println("Invalid choice");
						
				}
				break;
			case 2:
				System.out.println("1:Butter Chicken\t 500Rs");
				System.out.println("2:Palak Paneer\t\t 300Rs.");
				System.out.println("3:Biryani \t\t 250Rs");
				menu1=sc.nextInt();
				switch(menu1)
				{
				case 1:
					i_price+=500;
					i_name+="\nButter Chicken";
					quantity+=1;
					break;
				case 2:
					i_price+=300;
					i_name+="\nPalak Paneer";
					quantity+=1;
					break;
				case 3:
					i_price+=250;
					i_name+="\nBiryani";
					quantity+=1;
					break;
				default:
					System.out.println("Invalid choice");
						
				}
				break;
			case 3:
				System.out.println("1:Rasmali Cakes\t\t 700Rs");
				System.out.println("2:Ice Cream\t\t 250Rs");
				System.out.println("3:CupCake\t\t 400Rs");
				menu1=sc.nextInt();
				switch(menu1)
				{
				case 1:
					i_price+=700;
					i_name+="\n Rasmali Cakes";
					quantity+=1;
					break;
				case 2:
					i_price+=250;
					i_name+="\n Ice Cream";
					quantity+=1;
					break;
				case 3:
					i_price+=400;
					i_name+="\n CupCake";
					quantity+=1;
					break;
				default:
					System.out.println("Invalid choice");
						
				}
				break;
			
			}
			System.out.println("Do you want to addd another item y/n");   //for break or continue this all menu
			ans=sc.next().charAt(0);
		}
		while(ans=='Y'||ans=='y');
		System.out.println("Thanks for coming");
		System.out.println("The Food Items ARE:\n"+i_name);           //display item name
		System.out.println("The Total bill amount is:"+i_price);       //display price
		System.out.println("The Total bill amount is:"+quantity);       //display total  quantity
	}

}
