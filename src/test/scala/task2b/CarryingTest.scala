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

  @Test def testNonCarryingVal(): Unit =
    assertAll(
      () => assertTrue(p2(1, 2, 2)),
      () => assertFalse(p2(1, 2, 3))
    )

  @Test def testCarryingDef(): Unit =
    assertAll(
      () => assertTrue(p3(1)(2)(2)),
      () => assertFalse(p3(1)(2)(3))
    )

  @Test def testNonCarryingDef(): Unit =
    assertAll(
      () => assertTrue(p4(1, 2, 2)),
      () => assertFalse(p4(1, 2, 3))
    )