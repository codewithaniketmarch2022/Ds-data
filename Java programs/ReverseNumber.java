//Write a program to REVERSE the number?
import java.util.Scanner;	
class ReverseNumber	
{	
	 public static void	main(String[] args)		
	 {	
	 	 Scanner sc = new Scanner(System.in);	
	 	 System.out.println("Enter the Number: ");
	 	 int num = sc.nextInt();	
	 	 int t = num;	
	 	 int rev = 0;	
	 	
	 	 while(num!=0)	
	 	 {	
	 	 	 rev = rev * 10 + (num % 10);	
	 	 	 num = num/10;	
	 	 }	
	 	 System.out.println("The Number in reverse order is:"+rev);	
	 }	
}