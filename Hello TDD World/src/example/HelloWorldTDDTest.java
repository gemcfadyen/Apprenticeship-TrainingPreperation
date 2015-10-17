package example;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTDDTest {

	@Test
	public void greetReturnsWelcomeMessage() {
		HelloTddWorld helloWorld = new HelloTddWorld();
		assertEquals(helloWorld.greet(), "Hallo Welt");
	}

}
