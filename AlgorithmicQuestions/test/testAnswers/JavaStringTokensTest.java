package testAnswers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.ottensmeyer.solutions.JavaStringTokensDriver;

class JavaStringTokensTest {

	@Test
	void testSplitStringIntoTokens() {
		StringBuilder sb = new StringBuilder();
		
		String testInput = "He is a very very good boy, isn't he?";
		
		sb.append("10" + "\n" +
				"He" + "\n" +
				"is" + "\n" +
				"a" + "\n" +
				"very" + "\n" +
				"very" + "\n" +
				"good" + "\n" +
				"boy" + "\n" +
				"isn" + "\n" +
				"t" + "\n" +
				"he" + "\n");
		String expectedAnswer = sb.toString();
		assertEquals(expectedAnswer, JavaStringTokensDriver.splitStringIntoTokens(testInput), "Test failed");
	}

	@Test
	void testRemoveLeadingNonLetters() {

	}

}
