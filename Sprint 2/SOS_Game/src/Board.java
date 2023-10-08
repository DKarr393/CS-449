public class Board {
	private int[][] grid; //Array for board,
	public int size = 10; //Chosen size, default at 3.
	private char turn = 'B'; //Turn, starts at B (Blue).
	private int gameState = 1; //If 1, game can start.
	
	public Board() {
		grid = new int[size][size];
	}
	public Board(int row, int column) {
		size = row;
		size = column;
		if (size < 3) {
			gameState = 0;
		}
		else if (size > 10) {
			gameState = 0;
		}
		grid = new int[size][size];
	}
	public int getNewSize(int newSize) {
		size = newSize;
		if (size < 3) {
			gameState = 0;
		}
		else if (size > 10) {
			gameState = 0;
		}
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
