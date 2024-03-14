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
      () => assertEquals(12.5663, perimeter(circle), 0.01)
    )

  @Test def testArea(): Unit =
    assertAll(
      () => assertEquals(4.0, area(square), 0),
      () => assertEquals(6.0, area(rectangle), 0),
      () => assertEquals(12.5663, area(circle), 0.01)
    )

  @Test def testScale(): Unit =
    assertAll(
      () => assertEquals(16.0, perimeter(scale(square, 2.0)), 0),
      () => assertEquals(20.0, perimeter(scale(rectangle, 2.0)), 0),
      () => assertEquals(25.1326, perimeter(scale(circle, 2.0)), 0.01)
    )
