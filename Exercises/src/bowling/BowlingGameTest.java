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

		play(0, 20);
		Assert.assertEquals(0, game.score());
	}

	@Test
	public void gameKnocksDownOnePin() {
		play(1, 20);
		Assert.assertEquals(20, game.score());
	}

	@Test
	public void spare() {
		game.rolls(5);
		game.rolls(5);
		game.rolls(3);

		play(0, 17);

		Assert.assertEquals(16, game.score());
	}

	@Test
	public void strikeTakesPrecedence() {
		game.rolls(10);
		game.rolls(0);
		game.rolls(3);

		play(0, 17);

		Assert.assertEquals(16, game.score());
	}

	@Test
	public void strike() {
		game.rolls(10);
		game.rolls(3);
		game.rolls(3);

		play(0, 17);

		Assert.assertEquals(22, game.score());
	}

	@Test
	public void perfect() {
		play(10, 12);
		Assert.assertEquals(300, game.score());
	}

	private void play(int pinsKnockedDown, int numberOfTurns) {
		for (int turns = 0; turns < numberOfTurns; turns++) {
			game.rolls(pinsKnockedDown);
		}
	}

}