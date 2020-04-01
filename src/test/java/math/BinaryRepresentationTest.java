package math;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryRepresentationTest {
	@Test
	public void test() {
		BinaryRepresentation br = new BinaryRepresentation();
		String result = br.findDigitsInBinary(10);
		assertEquals("1010", result);

	}
}