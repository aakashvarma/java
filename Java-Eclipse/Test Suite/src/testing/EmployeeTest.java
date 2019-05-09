package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {

	@Test
	public void test() {
		Employee obj = new Employee();
		String output = obj.findName(obj.A1, "Aakash");
		assertEquals("NOT FOUND", output);
	}

}
