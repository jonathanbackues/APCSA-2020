package FinalProjectJonathanBackues;

import java.util.ArrayList;
import java.util.Scanner;


public class Staff {

	private int teamNumber;
	private int playerNumber;
	
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
	
	public void setPlayerIGN(String a) {
		Teams.getTeams().get(teamNumber).getPlayers().get(playerNumber).setIGN(a);
	}
	
	public void getPlayerWins() {
		Teams.getTeams().get(teamNumber).getPlayers().get(playerNumber).getWins();
	}
	
	public void getPlayerLosses() {
		Teams.getTeams().get(teamNumber).getPlayers().get(playerNumber).getLosses();
	}
	
	public void getPlayerIGN() {
		Teams.getTeams().get(teamNumber).getPlayers().get(playerNumber).getIGN();
	}
	
	
}
