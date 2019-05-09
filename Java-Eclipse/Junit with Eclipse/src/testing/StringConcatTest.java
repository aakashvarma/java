package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringConcatTest {

	@Test
	public void test() {
		Demo1 c = new Demo1();
		String output = c.stringConcat("ab", "cd");
		assertEquals("abcd", output);
	}

}
