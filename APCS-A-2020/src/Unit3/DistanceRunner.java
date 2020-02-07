package Unit3;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("X1 :: 1");
		System.out.println("X2 :: 1");
		System.out.println("Y1 :: 2");
		System.out.println("Y2 :: 1");
		
		Distance test1 = new Distance(1, 1, 2, 1);
		test1.calcDistance();
		System.out.println(test1);
		
		System.out.println("X1 :: 1");
		System.out.println("X2 :: 1");
		System.out.println("Y1 :: -2");
		System.out.println("Y2 :: 2");
		
		Distance test2 = new Distance(1, 1, -2, 2);
		test2.calcDistance();
		System.out.println(test2);
		
		System.out.println("X1 :: 1");
		System.out.println("X2 :: 1");
		System.out.println("Y1 :: 0");
		System.out.println("Y2 :: 0");
		
		Distance test3 = new Distance(1, 1, 0, 0);
		test3.calcDistance();
		System.out.println(test3);
		
		
		
	}
}

