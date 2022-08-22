import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.Test;

public class Character_test2 {

	@Test
	public void test10() {
		
	
		game_interactions2 character2 = new game_interactions2();
		
		
		//checking if the character lives / health / poison points are correct values
		
		assertSame(2,character2.daringDelilah.getLives());
		assertSame(1,character2.daringDelilah.getHealth());
		assertSame(3,character2.daringDelilah.getPoison());
		
		assertSame(1,character2.explorerEric.getLives());
		assertSame(1,character2.explorerEric.getHealth());
		assertSame(0,character2.explorerEric.getPoison());
		
		assertSame(1,character2.gardenerGill.getLives());
		assertSame(1,character2.gardenerGill.getHealth());
		assertSame(1,character2.gardenerGill.getPoison());
		
	}

}