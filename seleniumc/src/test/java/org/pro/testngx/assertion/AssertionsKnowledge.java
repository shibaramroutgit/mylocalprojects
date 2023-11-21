package org.pro.testngx.assertion;

public class AssertionsKnowledge {
    /**
     * Assertion
     * In Test NG, Assertion  is used to verify condition in Test Case
     * and based on the condition result we decided Test Case is Pass or Fail
     *
     * Test Case Fail
     * A test case will be considered as failed, either if the assert statement results in fail
     * or an exception is thrown inside a test case.
     *
     * Test Case Pass
     * A test case will be considered as Passed, either if the assert statement results in Pass
     * or no exception is thrown inside a test case.
     *
     * AssertionError Class
     * When Assertion statement result in fail, TestNG throws an error "AssertionError"
     * AssertionError - Sub Class of Error - Error & Exception - sub Class of Throwable
     *
     * IMP NOTE: All Assertion methods are present in Assertion Class and Assert & SoftAssert extends this class
     *  No all methods are also parent in Assert & softAssert class
     *  Assertion  Methods
     *  1 assertTrue
     *  -- assertTrue(boolean condition)
     *  -- assertTrue(boolean condition, "Fail Message")
     *  -- assertTrue() always expect true from condition to make test case pass
     *
     * 2 assertFalse
     *  -- assertFalse(boolean condition)
     *  -- assertFalse(boolean condition, "Fail Message")
     *  -- assertFalse() always expect false from condition to make test case pass
     *
     *  3 fail()
     *  -- fail()
     *  -- fail("User Define Message for Fail")
     *  -- fail("User Define Message for Fail", new exception (Message of the Exception))
     *
     *  4 AssertEquals
     *  -- AssertEquals(x1,x2)
     *  -- AssertEquals() always expect both parameter should same then it make as Pass Asle Fail
     *  -- in AssertEquals() we can compare any value or object or web element or collection
     *
     *  5 assertNotNull
     *  -- assertNotNull(val)
     *  -- assertNotNull()  the value parameter should not null, if null fail else pass
     *
     *  6 assertNull
     *  -- assertNull(val)  the value parameter should  null, if null pass else fail
     *
     *  7 assertEqualsNoOrder
     *  -- assertEqualsNoOrder(Object [] a, Object [] B) compares the two Object arrays irrespective of the order of values
     *  -- if values same then Pass else Fail
     *
     *  8 assertNotEquals(val1, val2)
     *  -- assertNotEquals(object A, Object B) compares the two Object, if both are same Fail else Pass
     *
     *
     * Types of Assertions
     * 1 Assert class / Hard Assert
     * 2 SoftAssert class / verify
     *
     * 1 Assert class / Hard Assert
     *      1 We can use single or multiple Hard assert in a @Test Method
     *      2 If any one Hard assert fail then @Test method consider fail
     *      3 The code below the Hard Assert will not execute if it fails
     *      4 All the methods of "Assert" class are static, so we can call by CLass Name
     *      5 Assertion can work inside @Test method

     * 2 SoftAssert class / verify
     *       1 SoftAssert class has only two methods + All the methods of Assertion Class
     *       2 doAssert (protected method, we would not be using it)
     *       3 assertAll()
     *       4 If any one assert fail , it will continue execution for all assert and code then throw Assertion Error
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     */
}
