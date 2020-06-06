package FinalProjectJonathanBackues;

import java.util.ArrayList;

public class Team {
	
	private ArrayList<Players> players;
	private float rating;
	private String teamName; 
	
	public Team(String a) {
		setTeamName(a);
		createPlayers();
	}
	
	public void createPlayers() {
		players = new ArrayList<Players>();
		for (int i = 1; i<6; i++) {
			players.add(new Players(1,1,"Player"+i));
		}
	}
	
	public ArrayList<Players> getPlayers() {
		return players;
	}
	
	
	public float getRating(){
		return rating;
	}	
	
	public void setRating() {
		rating = 0;
		for (int i = 1; i<5; i++) {
			rating += players.get(i).getRating();
		}
	}
	
	public void setTeamName(String a) {
		teamName = a;
	}
	
	public String returnTeamName() {
		return teamName;
	}
}
