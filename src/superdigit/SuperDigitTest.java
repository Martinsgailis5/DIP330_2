package superdigit;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import superdigit.SuperDigit;

public class SuperDigitTest {
	@Test
	public void test9875Perfect() {
		assertEquals(2, SuperDigit.superDigit(9875));
	}
	@Test
	public void test148148148Perfect() {
		assertEquals(3, SuperDigit.superDigit(148148148));
	}

}
