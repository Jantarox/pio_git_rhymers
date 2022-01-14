package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int STACK_SIZE = 12;
	public static final int EMPTY_STACK_VALUE = -1;
	public static final int ERRNO_STACK_EMPTY = -1;
	private int[] numbers = new int[STACK_SIZE];

	public int total = -1;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == EMPTY_STACK_VALUE;
	}

	public boolean isFull() {
		return total == (STACK_SIZE - 1);
	}

	protected int peekaboo() {
		if (callCheck())
			return ERRNO_STACK_EMPTY;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return ERRNO_STACK_EMPTY;
		return numbers[total--];
	}

//	Kombinacja Ctrl+Alt+Lewo/Prawo (odpowiednik Alt+Lewo/Prawo w Eclipse) nawiguje między ostatnio edytowanymi miejscami w pliku

}
