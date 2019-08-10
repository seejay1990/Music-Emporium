package cst135.MusicEmporium;
/**
 * Group project for CST 135
 * 
 * This application will be an Inventory Asset management application.
 * @author Charles R. Edwards Jr. , Connor Carmody, Brian Fagan
 *
 */
public class Main {

	/** 
	 * Main class of the program.
	 * @param args
	 * @throws NumberFormatException
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws NumberFormatException, InterruptedException {
		
		
			PlayMusic pm = new PlayMusic();
			MusicStore ms = new MusicStore();
			
			/*
			 * To play music: Must change path below to match where you have downloaded the application:
			 * start access at \\MusicEmporeum\\.......
			 * If not file not found will display but program still runs as intended.
			 */
			
			pm.playMusic("C:\\Users\\CJ Edwards\\Desktop\\JAVA BOOTCAMP\\CST 135 Group Project\\MusicEmporeum\\MusicEmporeum 2\\Music\\In The Air.wav");
			ms.viewMenu();
	}

}
