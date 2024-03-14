package task2a

import org.junit.*
import org.junit.Assert.*

class StringMethodNegationTest:

  val empty: String => Boolean = _ == ""
//  val notEmpty = neg(empty)

  @Test def testEmptyString() =
    assertTrue(empty(""))

  @Test def testNotEmptyString() =
    assertFalse(empty("foo"))