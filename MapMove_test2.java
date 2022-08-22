import static org.junit.Assert.*;

import org.junit.Test;

public class MapMove_test2 {

	@Test
	public void test2() {

		//Using the Map method to set map limits and location of player
		
		Map map = new Map(10, 10, 3, 7);
		
		//setting the direction
		
		map.setDirection("S");
		
		//referencing the move method
		
		map.move();

		//comparing expected result with actual result
		
		assertEquals(2, map.getCurrentX());

	}
}