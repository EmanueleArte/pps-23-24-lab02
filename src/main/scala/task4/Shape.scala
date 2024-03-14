package task4

enum Shape:
  case Square(side: Double)
  case Rectangle(majorSide: Double, minorSide: Double)
  case Circle(radius: Double)

def perimeter(shape: Shape): Double = shape match
  case Shape.Square(side) => side * 4
  case Shape.Rectangle(majorSide, minorSide) => (majorSide + minorSide) * 2
  case Shape.Circle(radius) => 2 * Math.PI * radius

def area(shape: Shape): Double = shape match
  case Shape.Square(side) => side * side
  case Shape.Rectangle(majorSide, minorSide) => majorSide * minorSide
  case Shape.Circle(radius) => Math.PI * radius * radius