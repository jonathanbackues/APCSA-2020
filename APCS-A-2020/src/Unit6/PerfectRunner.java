package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class PerfectRunner
{
	public static void main( String args[] )
	{
		Perfect test1 = new Perfect(496);
		System.out.println(test1.toString());
		
		Perfect test2 = new Perfect(45);
		System.out.println(test2.toString());
		
		Perfect test3 = new Perfect(6);
		System.out.println(test3.toString());
		
		Perfect test4 = new Perfect(14);
		System.out.println(test4.toString());
		
		Perfect test5 = new Perfect(8128);
		System.out.println(test5.toString());
		
		Perfect test6 = new Perfect(1245);
		System.out.println(test6.toString());
		
		Perfect test7 = new Perfect(33);
		System.out.println(test7.toString());
		
		Perfect test8 = new Perfect(28);
		System.out.println(test8.toString());
		
		Perfect test9 = new Perfect(27);
		System.out.println(test9.toString());
		
		Perfect test10 = new Perfect(33550336);
		System.out.println(test10.toString());
	}
}

