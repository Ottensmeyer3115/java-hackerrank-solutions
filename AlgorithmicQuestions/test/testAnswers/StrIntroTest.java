package testAnswers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.ottensmeyer.solutions.StrIntro;

class StrIntroTest {

	@Test
	void testOp() {
		StringBuilder sb = new StringBuilder();
		sb.append("9\n" + 
				"No\n" + 
				"Hello Java");
		String expected = sb.toString();
		String actual = StrIntro.op("hello", "java");
		assertEquals(expected, actual, "Doesn't Match");
	}

}
