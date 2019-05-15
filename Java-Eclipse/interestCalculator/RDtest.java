package interestCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class RDtest {

	@Test
	public void RDtesting() {
		RDaccount ob=new RDaccount();
		double a=ob.setAmount(12000).setAge(56).setMonths(6).build();
		System.out.print(a); 
		
		assertEquals(a,900.0,0.0);
	}

}
