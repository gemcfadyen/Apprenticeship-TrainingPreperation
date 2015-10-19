package bowling;

public class BowlingGame {
	private int[] pins = new int[22];
	private int rollIndex = 0;

	public void roll(int pin) {
		pins[rollIndex] = pin;
		rollIndex++;
	}

	public int score() {
		int score = 0;
		int roll = 0;
		for (int frame = 0; frame < 11; frame++) {
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

	private int strikeBonus(int roll) {
		return pins[roll + 1] + pins[roll + 2];
	}

	private boolean isStrike(int roll) {
		return pins[roll] == 10;
	}

	private int regularScore(int roll) {
		return pins[roll] + pins[roll + 1];
	}

	private int spareBonus(int roll) {
		return pins[roll + 2];
	}

	private boolean isSpare(int roll) {
		return regularScore(roll) == 10;
	}
}