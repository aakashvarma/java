package interestCalculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class Tests {
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void testHandle() {
		FDaccount fd=new FDaccount();
		double x=fd.setAge(12)
		.setAmount(10000)
		.setDays(100)
		.build();
		System.out.print(x); 
		
		assertEquals(x,750.0,0.0);
		
		
	}
	@SuppressWarnings("deprecation")
	@Test
	public void testHandle1() {
		FDaccount fd=new FDaccount();
	double y=fd.setAge(56).setAmount(500000).setDays(23).build();
	System.out.println(y);
	assertEquals(y,23750.0,0.0);
}
}
