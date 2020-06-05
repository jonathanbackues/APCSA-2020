package FinalProjectJonathanBackues;

import java.util.ArrayList;

public class Players {

	private int wins;
	private int losses;
	private float rating;
	private String ign;

	
	public Players (int a, int b, String c) {
		setWins(a);
		setLosses(b);
		setRating(a,b);
		setIGN(c);
	}
	
	public void setIGN (String c) {
		ign = c;
	}
	
	public void setWins (int a) {
		wins = a;
	}
	
	public void setLosses(int b) {
		losses = b;
	}

	public void setRating(int a, int b) {
		rating = a/b;
	}
	
	public int getWins() {
		return wins;
	}
	
	public int getLosses() {
		return losses;
	}
	
	public float getRating() {
		return rating;
	}
	
	public String getIGN() {
		return ign;
	}
	
}
