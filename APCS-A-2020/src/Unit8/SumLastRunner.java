//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -
package Unit8;
public class SumLastRunner
{
	public static void main( String args[] )
	{							
		int test1[] = {-99,1,2,3,4,5,6,7,8,9,10,5};
		System.out.println(RaySumLast.go(test1));
		
		int test2[] = {10,9,8,7,6,5,4,3,2,1,-99};
		System.out.println(RaySumLast.go(test2));
		
		int test3[] = {10,20,30,40,50,-11818,40,30,20,10};
		System.out.println(RaySumLast.go(test3));
		
		int test4[] = {32767};
		System.out.println(RaySumLast.go(test4));
		
		int test5[] = {255,255};
		System.out.println(RaySumLast.go(test5));
		
		int test6[] = {9,10,-88,100,-555,2};
		System.out.println(RaySumLast.go(test6));
		
		int test7[] = {10,10,10,11,456};
		System.out.println(RaySumLast.go(test7));

		int test8[] = {-111,1,2,3,9,11,20,1};
		System.out.println(RaySumLast.go(test8));
		
		int test9[] = {9,8,7,6,5,4,3,2,0,-2,6};
		System.out.println(RaySumLast.go(test9));
		 
		int test10[] = {12,15,18,21,23,1000};
		System.out.println(RaySumLast.go(test10));
		
		int test11[] = {250,19,17,15,13,11,10,9,6,3,2,1,0};
		System.out.println(RaySumLast.go(test11));
		
		int test12[] = {9,10,-8,10000,-5000,-3000};
		System.out.println(RaySumLast.go(test12));
		
	}
} 