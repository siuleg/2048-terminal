import java.util.ArrayList;

public class BoardState {
	private ArrayList<ArrayList<Tile>> boardState = new ArrayList<ArrayList<Tile>>();
	private boolean isGameOver = false; // Default value is for the game not to be over.

	public BoardState() {}

	public ArrayList<ArrayList<Tile>> getBoardState() {
		return this.boardState;
	}

	public void setBoardState(ArrayList<ArrayList<Tile>> boardState) {
		this.boardState = boardState;
	}

	public boolean getIsGameOver() {
		return this.isGameOver;
	}

	public void setIsGameOver(boolean isGameOver) {
		this.isGameOver = isGameOver;
	}

}
