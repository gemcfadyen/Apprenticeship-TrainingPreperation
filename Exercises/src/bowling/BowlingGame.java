package bowling;

public class BowlingGame {
	private int score = 0;

	public void roll(int numberOfPinsKnockedDown) {
		score += numberOfPinsKnockedDown;
	}

	public int getScore() {
		return score;
	}
}
