package cst135.MusicEmporium;
import java.text.*;
public class Piano extends Instrument{

	private int numKeys;
	private char size; //sizes: S, M, L
	private boolean electric;
	
	DecimalFormat money = new DecimalFormat("$###,###,###.##");
	
	public int getNumKeys() {
		return numKeys;
	}



	public void setNumKeys(int numKeys) {
		this.numKeys = numKeys;
	}



	public char getSize() {
		return size;
	}



	public void setSize(char size) {
		this.size = size;
	}



	public boolean isElectric() {
		return electric;
	}



	public void setElectric(boolean electric) {
		this.electric = electric;
	}



	public Piano(String name, double price, boolean used, char skillLevel, int quantity,
			char size, int numKeys, boolean electric) {
		super(name, price, used, skillLevel, quantity);
		this.numKeys = numKeys;
		this.size = size;
		this.electric = electric;
	}
	
		
	
	public String setUsedText (boolean isUsed) {

		String cond = "";
		if (isUsed() == true) { 
			 cond = "Used";}
	
		else {
			 cond = "NO";
		}
	
		return cond;
}
	public String setElectricText (boolean isElectric) {
		String cond = "";
		if (isElectric() == true) { 
			 cond = "Rock On Dude!";}
	
		else {
			 cond = "No Way Dude!";
		}
	
		return cond;
}
	public String setSkillText (char getSkillLevel) {
		String skill = "";
		
		if (getSkillLevel == 'P' || getSkillLevel == 'p') {
			skill = "Professional";
		}
		else if (getSkillLevel == 'I' || getSkillLevel == 'i') {
			skill = "Intermediate";
			
		}
		else if (getSkillLevel == 'B' || getSkillLevel == 'b') {
			skill = "Beginner";
		}
		else 
			skill = "All Skill Levels";
		
		return skill;
	}
	public String setSizeText (char getSize) {
		String skill = "";
		
		if (getSize == 'L' || getSize == 'l') {
			skill = "Large";
		}
		else if (getSize == 'M' || getSize == 'm') {
			skill = "Medium";
			
		}
		else if (getSize == 'S' || getSize == 's') {
			skill = "Small";
		}
		else 
			skill = "See in Store for reference.";
		
		return skill;
	}
	
	
	@Override
	public String toString() {
		System.out.println("\n🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶");
		System.out.println("          The Phil Collins");
		System.out.println("    Piano, Drums and Guitar Emporium");
		System.out.println("🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶");
		System.out.println("       SELECTED PIANO DETAILS:");

	
		
		return  "\n Name: " + getName() +
				"\n Inventory Amount: " + getQuantity() +
				"\n Price: " + money.format(getPrice()) +
				"\n Condition: " + setUsedText(isUsed()) +
				"\n Skill Level: " + setSkillText(getSkillLevel()) +
				"\n Number of Keys: " + getNumKeys() +
				"\n Size: " + setSizeText(getSize()) +
				"\n Electric: " + setElectricText(isElectric()) + "\n";
	}

	
	
}
