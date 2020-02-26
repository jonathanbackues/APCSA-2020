//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  
package Unit7;
import static java.lang.System.*;

public class DoubleRunner
{
	public static void main(String[] args)
	{
		BiggestDouble run = new BiggestDouble(4.5,6.7,7.8,9.0);
		System.out.println(run);

		BiggestDouble run1 = new BiggestDouble(14.51,6.17,71.8,1.0);
		System.out.println(run1);
		
		BiggestDouble run2 = new BiggestDouble(41.15,816.7,17.8,19.0);
		System.out.println(run2);
		//add more test cases
		
		BiggestDouble run3 = new BiggestDouble(4.5,-456.7,677.8,9.0);
		System.out.println(run3);
		
		BiggestDouble run4 = new BiggestDouble(4.5,16.7,-7.8,-9.0);
		System.out.println(run4);
				
	}
}