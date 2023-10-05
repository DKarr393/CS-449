import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GUITest {
	private Board board;
	
	public void setUp() throws Exception {
		board = new Board();
	}
	
	public void testBoardSize() { 
		new GUI(board);
		
	}
	
	@Test
	public void testEmptyBoard() { //Ensures the board works.
		new GUI(board);
		try {Thread.sleep(2000);
		} catch (InterruptedException e) {e.printStackTrace();}
	}
}
