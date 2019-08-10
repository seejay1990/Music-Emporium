package cst135.MusicEmporium;

import java.text.DecimalFormat;

public class Guitar extends Instrument {

	private int stringCount;
	private boolean electric;

	DecimalFormat money = new DecimalFormat("$###,###,###.##");

	public int getStringCount() {
		return stringCount;
	}

	public void setStringCount(int stringCount) {
		this.stringCount = stringCount;
	}

	public boolean isElectric() {
		return electric;
	}

	public void setElectric(boolean electric) {
		this.electric = electric;
	}

	public Guitar(String name, double price, boolean used, char skillLevel, int quantity, int stringCount,
			boolean electric) {
		super(name, price, used, skillLevel, quantity);
		this.stringCount = stringCount;
		this.electric = electric;

	}

	public String setUsedText(boolean isUsed) {

		String cond = "";
		if (isUsed() == true) {
			cond = "Used";
		}

		else {
			cond = "NO";
		}

		return cond;
	}

	public String setElectricText(boolean isElectric) {
		String cond = "";
		if (isElectric() == true) {
			cond = "Rock On Dude!";
		}

		else {
			cond = "No Way Dude!";
		}

		return cond;
	}

	public String setSkillText(char getSkillLevel) {
		String skill = "";

		if (getSkillLevel == 'P' || getSkillLevel == 'p') {
			skill = "Professional";
		} else if (getSkillLevel == 'I' || getSkillLevel == 'i') {
			skill = "Intermediate";

		} else if (getSkillLevel == 'B' || getSkillLevel == 'b') {
			skill = "Beginner";
		} else
			skill = "All Skill Levels";

		return skill;
	}

	public String setSizeText(char getSize) {
		String skill = "";

		if (getSize == 'L' || getSize == 'L') {
			skill = "Large";
		} else if (getSize == 'M' || getSize == 'm') {
			skill = "Medium";

		} else if (getSize == 'S' || getSize == 's') {
			skill = "Small";
		} else
			skill = "See in Store for reference.";

		return skill;
	}

	public String toString() {
		System.out.println("\n🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶");
		System.out.println("          The Phil Collins");
		System.out.println("    Piano, Drums and Guitar Emporium");
		System.out.println("🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶");
		System.out.println("       SELECTED GUITAR DETAILS:");

		return "\n Name: " + getName() + "\n Inventory Amount: " + getQuantity() + "\n Cost: "
				+ money.format(getPrice()) + "\n Used: " + setUsedText(isUsed()) + "\n Skill Level: "
				+ setSkillText(getSkillLevel()) + "\n String Count: " + getStringCount() + "\n Electric: "
				+ setElectricText(isElectric()) + "\n";

	}
}
