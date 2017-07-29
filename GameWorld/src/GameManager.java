import java.util.Arrays;

public class GameManager {
	/**
	 * 1. Add an array holding GameEntry objects
	 * 2. Add a number for GameEntry objects
	 * 3. Add a constructor with the size of GameEntry objects array.
	 * 4. Add a method to get the number of entries.
	 * 5. Add a method to get the entry in given index.
	 * 6. Add a method to add a GameEntry object.
	 * 7. Add a method to remove a GameEntry from specified index.
	 */
		
	
	
	
	private int numberOfEntry = 0;
	private GameEntry [] entries = null;
	
	public GameManager(int maxNumberOfEntries) {
		entries = new GameEntry[maxNumberOfEntries];
	}
	
	public int getNumberOfEntries () {
		return numberOfEntry;
	}
	
	public GameEntry getEntry (int index) {
		return entries[index];
	}
	
	public GameEntry [] getSortedEntries () {
		GameEntry [] sortedEntries = Arrays.copyOfRange(entries, 0, numberOfEntry);
				
		boolean swapped;
		do {
			swapped = false;
			for (int i=0; i<sortedEntries.length-1; i++) {
				if (sortedEntries[i].getScore() < sortedEntries[i+1].getScore()) {
					GameEntry temp = sortedEntries[i];
					sortedEntries[i] = sortedEntries[i+1];
					sortedEntries[i+1] = temp;
					swapped = true;
				}
			}
		} while (swapped);
		
		return sortedEntries;
	}

	public GameEntry [] getTop5 () {
		GameEntry [] sortedEntries = getSortedEntries();
		return Arrays.copyOfRange(sortedEntries, 0, 5);
	}
	
	public void add (GameEntry entry) {
		if (numberOfEntry < entries.length) {
			entries[numberOfEntry] = entry;	
			numberOfEntry++;
		}
	}
	
	public GameEntry remove (int index) {
		GameEntry entryToRemove = entries[index];
		for (int i = index+1; i<numberOfEntry; i++) {
			entries[i-1] = entries[i];
		}
		numberOfEntry--;
		return entryToRemove;
	}
	
}
