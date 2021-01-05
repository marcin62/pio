package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private final int SIZE = 12;
	private final int SIZEFULL = 11;
	private final int CHECKVALUE = -1;
	private int[] numbers = new int[SIZE];

	private int total = -1;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == CHECKVALUE;
	}

	public boolean isFull() {
		return total == SIZEFULL;
	}

	protected int peekaboo() {
		if (callCheck())
			return -1;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return -1;
		return numbers[total--];
	}

}
