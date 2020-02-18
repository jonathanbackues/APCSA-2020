package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;
   
   public Perfect() {
	   number = 1;
   }
   
   public Perfect(int num) {
	   number = num;
   }
   
   public void setPerfect(int num) {
	   number = num;
   }
   
	//add constructors

	//add a set method

	public boolean isPerfect()
	{
		int i = 1;
		int count = 0;
		while (i <= number/2) {
			if (number%i == 0) {
				count+=i;
			}
		}
		if(count == number) {
			return true;
		}
		
		return false;
	}
	
	public String toString() {
		if(isPerfect()) {
			return number + " is perfect";
		} else {
			return number + " is not perfect";
		}
	}

	//add a toString	
	
	
}