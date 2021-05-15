package testAnswers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.ottensmeyer.solutions.MathUtils;

class MathUtilsTest {


	@Test
	void testAdd() {
		MathUtils mathUtils = new MathUtils();
		int expected = 2;
		int actual = mathUtils.add(1, 1);
		assertEquals(expected, actual, 
				"The add method should add two numbers");
	}
	
	@Test
	void testComputeCircleArea() {
		MathUtils mathUtils = new MathUtils();
		assertEquals(Math.PI*(Math.pow(10, 2)), mathUtils.computeCircleArea(10), "Should return right circle area");
	}
	
	
	

}
