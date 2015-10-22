package stack;

import java.io.Serializable;

public class Stack implements Serializable {
	private int[] values = new int[10];
	private int indexOfFreeSlot = 0;

	public void push(int value) {
		if (indexOfFreeSlot < 10) {
			values[indexOfFreeSlot] = value;
			indexOfFreeSlot++;
		}
	}

	public int size() {
		return values.length;
	}

	public int pop() {
		int poppedValue = values[indexOfFreeSlot - 1];
		indexOfFreeSlot--;

		return poppedValue;
	}
}