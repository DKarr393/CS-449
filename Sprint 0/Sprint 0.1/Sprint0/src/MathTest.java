import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathTest {

	@Test
	void avgTest() {
		Math test1 = new Math();
		assertEquals(2, test1.average(2,2));
	}

}
