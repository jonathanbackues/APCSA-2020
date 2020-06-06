package FinalProjectJonathanBackues;

import java.util.ArrayList;
import FinalProjectJonathanBackues.Teams;

public class Simulate {
	
	private int winner;
	
	public Simulate (int a, int b) {
		if (Teams.getTeams().get(a).getRating() > Teams.getTeams().get(b).getRating()){
			winner = a+1;
		} else if (a == b){
			winner = 6;
		} else winner = b+1;
	}
	
	public int getWinner() {
		
		return winner;
	}
}
