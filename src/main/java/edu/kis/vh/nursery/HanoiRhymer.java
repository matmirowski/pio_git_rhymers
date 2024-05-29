package edu.kis.vh.nursery;

/**
 * HanoiRhymer is a specialized version of DefaultCountingOutRhymer that keeps track of rejected values.
 * A value is considered rejected if it is greater than the current top value on the stack,
 * and it is not the first value to be inserted.
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    private static final int START = 0;  // Initial value for the count of rejected elements
    private int totalRejected = START;   // Counter for the number of rejected values

    /**
     * Returns the total number of rejected elements that were attempted to be added to the rhymer.
     *
     * @return The total count of rejected values since the rhymer's instantiation.
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * Adds a new value to the rhymer. If the rhymer is not empty and the given value is greater than
     * the current top value, the value is rejected and not added to the storage, increasing the rejected count.
     * Otherwise, the value is added as usual using the superclass method.
     *
     * @param in the integer value to be added or rejected based on its comparison with the current top value.
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
