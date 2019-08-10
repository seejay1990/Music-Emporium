package cst135.MusicEmporium;

import java.util.*;

public class MusicStore {

	static Scanner scan = new Scanner(System.in);
	Storage storage = new Storage();
	

	/**
	 * Displays the Main Menu of the application
	 * 
	 * @throws NumberFormatException
	 * @throws InterruptedException
	 */
	public void viewMenu() throws NumberFormatException, InterruptedException {

		try {
			int option;
			do {
				System.out.println("\n🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶");
				System.out.println("             MAIN MENU");
				System.out.println("          The Phil Collins");
				System.out.println("    Piano, Drums and Guitar Emporium");
				System.out.println("🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶");
				System.out.println("\nSelect An Instrument: ");
				System.out.println("-----------------------");
				System.out.println(" 1: Piano");
				System.out.println(" 2: Guitars");
				System.out.println(" 3: Drums");
				System.out.println(" 4: Add to Inventory");
				System.out.println("------------------------");
				System.out.println(" 5: Exit Application");
				option = makeSureInt();
				processMenu(option);

			} while (makeSureInt() != 5);
		} catch (Exception e) {
			System.out.println("Wrong input\n");
			System.out.println(e);
			viewMenu();
		}
		scan.close();

	}

	/**
	 * Takes the users input and displays appropriate menu
	 * 
	 * @param parseInt
	 * @throws InterruptedException
	 */
	public void processMenu(int parseInt) throws InterruptedException {
		System.out.println(parseInt);
		switch (parseInt) {
		case 1:
			viewPianoMenu();
			break;
		case 2:
			viewGuitarMenu();
			break;
		case 3:
			viewDrumMenu();
			break;
		case 4:
			createInstrument();
			break;
		case 5:
			viewExit();
			break;
		default:

			viewMenu();
		}
	}

	public void createInstrument() throws NumberFormatException, InterruptedException {

		try {
			int option;
			do {
				System.out.println("\n🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶");
				System.out.println("Welcome to the Instrument Creator.");
				System.out.println("What will you add to inventory?");
				System.out.println("🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶");
				System.out.println("\nSelect An Instrument: ");
				System.out.println("-----------------------");
				System.out.println(" 1: Piano");
				System.out.println(" 2: Guitars");
				System.out.println(" 3: Drums");
				System.out.println("------------------------");
				System.out.println(" 4: Back to main menu.");
				option = makeSureInt();
				processCreation(option);

			} while (makeSureInt() != 4);
		} catch (Exception e) {
			System.out.println("Wrong input\n");
			System.out.println(e);
			viewMenu();
		}
		scan.close();

	}

	private void processCreation(int parseInt) throws InterruptedException {
		System.out.println(parseInt);
		switch (parseInt) {
		case 1:
			createPiano();
			break;
		case 2:
			createGuitar();
			break;
		case 3:
			createDrums();
			break;
		case 4:
			viewMenu();

			break;
		default:
			System.out.println("Invalid Input, Try Again");
			createInstrument();
		}
	}

	public void createGuitar() throws InterruptedException {

		int option;
		char skill = '-';
		int quantity;
		// char size = '-';
		int numStrings;
		boolean used;
		boolean electric;

		System.out.println("Let's add a Guitar to Inventory.");
		System.out.println("\nGuitar name?");
		String name = scan.nextLine();
		System.out.println("\nOK. How about price?");
		Double price = makeSureDouble();
		do {
			System.out.println("\nIs it New or Used?");
			System.out.println("New(1) -- Used(2)");
			option = makeSureInt();
			System.out.println(option);
		} while (option != 1 && option != 2);
		if (option == 1) {
			used = false;
		} else {
			used = true;
		}

		do {
			System.out.println(
					"\nWhat skill level is it intended for? Beginner (B), Intermediate (I), or Professional (P)?");
			skill = makeSureChar();
		} while (skill != 'P' && skill != 'p' && skill != 'B' && skill != 'b' && skill != 'I' && skill != 'i');

		do {
			System.out.println("\nHow many are you adding to inventory?");
			quantity = makeSureInt();
		} while (quantity <= 1);

		do {
			System.out.println("\nAwesome! Number of Strings?");
			numStrings = makeSureInt();
		} while (numStrings <= 0 && numStrings > 52);

		do {
			System.out.println("\nIs it Electric or Acoustic?");
			System.out.println("Electric(1) -- Acoustic(2)");
			option = makeSureInt();
		} while (option != 1 && option != 2);
		if (option == 1) {
			electric = true;
		} else {
			electric = false;
		}

		System.out.println("\nI've got everything I need. Adding Guitar to inventory...");
		System.out.println(" ♫ ♫ ♫ ");
		Thread.sleep(600);
		System.out.println("\t ♫ ♫ ♫ ");
		storage.guitars.add(new Guitar(name, price, used, skill, quantity, numStrings, electric));
		Thread.sleep(600);
		System.out.println("\t\t ♫ ♫ ♫");
		Thread.sleep(600);
		System.out.println("\nDone! Returning to Main Menu.");
		viewMenu();
	}

	public void createPiano() throws InterruptedException {

		int option;
		char skill = '-';
		int quantity;
		char size = '-';
		int numKeys;
		boolean used;
		boolean electric;

		System.out.println("Let's add a Piano to Inventory.");
		System.out.println("\nPiano name?");
		String name = scan.nextLine();
		System.out.println("\nOK. How about price?");
		Double price = makeSureDouble();
		do {
			System.out.println("\nIs it New or Used?");
			System.out.println("New(1) -- Used(2)");
			option = makeSureInt();
			System.out.println(option);
		} while (option != 1 && option != 2);
		if (option == 1) {
			used = false;
		} else {
			used = true;
		}

		do {
			System.out.println(
					"\nWhat skill level is it intended for? Beginner (B), Intermediate (I), or Professional (P)?");
			skill = makeSureChar();
		} while (skill != 'P' && skill != 'p' && skill != 'B' && skill != 'b' && skill != 'I' && skill != 'i');

		do {
			System.out.println("\nHow many are you adding to inventory?");
			quantity = makeSureInt();
		} while (quantity <= 1);

		do {
			System.out.println("\nWhat size is it? Small (S), Medium (M), or Large(L)?");
			size = makeSureChar();
			System.out.println(size);
		} while (size != 'L' && size != 'l' && size != 'M' && size != 'm' && skill != 'S' && skill != 's');

		do {
			System.out.println("\nAwesome! Number of keys?");
			numKeys = makeSureInt();
		} while (numKeys <= 0 && numKeys > 108);

		do {
			System.out.println("\nIs it Electric or Acoustic?");
			System.out.println("Electric(1) -- Acoustic(2)");
			option = makeSureInt();
		} while (option != 1 && option != 2);
		if (option == 1) {
			electric = true;
		} else {
			electric = false;
		}

		System.out.println("\nI've got everything I need. Adding Piano to inventory...");
		System.out.println(" ♫ ♫ ♫ ");
		Thread.sleep(600);
		System.out.println("\t ♫ ♫ ♫ ");
		storage.pianos.add(new Piano(name, price, used, skill, quantity, size, numKeys, electric));
		Thread.sleep(600);
		System.out.println("\t\t ♫ ♫ ♫  ");
		Thread.sleep(600);
		System.out.println("\nDone! Returning to Main Menu.");
		viewMenu();
	}

	public void createDrums() throws InterruptedException {

		int option;
		char skill = '-';
		int quantity;
		char size = '-';
		int numPieces;
		boolean used;
		boolean electric;
		String contents;

		System.out.println("Let's add a Drum Set to Inventory.");
		System.out.println("\nDrum Set name?");
		String name = scan.nextLine();
		System.out.println("\nOK. How about price?");
		Double price = makeSureDouble();
		do {
			System.out.println("\nIs it New or Used?");
			System.out.println("New(1) -- Used(2)");
			option = makeSureInt();
			System.out.println(option);
		} while (option != 1 && option != 2);
		if (option == 1) {
			used = false;
		} else {
			used = true;
		}

		do {
			System.out.println(
					"\nWhat skill level is it intended for? Beginner (B), Intermediate (I), or Professional (P)?");
			skill = makeSureChar();
		} while (skill != 'P' && skill != 'p' && skill != 'B' && skill != 'b' && skill != 'I' && skill != 'i');

		do {
			System.out.println("\nHow many are you adding to inventory?");
			quantity = makeSureInt();
		} while (quantity <= 1);

		do {
			System.out.println("\nCool! How many pieces does the set contain?");
			numPieces = makeSureInt();
		} while (numPieces <= 0 && numPieces > 100);

		System.out.println("\nPlease list the Drum Set Contents.");
		contents = scan.nextLine();

		System.out.println("\nI've got everything I need. Adding Drum Set to inventory...");
		System.out.println(" ♫ ♫ ♫ ");
		Thread.sleep(600);
		System.out.println("\t ♫ ♫ ♫ ");
		storage.drums.add(new Drums(name, price, used, skill, quantity, numPieces, contents));
		Thread.sleep(600);
		System.out.println("\t\t ♫ ♫ ♫ ");
		Thread.sleep(600);
		System.out.println("\nDone! Returning to Main Menu.");
		viewMenu();
	}

	/**
	 * Guitar Inventory Menu
	 * 
	 * @throws NumberFormatException
	 * @throws InterruptedException
	 */
	public void viewGuitarMenu() throws NumberFormatException, InterruptedException {
		// Storage storage = new Storage();
		System.out.println("\n🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶");
		System.out.println("\tGUITAR INVENTORY: ");
		System.out.println("🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶");;
		System.out.println("Enter Guitar Number To View More Info.\n");
		System.out.println("Press 0 to exit to Main Menu\n");

		for (int i = 0; i < storage.guitars.size(); i++) {
			if ((storage.guitars.get(i).getQuantity()) >= 1) {

				System.out.println((i + 1) + " : " + storage.guitars.get(i).getName());

			} else if ((storage.guitars.get(i).getQuantity()) == 0) {
				System.out.println((i + 1) + " : " + storage.guitars.get(i).getName() + " --OUT OF STOCK--");
			}
		}

		int guitarChoice = makeSureInt() - 1;
		if (guitarChoice >= 0) {

			displayGuitars(guitarChoice);
		} else if (guitarChoice < 0) {
			System.out.println(" . . . ");
			Thread.sleep(600);
			viewMenu();
		}
	}

	/**
	 * Piano Selection Menu
	 * 
	 * @throws InterruptedException
	 */
	public void viewPianoMenu() throws InterruptedException {
		System.out.println("\n🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶");
		System.out.println("\tPIANO INVENTORY: ");
		System.out.println("🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶");
		System.out.println("Enter Piano Number To View More Info.\n");
		System.out.println("Press 0 to exit to Main Menu\n");

		for (int i = 0; i < storage.pianos.size(); i++) {
			if ((storage.pianos.get(i).getQuantity()) >= 1) {
				// System.out.println("\t\t\t\t\t" + storage.pianos.get(i).getQuantity());
				System.out.println((i + 1) + " : " + storage.pianos.get(i).getName());

			} else if ((storage.pianos.get(i).getQuantity()) == 0) {
				System.out.println((i + 1) + " : " + storage.pianos.get(i).getName() + " --OUT OF STOCK--");
			}
		}

		int pianoChoice = makeSureInt() - 1;
		if (pianoChoice >= 0) {

			displayPianos(pianoChoice);
		} else if (pianoChoice < 0) {
			System.out.println(" . . . ");
			Thread.sleep(600);
			viewMenu();
		}
	}

	/**
	 * Drum Inventory Menu
	 * 
	 * @throws NumberFormatException
	 * @throws InterruptedException
	 */
	public void viewDrumMenu() throws NumberFormatException, InterruptedException {
		System.out.println("\n🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶");
		System.out.println("\tDRUM SET INVENTORY: ");
		System.out.println("🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶");
		System.out.println("Enter Drum Set Number To View More Info.\n");
		System.out.println("Press 0 to exit to Main Menu\n");

		for (int i = 0; i < storage.drums.size(); i++) {
			if ((storage.drums.get(i).getQuantity()) >= 1) {

				System.out.println((i + 1) + " : " + storage.drums.get(i).getName());

			} else if ((storage.drums.get(i).getQuantity()) == 0) {
				System.out.println((i + 1) + " : " + storage.drums.get(i).getName() + " --OUT OF STOCK--");
			}
		}

		int drumChoice = makeSureInt() - 1;
		if (drumChoice >= 0) {

			displayDrums(drumChoice);
		} else if (drumChoice < 0) {
			System.out.println(" . . . ");
			Thread.sleep(600);
			viewMenu();
		}
	}

	public void displayGuitars(int index) throws InterruptedException {
		System.out.println("Enter Drum Number To View Infomation.\n");
		int newQuantity = 0;
		System.out.println(storage.guitars.get(index).toString());
		System.out.println("Update Quantity? Y/N");
		System.out.println("\n🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶");
		String ans = scan.nextLine();
		switch (ans.toLowerCase()) {
		case "y":
		case "yes":
			System.out.println("Please Enter New Quantity.");
			newQuantity = makeSureInt();
			storage.guitars.get(index).setQuantity(newQuantity);
			System.out.println("...");
			Thread.sleep(600);
			System.out.println("Okay! Your new quantity is " + storage.guitars.get(index).getQuantity());
			System.out.println("Returning to Main Menu.");
			Thread.sleep(600); 
			viewMenu();
			break;

		case "n":
		case "no":
			System.out.println("Gotcha. Return to Main Menu(1) or Guitar Menu(2)?");
			System.out.println("\n \t~~Enter choice.~~");

			int ans1 = makeSureInt();
			switch (ans1) {
			case 1:
				viewMenu();
				break;
			case 2:
				viewGuitarMenu();
				break;
			default:
				System.out.println("I don't recognize that command. Let's just go to the Main Menu.");
				Thread.sleep(600);
				viewMenu();
			}
			break;

		default:
			System.out.println("I don't recognize that command. Let's go to the Guitar Menu.");
			System.out.println("");
			viewGuitarMenu();
			break;

		}
	}

	public void displayPianos(int index) throws InterruptedException {

		int newQuantity = 0;
		System.out.println(storage.pianos.get(index).toString());
		System.out.println("Update Quantity? Y/N");
		System.out.println("\n🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶");
		String ans = scan.nextLine();
		switch (ans.toLowerCase()) {
		case "y":
		case "yes":
			System.out.println("Please Enter New Quantity.");
			newQuantity = makeSureInt();
			storage.pianos.get(index).setQuantity(newQuantity);
			System.out.println("...");
			Thread.sleep(600);
			System.out.println("Okay! Your new quantity is " + storage.pianos.get(index).getQuantity());

			System.out.println("Returning to Main Menu.");
			Thread.sleep(600);
			viewMenu();
			break;

		case "n":
		case "no":
			System.out.println("Gotcha. Return to Main Menu(1) or Piano Menu(2)?");
			System.out.println("\n \t~~Enter choice.~~");

			int ans1 = makeSureInt();
			switch (ans1) {
			case 1:
				viewMenu();
				break;
			case 2:
				viewPianoMenu();
				break;
			default:
				System.out.println("I don't recognize that command. Let's just go to the Main Menu.");
				Thread.sleep(600);
				viewMenu();
			}
			break;

		default:
			System.out.println("I don't recognize that command. Let's go to the Piano Menu.");
			System.out.println("");
			viewPianoMenu();
			break;

		}
	}

	public void displayDrums(int index) throws InterruptedException {
		// Storage storage = new Storage();
		int newQuantity = 0;
		System.out.println(storage.drums.get(index).toString());
		System.out.println("Update Quantity? Y/N");
		System.out.println("\n🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶");
		String ans = scan.nextLine();
		switch (ans.toLowerCase()) {
		case "y":
		case "yes":
			System.out.println("Please Enter New Quantity.");
			newQuantity = makeSureInt();
			storage.drums.get(index).setQuantity(newQuantity);
			System.out.println("...");
			Thread.sleep(600);
			System.out.println("Okay! Your new quantity is " + storage.drums.get(index).getQuantity());
			System.out.println("Returning to main menu.");
			Thread.sleep(600);
			viewMenu();
			break;

		case "n":
		case "no":
			System.out.println("Gotcha. Return to Main Menu(1) or Drum Menu(2)?");
			System.out.println("\n \t~~Enter choice.~~");
			// System.out.println("zzzz" + scan.nextLine());

			int ans1 = makeSureInt();
			switch (ans1) {
			case 1:
				viewMenu();
				break;
			case 2:
				viewDrumMenu();
				break;
			default:
				System.out.println("I don't recognize that command. Let's just go to the main menu.");
				Thread.sleep(600);
				viewMenu();
			}
			break;

		default:
			System.out.println("I don't recognize that command. Let's go to the Piano Menu.");
			System.out.println("");
			viewDrumMenu();
			break;

		}
	}

	private int makeSureInt() {
		boolean done = false;
		int ans1 = 0;
		while (done == false) {

			try {
				done = true;

				ans1 = Integer.parseInt(scan.nextLine());
			} catch (Exception e) {
				done = false;
				System.out.println("I don't get that input. Try something less dumb!");

			}
		}
		return ans1;
	}

	private double makeSureDouble() {
		boolean done = false;
		double ans1 = 0;
		while (done == false) {

			try {
				done = true;

				ans1 = Double.parseDouble(scan.nextLine());
			} catch (Exception e) {
				done = false;
				System.out.println("I don't get that input. Try something less dumb!");

			}
		}
		return ans1;
	}

	private char makeSureChar() {
		boolean done = false;
		char ans1 = '-';
		while (done == false) {

			try {
				done = true;

				ans1 = scan.nextLine().charAt(0);
			} catch (Exception e) {
				done = false;
				System.out.println("I don't get that input. Try something less dumb!");

			}
		}
		return ans1;
	}
	

	public void viewExit() {
		
		System.out.println("🎶🎶🎶 NOW YOU CAN REALLY FEEL IT IN THE AIR TONIGHT!🎶🎶🎶 ");
		System.out.println("\nGOODBYE!!");
		System.exit(0);
	}

}
