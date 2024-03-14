package task4

import org.junit.*
import org.junit.Assert.*
import org.junit.jupiter.api.Assertions.assertAll

import Shape.*

class ShapeTest:

  val square: Shape = Square(2.0)
  val rectangle: Shape = Rectangle(2.0, 3.0)
  val circle: Shape = Circle(2.0)

  @Test def testPerimeter(): Unit =
    assertAll(
      () => assertEquals(8.0, perimeter(square), 0),
      () => assertEquals(10.0, perimeter(rectangle), 0),
      () => assertEquals(12.566370614359172, perimeter(circle), 0)
    )