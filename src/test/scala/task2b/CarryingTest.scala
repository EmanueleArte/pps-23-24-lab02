package task2b

import org.junit.*
import org.junit.Assert.*
import org.junit.jupiter.api.Assertions.assertAll

class CarryingTest:

  @Test def testCarryingVal(): Unit =
    assertAll(
      () => assertTrue(p1(1)(2)(2)),
      () => assertFalse(p1(1)(2)(3))
    )