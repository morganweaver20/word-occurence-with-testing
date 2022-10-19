package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FirstWordTest {
	String words = "The bear ate ate the soup";
	String [] examplePoem = words.split(" ");
	
	@Test
	void test() {
		JunitTests test = new JunitTests();
		String output = test.firstWord(examplePoem);
		assertEquals("The", output);
	}

}
