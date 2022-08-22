import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class Map_test1Test {

	@Test
	public void test() {
		Map_test1 map = new Map_test1();
		
		int result = map.move(7, 3);
	
		assertEquals(2,result);
	}

}

