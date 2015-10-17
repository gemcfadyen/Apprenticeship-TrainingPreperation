package stack;

import org.junit.Test;

import org.junit.Assert;

public class StackTest {

	@Test
	public void newStackHasSizeOfTen() {
		Stack stack = new Stack();

		Assert.assertEquals(10, stack.size());
	}

	@Test
	public void pushesOntoStack() {
		Stack stack = new Stack();

		stack.push(14);

		Assert.assertEquals(14, stack.pop());
	}

	@Test (expected = IndexOutOfBoundsException.class)
	public void takingFromAnEmptyStackThrowsExcpeption() {
		Stack stack = new Stack();

		stack.pop();
	}

	@Test
	public void popsOnlyValueFromStack() {
		Stack stack = new Stack();
		stack.push(9);

		int poppedValue = stack.pop();

		Assert.assertEquals(9, poppedValue);
	}

	@Test
	public void onlyAllowsTenItemsToBeStored() {
		Stack stack = new Stack();
		for (int i = 0; i < 15; i++) {
			stack.push(i);
		}

		Assert.assertEquals(10, stack.size());
	}

}
