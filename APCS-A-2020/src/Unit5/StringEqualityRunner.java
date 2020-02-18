package Unit5;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		StringEquality test1 = new StringEquality();
		test1.setWords("hello","goodbye");
		test1.checkEquality();
		System.out.println(test1.toString());
		
		test1.setWords("one","two");
		test1.checkEquality();
		System.out.println(test1.toString());
		

		test1.setWords("three","four");
		test1.checkEquality();
		System.out.println(test1.toString());
		

		test1.setWords("TCEA","UIL");
		test1.checkEquality();
		System.out.println(test1.toString());
		

		test1.setWords("State","Champions");
		test1.checkEquality();
		System.out.println(test1.toString());
		

		test1.setWords("ABC","ABC");
		test1.checkEquality();
		System.out.println(test1.toString());
		

		test1.setWords("ABC","CBA");
		test1.checkEquality();
		System.out.println(test1.toString());
		

		test1.setWords("Same","Same");
		test1.checkEquality();
		System.out.println(test1.toString());
		
		
	}
}