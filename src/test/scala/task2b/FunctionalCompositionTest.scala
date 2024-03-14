package task2b

import org.junit.*
import org.junit.Assert.*

class FunctionalCompositionTest:

  @Test def intMethodCompositionTest(): Unit =
    val f: Int => Int = (x: Int) => x - 1
    val g: Int => Int = (x: Int) => x * 2
    val composed: Int = intCompose(f, g)(5)
    assertEquals(9, composed)