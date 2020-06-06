package FinalProjectJonathanBackues;

import java.util.ArrayList;
import java.util.Scanner;


public class Staff {

	private int teamNumber;
	private int playerNumber;
	
	public Staff(int a, int b) {
		chooseTeamNumber(a);
		choosePlayerNumber(b);
	}
	
	public void chooseTeamNumber(int a) {
		teamNumber = a;
	}
	
	public void choosePlayerNumber(int a) {
		playerNumber = a;
	}

	public void setPlayerWins(int a) {
		Teams.getTeams().get(teamNumber).getPlayers().get(playerNumber).setWins(a);
	}
	
	public void setPlayerLosses(int a) {
		Teams.getTeams().get(teamNumber).getPlayers().get(playerNumber).setLosses(a);
	}
	
	public void setPlayerRating() {
		Teams.getTeams().get(teamNumber).getPlayers().get(playerNumber).setRating();
	}
	
	public int getPlayerWins() {
		return Teams.getTeams().get(teamNumber).getPlayers().get(playerNumber).getWins();
	}
	
	public int getPlayerLosses() {
		return Teams.getTeams().get(teamNumber).getPlayers().get(playerNumber).getLosses();
	}
	
	public float getPlayerRating() {
		return Teams.getTeams().get(teamNumber).getPlayers().get(playerNumber).getRating();
	}
	
	public void setTeamRating(int a) {
		Teams.getTeams().get(teamNumber).setRating();
	}
	
}
