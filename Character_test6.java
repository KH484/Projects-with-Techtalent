import static org.junit.Assert.*;

import org.junit.Test;

public class Character_test6 {


	@Test
	public void test13() {

		game_interactions2 character5 = new game_interactions2();

		//checking that the values for this character are changing with the getters / setters

		character5.explorerEric.setPoison(character5.explorerEric.getPoison() - 1);

		assertFalse(character5.explorerEric.getPoison() == 0);

		character5.explorerEric.setHealth(character5.explorerEric.getHealth() - 1);

		assertFalse(character5.explorerEric.getHealth() == 1);

		character5.explorerEric.setLives(character5.explorerEric.getLives() - 1);

		assertFalse(character5.explorerEric.getLives() == 1);

	}
}