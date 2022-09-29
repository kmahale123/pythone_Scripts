import java.util.Scanner;

/*Q1:Write a program using array accept the size from the user than accordingly 
accept the no from the user and find out the greater no,smaller no, ascending, Descending
*/
public class Assignment_27_Array
{

	public static void main(String[] args) 
	{
		Assignment_27_Array aa=new Assignment_27_Array();
		int arr[]=aa.accept();
		aa.disp(arr);
		aa.Maximum(arr);
		aa.Minimum(arr);
		int num[]=aa.Assending();
		aa.Descending(num);

	}

	public int[] accept()
	{
		Scanner sc=new Scanner(System.in);
		int size,i;
		System.out.println("Enter the size");
		size=sc.nextInt();
		int number[]=new int[size];
		System.out.println("Enter "+size+" Numbers:");
		for(i=0;i<size;i++)
		{
			number[i]=sc.nextInt();
		}
		return number;
	}
	
	public void  disp(int number[])
	{
		int i;
		for(i=0;i<number.length;i++)
		{
			System.out.println(number[i]);
		}
		
	}
		public void Maximum(int a[])
		{
			 int i;
		        int max = a[0];// Initialize maximum element for find max
		         
		        for (i = 1; i < a.length; i++)// compare every element with current max
		            if (a[i] > max)
		                max = a[i];
		         System.out.println("greater number is = "+max);;
		 }
		
		public void Minimum(int a[])
		{
			 int i;
		        int min = a[0];// Initialize minimum element for find min
		        for (i = 1; i < a.length; i++)// compare every element with current min
		            if (a[i] < min)
		                min = a[i];
		        System.out.println("Smaller number is = "+min);
		    }
			
		
		private int[] Assending()
		{
			int num[]=accept();
	        int temp=0,i;
	        for(i=0;i<num.length;i++) 
	        {     
	            for(int j=i+1;j<num.length;j++)
	            {     
	               if(num[i] > num[j])
	               {    
	                   temp = num[i];    
	                   num[i] = num[j];    
	                   num[j] = temp;    
	               }     
	            }     
	        }
	        System.out.println("Elements of array in Ascending order: ");    
	        for (i=0;i<num.length;i++)
	        {     
	            System.out.print(num[i] + "\t ");    
	        }
			return num;   
	        
	  	}
		
		private void Descending(int num[])
		{
	        int temp=0,i;
	        for(i=0;i<num.length;i++) 
	        {     
	            for(int j=i+1;j<num.length;j++)
	            {     
	               if(num[i] < num[j])
	               {    
	                   temp = num[i];    
	                   num[i] = num[j];    
	                   num[j] = temp;    
	               }     
	            }     
	        }
	        System.out.println("\nElements of array in Descending order: ");    
	        for (i=0;i<num.length;i++)
	        {     
	            System.out.print(num[i] + "\t ");    
	        }   

	  	}

	    

}