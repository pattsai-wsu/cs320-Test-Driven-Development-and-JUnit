import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/*
 * NAME: Patrick Tsai
 * CLASS: WSUV CS320 - MW 10:30am
 * ASSIGNMENT: Homework 1 - TDD and JUnit
 * DUE DATE: 09/11/2020
 * DESCRIPTION: Created bounded stack using unit testing practices. First created a failing test in either BasicTest.java or AdvancedTest.java
 *           Then wrote the code in MyStack.java to make the test pass once run again. Then I recorded any changes to the MyStack.java code
 *           in the refactor.txt file.
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BasicTest.class,
        AdvancedTest.class
})

public class TestSuite {}