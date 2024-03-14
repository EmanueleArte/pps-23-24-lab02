package task4

enum Shape:
  case Square(side: Double)
  case Rectangle(majorSide: Double, minorSide: Double)
  case Circle(radius: Double)

import Shape.*
def perimeter(shape: Shape): Double = shape match
  case Square(side) => side * 4
  case Rectangle(majorSide, minorSide) => (majorSide + minorSide) * 2
  case Circle(radius) => 2 * Math.PI * radius

def area(shape: Shape): Double = shape match
  case Square(side) => side * side
  case Rectangle(majorSide, minorSide) => majorSide * minorSide
  case Circle(radius) => Math.PI * radius * radius

def scale(shape: Shape, alpha: Double): Shape = shape match
  case Square(side) => Shape.Square(side * alpha)
  case Rectangle(majorSide, minorSide) => Shape.Rectangle(majorSide * alpha, minorSide * alpha)
  case Circle(radius) => Shape.Circle(radius * alpha)