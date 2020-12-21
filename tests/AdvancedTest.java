import org.junit.Test;
import static org.junit.Assert.*;

/*
 * NAME: Patrick Tsai
 * CLASS: WSUV CS320 - MW 10:30am
 * ASSIGNMENT: Homework 1 - TDD and JUnit
 * DUE DATE: 09/11/2020
 * DESCRIPTION: Created bounded stack using unit testing practices. First created a failing test in either BasicTest.java or AdvancedTest.java
 *           Then wrote the code in MyStack.java to make the test pass once run again. Then I recorded any changes to the MyStack.java code
 *           in the refactor.txt file.
 */

public class AdvancedTest {

    /** === ADVANCED STEP 1 ===
     * Test 1: calls top from an empty list
     * - call top
     * - should return the NULL
     * - should return the ArrayIndexOutOfBoundsException exception
     */
    @Test //(expected = ArrayIndexOutOfBoundsException.class)
    public void testStackTopWhenEmpty() {
        MyStack testStack = new MyStack();
        assertNull(testStack.top());
    }

    /** === ADVANCED STEP 2 ===
     * Test 2: push a value onto a full stack
     * - push 6 values consecutively onto the stack
     * - should return the ArrayIndexOutOfBoundsException exception
     */
    @Test (expected = ArrayIndexOutOfBoundsException.class)
    public void testStackPushOnFullStack() {
        MyStack testStack = new MyStack();
        testStack.push(1);
        testStack.push(3);
        testStack.push(6);
        testStack.push(9);
        testStack.push(13);
        testStack.push(45);
    }

    /** === ADVANCED STEP 3 ===
     * Test 3: pop twice on empty stack then push once, check top value is equal to push
     * then pop four times, then add two numbers, make sure top is equal to last value added pop that value,
     * then make sure top is equal to the first number added.
     */
    @Test
    public void testStackAdvanced() {
        MyStack testStack = new MyStack();
        testStack.pop();
        testStack.pop();
        testStack.push(76);
        int stackReturn = testStack.top();
        assertEquals(76, stackReturn);
        testStack.pop();
        testStack.pop();
        testStack.pop();
        testStack.pop();
        testStack.push(123);
        testStack.push(15);
        int stackReturn1 = testStack.top();
        assertEquals(15, stackReturn1);
        testStack.pop();
        int stackReturn2 = testStack.top();
        assertEquals(123, stackReturn2);
    }
}