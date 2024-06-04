package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());

        int ret = temp.countOut(); //TODO: needs refactoring - find more appropriate variable name

        while (!temp.callCheck())
            countIn(temp.countOut());

        return ret;
    }
}
