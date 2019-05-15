package interestCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class SBaccountTest {

	@Test
	public void SBtest() {
		SBaccount SB=new SBaccount();
		double q=SB.setType("NORMAL").setAmount(100000).build();
		assertEquals(q,4000.0,0.0);
		}

	@Test
	public void SBtest1() {
		SBaccount SB=new SBaccount();
		double q=SB.setType("NRI").setAmount(100000).build();
		assertEquals(q,6000.0,0.0);
		}

}
