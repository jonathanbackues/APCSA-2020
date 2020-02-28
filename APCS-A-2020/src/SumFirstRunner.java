//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -
package Unit9;
import java.util.ArrayList;
import java.util.Arrays;
public class SumFirstRunner
{
	public static void main( String args[] )
	{							
		Integer[] arr = {-99,1,2,3,4,5,6,7,8,9,10,5};
		ArrayList<Integer> ar = new ArrayList<Integer>(Arrays.asList(arr));
		System.out.println(ListSumFirst.go(ar));
		
		Integer[] arr1 = {10,9,8,7,6,5,4,3,2,1,-99};
		ar = new ArrayList<Integer>(Arrays.asList(arr1));
		System.out.println(ListSumFirst.go(ar));
		
		Integer[] arr2 = {10,20,30,40,50,-11818,40,30,20,10};
		ar = new ArrayList<Integer>(Arrays.asList(arr2));
		System.out.println(ListSumFirst.go(ar));
		
		Integer[] arr3 = {32767};
		ar = new ArrayList<Integer>(Arrays.asList(arr3));
		System.out.println(ListSumFirst.go(ar));
		
		Integer[] arr4 = {255,255};
		ar = new ArrayList<Integer>(Arrays.asList(arr4));
		System.out.println(ListSumFirst.go(ar));
		
		Integer[] arr5 = {10,10,10,11,456};
		ar = new ArrayList<Integer>(Arrays.asList(arr5));
		System.out.println(ListSumFirst.go(ar));
		
		Integer[] arr6 = {-111,1,2,3,9,11,20,1};
		ar = new ArrayList<Integer>(Arrays.asList(arr6));
		System.out.println(ListSumFirst.go(ar));
		
		Integer[] arr7 = {9,8,7,6,5,4,3,2,0,-2,6};
		ar = new ArrayList<Integer>(Arrays.asList(arr7));
		System.out.println(ListSumFirst.go(ar));
		
		Integer[] arr8 = {12,15,18,21,23,1000};
		ar = new ArrayList<Integer>(Arrays.asList(arr8));
		System.out.println(ListSumFirst.go(ar));
		
		Integer[] arr9 = {250,19,17,15,13,11,10,9,6,3,2,1,0};
		ar = new ArrayList<Integer>(Arrays.asList(arr9));
		System.out.println(ListSumFirst.go(ar));
		
		Integer[] arr10 = {9,10,-8,10000,-5000,-3000};
		ar = new ArrayList<Integer>(Arrays.asList(arr10));
		System.out.println(ListSumFirst.go(ar));
	}
}