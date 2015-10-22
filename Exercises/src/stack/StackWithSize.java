package stack;

import java.util.Arrays;

public class StackWithSize {
	private int[] values;
	private int indexOfNextFreeSlot = 0;

	public StackWithSize(int capacity) {
		values = new int[capacity];
	}

	public void push(int value) {
		int originalLength = values.length;
		if (indexOfNextFreeSlot == originalLength) {
			values = Arrays.copyOf(values, originalLength + 10);
		}
		values[indexOfNextFreeSlot] = value;
		indexOfNextFreeSlot++;
	}

	public int size() {
		return values.length;
	}

	public int pop() {
		int poppedValue = values[indexOfNextFreeSlot - 1];
		indexOfNextFreeSlot--;
		return poppedValue;
	}
}
