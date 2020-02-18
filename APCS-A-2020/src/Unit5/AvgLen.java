package Unit5;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class AvgLen
{
	private static double average;
	public static double go( String a, String b )
	{
		average = 0.5*(a.length() + b.length());
		return average;
	}
}