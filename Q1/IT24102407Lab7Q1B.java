import java.util.Scanner;

public class IT24102407Lab7Q1B
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		int i;
		
		for(i=1; i<=3; i++)
	    {
			System.out.println("Student "+i);
			System.out.print("Enter marks: ");
			double m1 = input.nextInt();
			double m2 = input.nextInt();
			double m3 = input.nextInt();
			double m4 = input.nextInt();
			
			double avg = (m1 + m2 + m3 + m4)/4;
			System.out.println("Average is : "+avg);
			
			
			if(avg>=0 && avg<=49)
			{
				System.out.println("Overall Grade is : Fail");
			}
			else if(avg>=50 && avg<=74)
			{
				System.out.println("Overall Grade is : Credit");
			}
			else if(avg>=75 && avg<=100)
			{
				System.out.println("Overall Grade is : Distinction");
			}
			
			System.out.println("\n");
			
		}
		
		
	}
}