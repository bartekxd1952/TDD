package talagakrol;

import static org.junit.Assert.*;
import org.junit.Test;

public class FibonaciLauncherTest {

	@Test
	public void getElemntLoopTest() {
		assertEquals(1, Fibonacci.getElemntLoop(1).intValue());
		assertEquals(8, Fibonacci.getElemntLoop(6).intValue());
		assertEquals(144, Fibonacci.getElemntLoop(12).intValue());
	}

}
