import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BoardTest {
	private Board board = new Board();
	//AC 3.1, 3.2
	@Test
	public void testNewBoard() {
		int size = 3; //Chosen board size.
		for (int row = 0; row < size; row++) {
			for (int col = 0; col < size; col++) {
				assertEquals("", board.getCell(row, col), 0);
			}
		}
		assertEquals("", board.getGameState(), 1);
		assertEquals("", board.getTurn(),'B');
	}

}
