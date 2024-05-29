package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class IntLinkedListJUnitTest {

    @Test
    public void testPushAndTop() {
        IntLinkedList list = new IntLinkedList();
        int testValue = 4;
        list.push(testValue);

        int result = list.top();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testIsEmpty() {
        IntLinkedList list = new IntLinkedList();
        Assert.assertTrue(list.isEmpty());

        list.push(888);
        Assert.assertFalse(list.isEmpty());
    }

    @Test
    public void testIsFull() {
        IntLinkedList list = new IntLinkedList();
        Assert.assertFalse(list.isFull());
    }

    @Test
    public void testTop() {
        IntLinkedList list = new IntLinkedList();
        final int ERROR = -1;

        int result = list.top();
        Assert.assertEquals(ERROR, result);

        int testValue = 4;
        list.push(testValue);

        result = list.top();
        Assert.assertEquals(testValue, result);
        Assert.assertEquals(testValue, list.top());
    }

    @Test
    public void testPop() {
        IntLinkedList list = new IntLinkedList();
        final int ERROR = -1;

        int result = list.pop();
        Assert.assertEquals(ERROR, result);

        int testValue = 4;
        list.push(testValue);

        result = list.pop();
        Assert.assertEquals(testValue, result);
        Assert.assertEquals(ERROR, list.pop());
    }
}
