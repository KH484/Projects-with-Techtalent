import static org.junit.Assert.*;

import org.junit.Test;

public class CharacterTest {

	@Test
	public void test8() {
		
		game_interactions2 character1 = new game_interactions2();
		
		//checking that each character variables has a value in the string
		
		assertNotNull(character1.gardenerGill.getName());
		assertNotNull(character1.gardenerGill.getWeapon());
		
		assertNotNull(character1.daringDelilah.getName());
		assertNotNull(character1.daringDelilah.getWeapon());
		
		assertNotNull(character1.explorerEric.getName());
		assertNotNull(character1.explorerEric.getWeapon());
		
		
	}

}
