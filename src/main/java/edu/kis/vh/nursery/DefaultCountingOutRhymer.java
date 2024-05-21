package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int MAX = 11;

    private static final int DEFAULT_VALUE = -1;

    private static final int ERROR = -1;

    private static final int MAX_SIZE = MAX + 1;

    private final int[] numbers = new int[MAX_SIZE];

    public int total = DEFAULT_VALUE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == DEFAULT_VALUE;
    }

    public boolean isFull() {
        return total == MAX;
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
