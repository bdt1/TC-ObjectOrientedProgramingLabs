package InventoryManager;

public class Main {
	public static void main(String[] args) {
		while(true) {
			InventoryManager.makeDecision();
			String userContinue = Console.getStringInput("Would you like to continue?");
			if(userContinue.equals("no")) {
				break;
			}
		}
	}

	
}
