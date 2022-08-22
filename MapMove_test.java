import static org.junit.Assert.*;

import org.junit.Test;

public class MapMove_test {

	@Test
	public void test() {

		//Using the Map method to set map limits and location of player
		
		Map map = new Map(10, 10, 5, 5);
		
		//setting the direction
		
		map.setDirection("N");
		
		//referencing the move method
		
		map.move();

		//comparing expected result with actual result
		
		assertEquals(6, map.getCurrentX());

	}
}