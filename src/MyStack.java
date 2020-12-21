/*
* NAME: Patrick Tsai
* CLASS: WSUV CS320 - MW 10:30am
* ASSIGNMENT: Homework 1 - TDD and JUnit
* DUE DATE: 09/11/2020
* DESCRIPTION: Created bounded stack using unit testing practices. First created a failing test in either BasicTest.java or AdvancedTest.java
*           Then wrote the code in MyStack.java to make the test pass once run again. Then I recorded any changes to the MyStack.java code
*           in the refactor.txt file.
 */

public class MyStack {

  private final int[] stack;          // declare an integer array variable
  private static final int SIZE = 5;  // set the upper limit of values contained within the bounded stack - this is a constant
  private int current;                // declare the current placement variable

  public MyStack() {                  // constructor
      stack = new int[SIZE];          // create int array limited by SIZE
      current = 0;                    // holds the placement for the next integer pushed to stack
  }

  // isEmpty METHOD - checks if stack is empty
  // uses the current position as indicator - 0 indicates an empty stack
  public boolean isEmpty() {
      return current == 0;
  }

  // PUSH METHOD - adds the value given to the top of the stack
  // uses if statement to check if stack is full, throws exception if stack full
  public void push(int i) {
      if (current < stack.length) {
          stack[current] = i;
          current++;
      }
      else {
          throw new ArrayIndexOutOfBoundsException();
      }
  }

  // POP METHOD - adds the value given to the top of the stack
  // uses if statement to check if stack is empty, returns NULL if stack is empty
  public java.lang.Integer pop() {
      if (!isEmpty()) {
          int value;
          value = stack[current - 1];
          stack[current - 1] = 0;
          current--;
          return (value);
      }
      else {
          return (null);
          //throw new ArrayIndexOutOfBoundsException();
      }
  }

  // TOP METHOD - returns the value at the top of the stack
  // uses if statement to check if stack is empty, returns NULL if stack is empty
  public java.lang.Integer top() {
      if (current != 0) {
          return (stack[current - 1]);
      }
      else {
          return (null);
          //throw new ArrayIndexOutOfBoundsException();
      }
  }
}