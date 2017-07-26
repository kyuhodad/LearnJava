
public class GameEntry {
	/**
	 * 1. Add a member variable for the name, private String type
	 * 2. Add a member variable for the score, private int type
	 * 3. Add a constructor
	 * 		Input: name and score
	 * 4. Add a method to get the name.
	 * 5. Add a method to get the score.
	 * 6. Override toString() method.
	 */
	
	
	
	private String name;
	private int score;
	
	public GameEntry (String n, int s) {
		name = n;
		score = s;
	}
	
	public String getName () {
		return name;
	}
	public int getScore () {
		return score;
	}

	@Override
	public String toString() {
		return "GameEntry [" + name + ", " + score + "]";
	}
	
}
