//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  
package Unit7;
import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner {

	public static void main(String[] args) {
		run();
	}

	public static void run() {
		int move;
		String moveName = "";
		Scanner scan = new Scanner(System.in);

		System.out
				.println("Make your move: \n(1) Rock\n(2) Paper\n(3) Scissors");
		move = scan.nextInt();

		switch (move) {
		case 1:
			moveName = "Rock";
			break;
		case 2:
			moveName = "Paper";
			break;
		case 3:
			moveName = "Scissors";
			break;
		}

		RockPaperScissors gameObj = new RockPaperScissors(move, moveName);
		System.out.println(gameObj.decideWinner() + "\n\n");
		System.out.println("Do you want to play again? y/n");
		String again = scan.next();
		if(again.toLowerCase().equals("y")) {
			run();
		}
	}
	
}





