package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private final int ERROR = -1;
	private final int SIZE = 12;
	private final int ENDSIZE = 11;
	private int[] numbers = new int[SIZE];

	private int total = -1;

	public int getTotal() {
		return total;
	}
	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return getTotal() == -1;
	}

	public boolean isFull() {
		return getTotal() == ENDSIZE;
	}

	protected int peekaboo() {
		if (callCheck())
			return ERROR;
		return numbers[getTotal()];
	}

	public int countOut() {
		if (callCheck())
			return ERROR;
		return numbers[total--];
	}

}
