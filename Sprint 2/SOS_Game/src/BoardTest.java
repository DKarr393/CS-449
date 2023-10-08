import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BoardTest {
	int size = 10;
	private Board board = new Board(size, size);
	@Test
	public void testBoard() {
		for (int row = 0; row < size; row++) {
			for (int col = 0; col < size; col++) {
				assertEquals("", board.getCell(row, col), 0);
			}
		}
		assertEquals("", board.getGameState(), 1);
		assertEquals("", board.getTurn(),'B');
	}
	@Test
	public void testNewBoard() {
		size = 5;
		for (int row = 0; row < size; row++) {
			for (int col = 0; col < size; col++) {
				assertEquals("", board.getCell(row, col), 0);
			}
		}
		assertEquals("", board.getGameState(), 1);
		assertEquals("", board.getTurn(),'B');
	}
	@Test
	public void testValidSize() {
		board.getNewSize(5);
		assertEquals("", board.getGameState(), 1);
	}
	@Test
	public void testInvalidSizeLow() {
		board.getNewSize(2);
		assertEquals("", board.getGameState(), 0);
	}
	@Test
	public void testInvalidSizeHigh() {
		board.getNewSize(11);
		assertEquals("", board.getGameState(), 0);
	}
}
