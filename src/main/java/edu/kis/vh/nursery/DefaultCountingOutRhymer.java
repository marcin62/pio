package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private final int ERROR = -1;
	private final int SIZE = 12;
	private final int ENDSIZE = 11;
	private int[] numbers = new int[SIZE];

	private int total = -1;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == -1;
	}

	public boolean isFull() {
		return total == ENDSIZE;
	}

	protected int peekaboo() {
		if (callCheck())
			return ERROR;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return ERROR;
		return numbers[total--];
	}

}
