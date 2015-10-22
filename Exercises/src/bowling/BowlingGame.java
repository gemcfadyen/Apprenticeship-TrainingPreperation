package bowling;

public class BowlingGame {
	private int[] pinsKnockedDown = new int[22];
	private int rollIndex = 0;

	public void rolls(int pins) {
		pinsKnockedDown[rollIndex] = pins;
		rollIndex++;
	}

	public int score() {
		int score = 0;
		int roll = 0;
		
		for (int frame = 0; frame < 10; frame++) {
			if (isSpare(roll)) {
				score += 10 + spareBonus(roll);
				roll += 2;
			} else if (isStrike(roll)) {
				score += 10 + strikeBonus(roll);
				roll += 1;
			} else {
				score += regularScore(roll);
				roll += 2;
			}
		}
		
		return score;
	}

	private int strikeBonus(int pinIndex) {
		return pinsKnockedDown[pinIndex + 1] + pinsKnockedDown[pinIndex + 2];
	}

	private boolean isStrike(int pinIndex) {
		return pinsKnockedDown[pinIndex] == 10;
	}

	private int spareBonus(int pinIndex) {
		return pinsKnockedDown[pinIndex + 2];
	}

	private int regularScore(int pinIndex) {
		return pinsKnockedDown[pinIndex] + pinsKnockedDown[pinIndex + 1];
	}

	private boolean isSpare(int pinIndex) {
		return regularScore(pinIndex) == 10;
	}
}