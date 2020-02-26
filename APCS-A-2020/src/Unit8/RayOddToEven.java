//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -
package Unit8;
public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int posOdd = 0;
		int posEven = 0;
		int difference = 0;
		for(int i=0;i<ray.length;i++) {
			if(ray[i]%2 == 1) {
				posOdd = i;
				break;
			}		
		}
		for(int i = 0;i<ray.length;i++) {
			if(ray[i]%2 == 0) {
				posEven = i;
				break;
			}
		}
		if(posOdd < posEven) {
			difference = posEven - posOdd;
		}else difference = -1;
		
		return difference;
	}
}  