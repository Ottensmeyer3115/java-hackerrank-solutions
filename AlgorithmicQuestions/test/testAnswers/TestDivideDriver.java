package testAnswers;

import com.ottensmeyer.solutions.DivideDriver;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestDivideDriver {


	@Test
	void testDivide() {
		assertEquals("2", DivideDriver.divide(4, 2));
		assertEquals("1.5", DivideDriver.divide(3, 2));
		assertEquals("0.(33333333)", DivideDriver.divide(1, 3));
		assertEquals("1.0(6666666)", DivideDriver.divide(16,15));
		
		assertNotEquals("Something went wrong", DivideDriver.divide(1, 3));
	}

}
