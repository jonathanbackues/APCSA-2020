//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  
package Unit7;
import static java.lang.System.*;

public class Triples {
    private int number;

    public Triples() {
        // Does nothing.
    }

    public Triples(int number) {
        this.number = number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String check4Triples() {
        int max = number;
        String ret = "";
        
        for (int a = 1; a <= max; a++) {
            for (int b = a + 1; b <= max; b++) {
                for (int c = b + 1; c <= max; c++) {
                    if (isPythagoreanTriple(a, b, c)
                            && (mod2(a, b) || mod2(b, a))
                            && (greatestCommonFactor(a, b, c) == 1)) {
                        ret += "" + a + " " + b + " " + c + "\n";
                    }
                }
            }
        }

        return ret;
    }

    private boolean isPythagoreanTriple(int a, int b, int c) {
        return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
    }

    private boolean mod2(int a, int b) {
        return (((a % 2) == 1) && ((b % 2) == 0));
    }

    private int greatestCommonFactor(int a, int b, int c) {
        int lowest = min(a, b, c);

        for (int i = lowest; i > 0; i--) {
            if ((a % i == 0) && (b % i == 0)) {
                for (int j = i; j > 0; j--) {
                    if ((i % j == 0) && (c % j == 0)) {
                        return j;
                    }
                }
            }
        }

        return -1;
    }

    private int min(int a, int b, int c) {
        if ((a < b) && (a < c)) {
            return a;
        }

        if ((b < a) && (b < c)) {
            return b;
        }

        return c;
    }

    @Override
    public String toString() {
        return " " + check4Triples() + " \n";
    }

}
