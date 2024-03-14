package task2a

import org.junit.*
import org.junit.Assert.*
import org.junit.jupiter.api.Assertions.assertAll

class PositiveTest:

  val positiveString = "positive"
  val negativeString = "negative"
  val positive = Positive

  @Test def testPositiveLambda(): Unit =
    assertAll(
      () => assertEquals(positiveString, positive.positive(5)),
      () => assertEquals(positiveString, positive.positive(0)),
      () => assertEquals(negativeString, positive.positive(-5))
    )

  @Test def testPositiveMethod(): Unit =
    assertAll(
      () => assertEquals(positiveString, positive.positiveMethod(5)),
      () => assertEquals(positiveString, positive.positiveMethod(0)),
      () => assertEquals(negativeString, positive.positiveMethod(-5))
    )
