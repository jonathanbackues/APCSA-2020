package Unit5;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
	private static String beg;
	private static String end;
	private static String vowels = "aeiouAEIOU";
    public static String go( String a )
	{
    	beg = a.substring(0,1);
	    end = a.substring(a.length()-1);
	    if (vowels.contains(beg) == true) {
		   return "yes";
	    }
	    else if (vowels.contains(end) == true) {
 		   return "yes";
 	    } else return "no";
	}
}