package stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumbersStackTest {
    @Test
    public void testGetCount() {
        NumbersStack numbersStack = new NumbersStack();
        int expected = 0;
        int actual = numbersStack.getCount();
        assertEquals(expected, actual);
    }

    @Test
    public void testPush() {
        NumbersStack numbersStack = new NumbersStack();
        int expected = 2;
        int actual = numbersStack.getPush(10);
        actual = numbersStack.getPush(20);
        assertEquals(expected, actual);
    }
}