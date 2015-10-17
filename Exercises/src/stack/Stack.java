package stack;

public class Stack {
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
		return values[indexOfFreeSlot - 1];
	}
}