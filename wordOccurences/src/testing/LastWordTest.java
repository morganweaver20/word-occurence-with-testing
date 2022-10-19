package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LastWordTest {
	String words = "The bear ate ate the soup";
	String [] examplePoem = words.split(" ");
	
	@Test
	void test() {
		JunitTests test = new JunitTests();
		String output = test.lastWord(examplePoem);
		assertEquals("soup", output);
	}

}
