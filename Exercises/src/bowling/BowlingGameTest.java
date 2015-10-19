package bowling;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BowlingGameTest {

	private BowlingGame game;

	@Before
	public void setup() {
		game = new BowlingGame();
	}

	@Test
	public void gutterGame() {
		rollMultipleTimes(0, 20);

		Assert.assertEquals(0, game.score());
	}

	@Test
	public void onePinPerRoll() {
		rollMultipleTimes(1, 20);

		Assert.assertEquals(20, game.score());
	}

	@Test
	public void spare() {
		game.roll(5);
		game.roll(5);
		game.roll(3);

		Assert.assertEquals(16, game.score());
	}

	@Test
	public void strike() {
		game.roll(10);
		game.roll(5);
		game.roll(3);

		Assert.assertEquals(26, game.score());
	}

	@Test
	public void perfect() {
		rollMultipleTimes(10, 11);
		Assert.assertEquals(300, game.score());

	}

	private void rollMultipleTimes(int pins, int numberOfTurns) {
		for (int turns = 0; turns < numberOfTurns; turns++) {
			game.roll(pins);
		}
	}

}