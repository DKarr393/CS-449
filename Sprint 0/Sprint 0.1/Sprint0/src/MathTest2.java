import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathTest2 {

	@Test
	void gradeTest() {
		var student = new Math();
		assertEquals('F', student.grades(0));
	}
	@Test
	void gradeTest2() {
		var student = new Math();
		assertEquals('D', student.grades(60));
	}
	@Test
	void gradeTest3() {
		var student = new Math();
		assertEquals('C', student.grades(70));
	}
	@Test
	void gradeTest4() {
		var student = new Math();
		assertEquals('B', student.grades(80));
	}
	@Test
	void gradeTest5() {
		var student = new Math();
		assertEquals('A', student.grades(90));
	}
	@Test
	void gradeTest6() {
		var student = new Math();
		assertThrows(IllegalArgumentException.class, () -> {
					student.grades(-1);
				});
	}
}
