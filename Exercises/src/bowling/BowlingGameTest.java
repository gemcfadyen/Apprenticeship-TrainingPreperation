package bowling;

import org.junit.Assert;
import org.junit.Test;

public class BowlingGameTest {
	@Test
	public void scoreIsZeroWhenPlayerKnocksZeroPinsPerFrame() {
		BowlingGame game = new BowlingGame();

		for (int rolls = 0; rolls < 20; rolls++) {
			game.roll(0);
		}

		Assert.assertEquals(game.getScore(), 0);
	}

	@Test
	public void scoreIsTwentyWhenPlayerKnocksOnePinPerFrame() {
		BowlingGame game = new BowlingGame();

		for (int rolls = 0; rolls < 20; rolls++) {
			game.roll(1);
		}

		Assert.assertEquals(game.getScore(), 20);
	}
}
