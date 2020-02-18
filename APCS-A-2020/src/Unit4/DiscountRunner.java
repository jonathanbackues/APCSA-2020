package Unit4;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		System.out.println("Bill after discount:: "+String.format("%.2f",Discount.getDiscountedBill(amt)));
		
		System.out.print("Enter the original bill amount :: ");
		double amt2 = keyboard.nextDouble();
		System.out.println("Bill after discount:: "+String.format("%.2f",Discount.getDiscountedBill(amt2)));

		System.out.print("Enter the original bill amount :: ");
		double amt3 = keyboard.nextDouble();
		System.out.println("Bill after discount:: "+String.format("%.2f",Discount.getDiscountedBill(amt3)));
		
		System.out.print("Enter the original bill amount :: ");
		double amt4 = keyboard.nextDouble();
		System.out.println("Bill after discount:: "+String.format("%.2f",Discount.getDiscountedBill(amt4)));
		
		System.out.print("Enter the original bill amount :: ");
		double amt5 = keyboard.nextDouble();
		System.out.println("Bill after discount:: "+String.format("%.2f",Discount.getDiscountedBill(amt5)));
		
		
		
		

	}
}