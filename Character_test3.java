import static org.junit.Assert.*;

import org.junit.Test;

public class Character_test3 {

	@Test
	public void test9() {
		
		game_interactions2 character2 = new game_interactions2();
		
		//checking that the weapons are individual to that particular character
		
		//Sacateurs are for Gardener Gill
		
		assertNotSame("Secateurs",character2.explorerEric.getWeapon());
		assertNotSame("Secateurs", character2.daringDelilah.getWeapon());
		
		// Sharp Spade is for Explorer Eric
		
		assertNotSame("Sharp Spade",character2.gardenerGill.getWeapon());
		assertNotSame("Sharp Spade", character2.daringDelilah.getWeapon());

		// Extra Plant Poison is Daring Delilah
		assertNotSame("Extra Plant poison",character2.gardenerGill.getWeapon());
		assertNotSame("Extra Plant poison", character2.explorerEric.getWeapon());
		
	}

}
