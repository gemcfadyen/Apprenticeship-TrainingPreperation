package stack;

import org.junit.Assert;
import org.junit.Test;

public class StackWithSizeTest {

	@Test
	public void stackIsOfSpecifiedSize() {
		StackWithSize stack = new StackWithSize(4);
		Assert.assertEquals(4, stack.size());
	}

	@Test
	public void newStackHasSpecifiedSize() {
		StackWithSize stack = new StackWithSize(5);

		Assert.assertEquals(5, stack.size());
	}

	@Test
	public void pushesOntoStack() {
		StackWithSize stack = new StackWithSize(2);

		stack.push(10);

		Assert.assertEquals(10, stack.pop());
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void takingFromAnEmptyStackThrowsExcpeption() {
		StackWithSize stack = new StackWithSize(0);

		stack.pop();
	}

	@Test
	public void popsOnlyValueFromStack() {
		StackWithSize stack = new StackWithSize(2);
		stack.push(9);

		int poppedValue = stack.pop();

		Assert.assertEquals(9, poppedValue);
	}

	@Test
	public void anyNumberOfItemsToBeStored() {
		StackWithSize stack = new StackWithSize(10);
		for (int i = 0; i < 11; i++) {
			stack.push(i);
		}

		Assert.assertEquals(20, stack.size());
	}
}
