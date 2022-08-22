import static org.junit.Assert.*;

import org.junit.Test;

public class Character_Test4 {

	@Test
	public void test11() {
		
		game_interactions2 character3 = new game_interactions2();
		
		//checking that the values for this character are changing with the getters / setters
		
		character3.gardenerGill.setPoison(character3.gardenerGill.getPoison()-1);
		
		assertFalse(character3.gardenerGill.getPoison() == 1);
		
		character3.gardenerGill.setHealth(character3.gardenerGill.getHealth()-1);
		
		assertFalse(character3.gardenerGill.getHealth() == 1);
		
		character3.gardenerGill.setLives(character3.gardenerGill.getLives()-1);
		
		assertFalse(character3.gardenerGill.getLives() == 1);
		
	}

}
