import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class Calculator_test {

	@Test
	
	public void test() {
		
		// Given
		Calculator calculator = new Calculator();
		
		// When
		int result = calculator.multiply(2, 2);
		
		// Then
		if (result != 4) {   // if 2 + 2 != 4
			
			Assert.fail();
			
			}
		}
	}


