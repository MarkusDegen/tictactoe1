public class Game {
	private Player currentPlayer;
	private int lastX;
	private int lastY;

	public Game() {
		currentPlayer = Player.X;
		lastX = -1;
		lastY = -1;
	}

	public void setX(int x, int y) {
		checkDuplicateMove(x, y);
		checkForPlayerTurn(Player.X);
		saveLastMove(x, y);
		currentPlayer = Player.O;
	}

	public void setO(int x, int y) {
		checkDuplicateMove(x, y);
		checkForPlayerTurn(Player.O);
		saveLastMove(x, y);
		currentPlayer = Player.X;
	}

	private void checkForPlayerTurn(Player o) {
		if (currentPlayer != o) {
			throw new InvalidMoveException();
		}
	}

	private void checkDuplicateMove(int x, int y) {
		if (lastX == x && lastY == y) {
			throw new InvalidMoveException();
		}
	}

	private void saveLastMove(int x, int y) {
		lastX = x;
		lastY = y;
	}

	public Player currentPlayer() {
		return currentPlayer;
	}
}
