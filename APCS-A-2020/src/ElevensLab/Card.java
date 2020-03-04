//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package ElevensLab;
public class Card {

	
	private String suit;
	private String rank;
	private String face;

	private int pointValue;

	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};
	
	public String getSuit() {
		return suit;
	}
	
	public String getFace() {
		return face;
	}
	
	public int setFace(int face2) {
		return face2;	
	}
	
	public Card(String suit1, int face1) {
		suit = suit1;
		face = FACES[face1];
		pointValue = face1;
		rank = FACES[face1];
	}
	
	public Card(String cardRank, String cardSuit, 
			int cardPointValue) {
		rank = cardRank;
		suit = cardSuit;
		pointValue = cardPointValue;
	}


	public String suit() {
		return suit;
   }

	public String rank() {
		return rank;
	}

 
	public int pointValue() {
		return pointValue;
	}

	public boolean matches(Card otherCard) {
		if(suit==otherCard.suit()&&rank==otherCard.rank()&&pointValue==otherCard.pointValue()){
        return true;	
		}
		return false;
	}
		

	
	public String toString() {
		String a;
		a = rank + " of " + suit  + " (point value = "+ pointValue + ")";
	return a;
	}
	
}
		                   
