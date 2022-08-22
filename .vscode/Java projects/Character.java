public class Character {

	private String name;
	private int lives;
	private int health;
	private String weapon;
	
	public Character(String name, int lives, int health, String weapon) {
		this.name = name;
		this.lives = lives;
		this.health = health;
		this.weapon = weapon;
		
	} 
	
	public void printDetails() { 
		System.out.println (this.name + " has " + this.lives + " lives and " + this.health + " health points and their speciality is " + this.weapon);
		
	}
	
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLives() {
		return lives;
	}
	public void setLives(int lives) {
		this.lives = lives;
	}
	public String getWeapon() {
		return weapon;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
}
