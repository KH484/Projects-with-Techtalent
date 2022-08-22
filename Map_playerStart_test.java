import static org.junit.Assert.*;

import org.junit.Test;

public class Map_playerStart_test {

	@Test
	public void test5() {
		
		Map map = new Map();
		
		map.playerStart();
		
		//checking that the random number for X and Y generated is less than 10
		
		assertTrue(map.getCurrentX() < 10);
		
		assertTrue(map.getCurrentY() < 10);
		
	}

}
