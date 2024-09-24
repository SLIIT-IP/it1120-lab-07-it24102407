import java.util.Scanner;

public class IT24102885Lab7Q3
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		int i;
		
	  for(i = 1; i<=5; i++)
	  {
		  System.out.println("Customer "+i);
		  System.out.print("Enter total bill amount: ");
		  int amount = input.nextInt();
		  System.out.print("Enter mode of payment (C for cash, 0 for other): ");
		  char mode = input.next().charAt(0);
		  
		  if(mode=='C' || mode=='c')
		  {
			  double discount = amount*0.05;
		  System.out.println("Discount is : "+discount);
		  
		  double LastAmount = amount-discount;
		  System.out.print("Amount to be paid: "+LastAmount);
		  }
		  else if(mode=='O' || mode=='o')
		  {
			  System.out.println("No discount applicable");
			  double LastAmount1 = (int)amount;
			  System.out.print("Amount to be paid: "+LastAmount1);
		  }
		  else
		  {
			  System.out.print("Payment Mode is Not Valid");
		  }
		  
		  System.out.println("\n");
		  
		  
		  
		  
	  }
	  
	  
	}
}