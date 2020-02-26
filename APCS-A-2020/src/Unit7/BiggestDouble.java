package Unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class BiggestDouble
{
	private double one,two,three,four,bDouble;

	public BiggestDouble()
	{
		this(4.5,6.7,7.8,9.0);
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		one = a;
		two = b;
		three = c;
		four = d;
	}

	public void setDoubles(double a, double b, double c, double d)
	{
		one = a;
		two = b;
		three = c;
		four = d;
	}

	public double getBiggest()
	{
		if ((two>one && two>three) && (two>four)) {
			bDouble = two;
		}
		if ((one>two && one>three) && (one>four)) {
			bDouble = one;
		}
		if ((three>one && three>two) && (three>four)) {
			bDouble = three;
		}
		if ((four>one && four>three) && (four>two)) {
			bDouble = four;
		}
		return bDouble;
	}

	public String toString()
	{
		getBiggest();
	   return one + " "+two+" "+three+" "+four+ "\n"+"biggest = " + bDouble+"\n";
	}
}