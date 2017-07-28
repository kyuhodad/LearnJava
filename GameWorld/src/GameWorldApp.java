
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
		
		GameEntry [] sortedEntires = new GameEntry [numEntries];
		for (int i=0; i<numEntries; i++) {
			sortedEntires[i] = gameManager.getEntry(i);
		}
		
		// 1. Insertion Sort (decreasing order)
		System.out.println("\nInsertion Sort!!!!");
		for (int i=1; i<numEntries; i++) {
			GameEntry current = sortedEntires[i];
			int insertionPosition = i;
			for (int j=i-1; j >= 0; j--) {
				if (sortedEntires[j].getScore() < current.getScore()) {
					sortedEntires[j+1] = sortedEntires[j];
					insertionPosition = j;
				} else {
					break;
				}
			}
			
			if (insertionPosition != i) {
				sortedEntires[insertionPosition] = current;
			}
		}
		
		for (int i=0; i<numEntries; i++) {
			GameEntry entry = sortedEntires[i];
			System.out.println("[" + i + "] " + entry.toString());
		}

		// Reassign original entry list
		for (int i=0; i<numEntries; i++) {
			sortedEntires[i] = gameManager.getEntry(i);
		}
		
		// 2. Bubble sort
		System.out.println("\nBubble Sort!!!!");
		boolean swapped;
		do {
			swapped = false;
			for (int i=0; i<sortedEntires.length-1; i++) {
				if (sortedEntires[i].getScore() < sortedEntires[i+1].getScore()) {
					GameEntry temp = sortedEntires[i];
					sortedEntires[i] = sortedEntires[i+1];
					sortedEntires[i+1] = temp;
					swapped = true;
				}
			}
		} while (swapped);

		for (int i=0; i<numEntries; i++) {
			GameEntry entry = sortedEntires[i];
			System.out.println("[" + i + "] " + entry.toString());
		}
		
	}

}
