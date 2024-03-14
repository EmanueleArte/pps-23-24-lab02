package task2b

import org.junit.*
import org.junit.Assert.*

class FunctionalCompositionTest:

  @Test def intMethodCompositionTest(): Unit =
    val f: Int => Int = (x: Int) => x - 1
    val g: Int => Int = (x: Int) => x * 2
    val composed: Int = intCompose(f, g)(5)
    assertEquals(9, composed)

  @Test def genericMethodCompositionForStringTest(): Unit =
    val composed: String = compose("hello " + _, "" + _)("world")
    assertEquals("hello world", composed)

  @Test def genericMethodCompositionForIntTest(): Unit =
    val f: Int => Int = (x: Int) => x - 1
    val g: Int => Int = (x: Int) => x * 2
    val composed: Int = compose(f, g)(5)
    assertEquals(9, composed)

  @Test def genericMethodCompositionForIntAndBooleanTest(): Unit =
    val f: Int => Boolean = (x: Int) => x > 0
    val g: Int => Int = (x: Int) => x + 1
    val composed: Boolean = compose(f, g)(5)
    assertTrue(composed)