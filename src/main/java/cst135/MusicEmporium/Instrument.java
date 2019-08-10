package cst135.MusicEmporium;

public abstract class Instrument {

	private String name;
	private double price;
	boolean used;
	private char skillLevel; // skillLevels: B, I, P (beginner, intermediate, pro)
	private int quantity;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isUsed() {
		return used;
	}
	public void setUsed(boolean used) {
		this.used = used;
	}
	public char getSkillLevel() {
		return skillLevel;
	}
	public void setSkillLevel(char skillLevel) {
		this.skillLevel = skillLevel;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String toString() {
		return "Instrument [name=" + name + ", price=" + price + ", used=" + used + ", skillLevel=" + skillLevel
				+ ", quantity=" + quantity + ", getName()=" + getName() + ", getPrice()=" + getPrice() + ", isUsed()="
				+ isUsed() + ", getSkillLevel()=" + getSkillLevel() + ", getQuantity()=" + getQuantity()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	public Instrument(String name, double price, boolean used, char skillLevel, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.used = used;
		this.skillLevel = skillLevel;
		this.quantity = quantity;
	}

	
	
}
