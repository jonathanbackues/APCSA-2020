package FinalProjectJonathanBackues;

import java.util.ArrayList;
import FinalProjectJonathanBackues.Players;

public class Teams {
	
	private static ArrayList<Team> teams;
	
	public Teams() {
		createTeams();
	}
	
	public void createTeams() {
		teams = new ArrayList<Team>();
		for(int i = 0; i<5; i++) {
			teams.add(new Team("Team"+1));
		}
	}
	
	public static ArrayList<Team> getTeams() {
		return teams;
	}
	
}
