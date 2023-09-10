/* Sprint 0 by Dylan Karr
 * In the following code, I followed a YouTube tutorial to create two different and simple Unit Tests.
 * One is a simple average function.
 * The other is a Letter Grade function.
 * Credit: https://www.youtube.com/watch?v=vZm0lHciFsQ (by CodingWithJohn)
 */
public class Math {
	
	public int average (int a, int b) {
		return (a + b)/2;
	}

	public char grades (int percentage) {
		if (percentage < 0) {
			throw new IllegalArgumentException("Error.");
		}
		else if (percentage < 60) {
			return 'F';
		}
		else if (percentage < 70) {
			return 'D';
		}
		else if (percentage < 80) {
			return 'C';
		}
		else if (percentage < 90) {
			return 'B';
		}
		else {
			return 'A';
		}
	}
}
