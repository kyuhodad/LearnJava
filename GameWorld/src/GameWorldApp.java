import  java.util.Arrays;

public class GameWorldApp {

	public static void main(String[] args) {
		/**
		 * 1. Add GameEntry class
		 * 2. Add GameManger class
		 */

		GameManager gameManager = new GameManager (50);
		
		gameManager.add(new GameEntry("Alice", 	35));
		gameManager.add(new GameEntry("Bill", 	32));
		gameManager.add(new GameEntry("Chloe", 	38));
		gameManager.add(new GameEntry("Dave", 	29));
		gameManager.add(new GameEntry("Evan", 	40));
		gameManager.add(new GameEntry("Frank", 	33));
		gameManager.add(new GameEntry("Gale", 	49));
		gameManager.add(new GameEntry("Harry", 	21));
		
		int numEntries = gameManager.getNumberOfEntries();
		
		for (int i=0; i<numEntries; i++) {
			GameEntry entry = gameManager.getEntry(i);
			System.out.println("[" + i + "] " + entry.toString());
		}
		
		System.out.println("\nRemove two entries.");
		GameEntry removed1 = gameManager.remove(1);
		GameEntry removed2 = gameManager.remove(1);
		numEntries = gameManager.getNumberOfEntries();
		for (int i=0; i<numEntries; i++) {
			GameEntry entry = gameManager.getEntry(i);
			System.out.println("[" + i + "] " + entry.toString());
		}
		
		System.out.println("\nPut those back to the entries.");
		gameManager.add(removed1);
		gameManager.add(removed2);
		numEntries = gameManager.getNumberOfEntries();
		for (int i=0; i<numEntries; i++) {
			GameEntry entry = gameManager.getEntry(i);
			System.out.println("[" + i + "] " + entry.toString());
		}
		
		numEntries = gameManager.getNumberOfEntries();
		GameEntry [] sortedEntries = new GameEntry [numEntries];
		for (int i=0; i<numEntries; i++) {
			sortedEntries[i] = gameManager.getEntry(i);
		}
		
		// 1. Insertion Sort (decreasing order)
		System.out.println("\nInsertion Sort!!!!");
		for (int i=1; i<numEntries; i++) {
			GameEntry current = sortedEntries[i];
			int insertionPosition = i;
			for (int j=i-1; j >= 0; j--) {
				if (sortedEntries[j].getScore() < current.getScore()) {
					sortedEntries[j+1] = sortedEntries[j];
					insertionPosition = j;
				} else {
					break;
				}
			}
			
			if (insertionPosition != i) {
				sortedEntries[insertionPosition] = current;
			}
		}
		
		numEntries = gameManager.getNumberOfEntries();
		for (int i=0; i<numEntries; i++) {
			GameEntry entry = sortedEntries[i];
			System.out.println("[" + i + "] " + entry.toString());
		}

		// Reassign original entry list
		for (int i=0; i<numEntries; i++) {
			sortedEntries[i] = gameManager.getEntry(i);
		}
		
		// 2. Bubble sort
		System.out.println("\nBubble Sort!!!!");
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

		for (int i=0; i<numEntries; i++) {
			GameEntry entry = sortedEntries[i];
			System.out.println("[" + i + "] " + entry.toString());
		}
		
		GameEntry [] top3 = Arrays.copyOfRange(sortedEntries, 0, 3);
		for (int i=0; i<top3.length; i++) {
			if (top3[i] != null) {
				System.out.println("[" + i + "] " + top3[i]);
			}
		}
		
		
		System.out.println("\nTop5 Entries!!!!");
		// Top 5 entries
		GameEntry [] top5Entries = gameManager.getTop5();
		for (int i=0; i<top5Entries.length; i++) {
			if (top5Entries[i] != null) {
				System.out.println("[" + i + "] " + top5Entries[i]);
			}
		}
	}

}
