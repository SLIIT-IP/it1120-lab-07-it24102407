import java.util.Scanner;

public class IT24102407Lab7Q1A
{
public static void main(String[]args)
{
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter marks for four subjects: ");
	
	int i = 1;
	int mark;
	int sum = 0;
	
	 while(i<5)
	 {
		 System.out.print("Enter Subject Mark "+i+": ");
		 mark = input.nextInt();
		 i++;
		 sum = sum + mark;
	 }
	 System.out.println(" ");
	 double avg = sum/4;
	 System.out.println("Average is : "+avg);
	 
	 if(avg>=0 && avg<=49)
	 {
		 System.out.println("Overall Grade is : Fail");
	 }
	 else if(avg>=50 && avg<=74 && avg>49)
	 {
		 System.out.println("Overall Grade is : Credit");
	 }
	 else if(avg>74 && avg>=75 && avg<=100)
	 {
		 System.out.println("Overall Grade is : Distinction");
	 }
}
}