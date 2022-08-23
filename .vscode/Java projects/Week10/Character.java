package Week10;

public class Character {

	// variables

	private String name;

	private int lives;

	private int health;

	private String weapon;

	private int poison;

	// characteristics of each character. Creating variables I can change in the
	// game

	public Character(String name, int lives, int health, int poison, String weapon) {

		this.name = name;

		this.lives = lives;

		this.health = health;

		this.weapon = weapon;

		this.poison = poison;

	}

	// printing the details of each character

	public void printDetails() {

		System.out.println(this.name + " has " + this.lives + " lives and " + this.poison + " poison points and "
				+ this.health + " health points and their speciality is " + this.weapon);

	}

	// public variables that can be used

	public int getPoison() {

		return poison;
	}

	public void setPoison(int poison) {

		this.poison = poison;
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

	public static char toLowerCase(char c) {
		return 0;
	}

}
