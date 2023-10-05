public class Board {
	private int[][] grid; //Array for board,
	public int size = 3; //Chosen size, default at 3.
	private char turn = 'B'; //Turn, starts at B (Blue).
	private int gameState = 1; //If 1, game can start.
	
	public Board() {
		grid = new int[size][size];
	}
	public int getSize() {
		return size;
	}
	public int getCell(int row, int column) {
		return grid[row][column];
	}
	public int getGameState() {
		return gameState;
	}
	public char getTurn() {
		return turn;
	}
}
