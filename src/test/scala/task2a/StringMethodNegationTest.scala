package task2a

import org.junit.*
import org.junit.Assert.*

class StringMethodNegationTest:

  val empty: String => Boolean = _ == ""
  val notEmpty: String => Boolean = neg(empty)

  @Test def testEmptyString(): Unit =
    assertTrue(empty(""))

  @Test def testNotEmptyString(): Unit =
    assertFalse(empty("foo"))

  @Test def testNotEmptyStringNegation(): Unit =
    assertTrue(notEmpty("foo"))

  @Test def testEmptyStringNegation(): Unit =
    assertFalse(notEmpty(""))