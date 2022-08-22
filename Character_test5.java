import static org.junit.Assert.*;

import org.junit.Test;

public class Character_test5 {

	@Test
	public void test12() {

		game_interactions2 character4 = new game_interactions2();

		//checking that the values for this character are changing with the getters / setters

		character4.daringDelilah.setPoison(character4.daringDelilah.getPoison() - 1);

		assertFalse(character4.daringDelilah.getPoison() == 3);

		character4.daringDelilah.setHealth(character4.daringDelilah.getHealth() - 1);

		assertFalse(character4.daringDelilah.getHealth() == 1);

		character4.daringDelilah.setLives(character4.daringDelilah.getLives() - 1);

		assertFalse(character4.daringDelilah.getLives() == 2);

	}
}