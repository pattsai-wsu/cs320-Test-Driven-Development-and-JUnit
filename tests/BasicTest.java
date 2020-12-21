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

public class BasicTest {

    /** === STEP 1 ===
     * Test 1: Test the initialization of a stack to make sure it is empty
     * - creates stack
     * - checks if stack is empty
     */
    @Test
    public void testStackInitIsEmpty() {
        MyStack testStack = new MyStack();
        assertTrue(testStack.isEmpty());
    }

    /** === STEP 2 ===
     * Test 2: Push a number to the stack and verify that isEmpty is false
     * - uses a push method to try to push to stack
     * - then tests isEmpty to check if return is false
     */
    @Test
    public void testStackPushIsEmpty() {
        MyStack testStack = new MyStack();
        testStack.push(7);
        assertFalse(testStack.isEmpty());
    }

    /** === STEP 3 ===
     * Test 3: add 1 value to the stack, then pop the value, then check if the stack is empty
     * - push value
     * - pop value
     * - check boolean for isEmpty, should return true
     */
    @Test
    public void testStackPushPopIsEmpty() {
        MyStack testStack = new MyStack();
        testStack.push(9);
        testStack.pop();
        assertTrue(testStack.isEmpty());
    }

    /** === STEP 4 ===
     * Test 4: Push a value, then pop, and check is return value equals what was pushed
     * - push value
     * - pop value
     * - check return is equivalent to the pushed value
     */
    @Test
    public void testStackPushPopIsEqual() {
        MyStack testStack = new MyStack();
        testStack.push(278);
        int returnedVal = testStack.pop();
        assertEquals(278, returnedVal);
    }

    /** === STEP 5 ===
     * Test 5: push 3 values to the stack, then pop 3 times and check that the vales are popped in the correct order
     * - push1, push2, push3
     * - pop1, check value
     * - pop2, check value
     * - pop3, check value
     */
    @Test
    public void testStackPushPopIsOrderCorrect() {
        MyStack testStack = new MyStack();
        testStack.push(278);
        testStack.push(13);
        testStack.push(1428);

        int returnedVal1 = testStack.pop();
        assertEquals(1428, returnedVal1);

        int returnedVal2 = testStack.pop();
        assertEquals(13, returnedVal2);

        int returnedVal3 = testStack.pop();
        assertEquals(278, returnedVal3);
    }

    /** === STEP 6 ===
     * Test 6: pop a stack of 0 elements
     * - pop
     * - check return is array out of bounds exception
     */
    @Test //(expected = ArrayIndexOutOfBoundsException.class)
    public void testStackPopEmptyStack() {
        MyStack testStack = new MyStack();
        assertNull(testStack.pop());
    }

    /** === STEP 7 ===
     * Test 7: push value to stack, then call top, then check if isEmpty is false
     * - push value
     * - call top
     * - check isEmpty - should return false
     */
    @Test
    public void testStackPushTopIsEmpty() {
        MyStack testStack = new MyStack();
        testStack.push(34);
        testStack.top();
        assertFalse(testStack.isEmpty());
    }

    /** === STEP 8 ===
     * Test 8: push value to stack, call top, test to make sure values are equivalent
     * - push value
     * - call top
     * - test values are equivalent
     */
    @Test
    public void testStackPushTopValue() {
        MyStack testStack = new MyStack();
        testStack.push(346);
        int returnVal = testStack.top();
        assertEquals(346, returnVal);
    }
}
