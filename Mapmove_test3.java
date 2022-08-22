import static org.junit.Assert.*;

import org.junit.Test;

public class Mapmove_test3 {

	@Test
	public void test3() {

		//Using the Map method to set map limits and location of player
		
		Map map = new Map(10, 10, 2, 6);
		
		//setting the direction
		
		map.setDirection("E");
		
		//referencing the move method
		
		map.move();

		//comparing expected result with actual result
		
		assertEquals(7, map.getCurrentY());

	}
}
