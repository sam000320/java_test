package ntou.cs;
import ntou.cs.Arithmetic;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleTest {
	@Test
	public void testAdd() {
		Arithmetic calc = new Arithmetic();
		assertEquals(calc.add(1, 1), 2);
	}
	@Test
	public void testSub() {
		Arithmetic calc = new Arithmetic();
		assertEquals(calc.sub(1, 1), 0);
	}
	@Test
	public void testMul() {
		Arithmetic calc = new Arithmetic();
		assertEquals(calc.mul(3, 5), 15);
	}
	@Test
	public void testDiv() {
		Arithmetic calc = new Arithmetic();
		assertEquals(calc.div(10, 2), 4);
	}
}
