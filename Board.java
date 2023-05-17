public class Board {
	private BoardState boardState;
	private Board gameBoard;

	private Board() {
	}

	public Board getInstance() {
		if (gameBoard == null) {
			gameBoard = new Board();
		}
		return gameBoard;
	}

	public BoardState getBoardState() {
		return this.boardState;
	}

	public void setBoardState(BoardState boardState) {
		this.boardState = boardState;
	}
}
