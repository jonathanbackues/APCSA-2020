package Unit4;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 
import java.util.Scanner;

public class AddSubMult
{
	private static double ans;
	public static double check( double a, double b )
	{
		if(a > b) {
			ans = a-b;
		}
		else if(b > a){
			ans = b-a;	
		}
		else {
			ans = a * b;
		}
		
		return ans;
	}
}