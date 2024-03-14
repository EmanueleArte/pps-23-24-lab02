package task3

import org.junit.*
import org.junit.Assert.*

class RecursionTest:

  @Test def testGcdEqualNumbers(): Unit =
    assertEquals(5, gcd(5, 5))

  @Test def testGcdWithOneNumberIsZero(): Unit =
    assertEquals(5, gcd(0, 5))

  @Test def testGcdWithBothNumbersAreZero(): Unit =
    assertThrows(classOf[ArithmeticException], () => gcd(0, 0))

  @Test def testGcdWithBothNumbers(): Unit =
    assertEquals(5, gcd(5, 10))
