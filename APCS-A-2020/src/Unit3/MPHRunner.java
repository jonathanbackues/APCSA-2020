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

public class MPHRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(in);

		MilesPerHour test2 = new MilesPerHour();
		test2.calcMPH();
		System.out.println(test2);
		
		out.print("Enter the distance :: ");
		int dist = keyboard.nextInt();

		out.print("Enter the hours :: ");
		int hrs = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		int mins = keyboard.nextInt();

		MilesPerHour test = new MilesPerHour(dist, hrs, mins);
		test.calcMPH();
		System.out.println(test);
		
		//add more test cases
		
		
	}
}