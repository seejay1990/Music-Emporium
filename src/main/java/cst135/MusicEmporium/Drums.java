package cst135.MusicEmporium;

import java.text.DecimalFormat;

public class Drums extends Instrument {

	private int pieceCount;
	private String kitContents;
	
	
	DecimalFormat money = new DecimalFormat("$###,###,###.##");
	
	
	public int getPieceCount() {
		return pieceCount;
	}

	public void setPieceCount(int pieceCount) {
		this.pieceCount = pieceCount;
	}

	public String getKitContents() {
		return kitContents;
	}

	public void setKitContents(String kitContents) {
		this.kitContents = kitContents;
	}




	public Drums(String name, double price, boolean used, char skillLevel, int quantity,
			int pieceCount, String kitContents) {
		super(name, price, used, skillLevel, quantity);
		this.pieceCount = pieceCount;
		this.kitContents = kitContents;
		
	}
	  public Drums(String name, double price, boolean used, char skillLevel, int quantity,
	            int pieceCount) {
	        super(name, price, used, skillLevel, quantity);
	        this.pieceCount = pieceCount;
	        this.kitContents = kitContents;
	        
	    }
	   
	    public Drums(String name, double price, boolean used, char skillLevel, int quantity) {
	        super(name, price, used, skillLevel, quantity);
	        this.pieceCount = pieceCount;
	        this.kitContents = kitContents;
	        
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
	/*	public String setElectricText (boolean isElectric) {
			String cond = "";
			if (isElectric() == true) { 
				 cond = "Electric";}
		
			else {
				 cond = "Acoustic";
			}
		
			return cond;
	}
	*/
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
			
			if (getSize == 'L' || getSize == 'L') {
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
			System.out.println("       SELECTED DRUM SET DETAILS:");

		
			
			return "\n Name: " + getName() + 
					"\n Inventory Amount: " + getQuantity() +
					"\n Price: " + money.format(getPrice()) +
					"\n Condition: " + setUsedText(isUsed()) +
					"\n Skill Level: " + setSkillText(getSkillLevel()) +
					//"\n Number of Keys: " + getNumKeys() +
					"\n Piece Count: " + getPieceCount() +
					"\n\nContents: " + getKitContents() + "\n";
		}

	
	
}
