
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
		
		// 1. Insertion Sort
		for (int i=1; i<numEntries; i++) {
			GameEntry current = sortedEntires[i];
			for (int j=i-1; j >= 0; j--) {
				if (sortedEntires[j].getScore() > current.getScore()) {
					sortedEntires[j+1] = sortedEntires[j];
					sortedEntires[j] = current;
				}
			}
		}
		
		for (int i=0; i<numEntries; i++) {
			GameEntry entry = sortedEntires[i];
			System.out.println("[" + i + "] " + entry.toString());
		}
		
		// 2. Bubble sort
		
	}

}
