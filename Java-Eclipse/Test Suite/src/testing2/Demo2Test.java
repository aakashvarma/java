package testing2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Demo2Test {

	@Test
	public void test() {
		Demo2 re = new Demo2();
		Boolean output = re.palindromeCheck("varmamrav");
		assertTrue(output);
	}

}
