import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Mapmove_test4 {

	@Test
	void test4() {

		//Using the Map method to set map limits and location of player
		
		Map map = new Map(10, 10, 8, 8);
		
		//setting the direction
		
		map.setDirection("W");
		
		//referencing the move method
		
		map.move();

		//comparing expected result with actual result
		
		assertEquals(7, map.getCurrentY());

	}
}