package alltasks

import scala.annotation.tailrec

// Task 2a - Svolto da solo
// a)
val positive: Int => String = {
  case x if x >= 0 => "positive"
  case _ => "negative"
}

def positiveMethod(x: Int): String = x match
  case x if x >= 0 => "positive"
  case _ => "negative"

// b)
def neg(pred: String => Boolean): String => Boolean = !pred(_)

// c)
def genericNeg[X](pred: X => Boolean): X => Boolean = !pred(_)


// Task 2b - Svolto da solo
// Carried
val p1: Double => Double => Double => Boolean = x => y => z => x <= y && y == z
// Non-carried
val p2: (Double, Double, Double) => Boolean = (x, y, z) => x <= y && y == z
// Carried
def p3(x: Double)(y: Double)(z: Double): Boolean = x <= y && y == z
// Non-carried
def p4(x: Double, y: Double, z: Double): Boolean = x <= y && y == z

// Functional composition
def intCompose(f: Int => Int, g: Int => Int): Int => Int = x => f(g(x))
def compose[A, B, C](f: B => C, g: A => B): A => C = x => f(g(x))


// Task 3 - Svolto da solo
@tailrec
def gcd(a: Int, b: Int): Int = (a, b) match
  case (a, b) if a == b && a == 0 => throw new ArithmeticException("divide by 0")
  case (a, b) if a == b => a
  case (a, b) if a == 0 => b
  case (a, b) if b == 0 => a
  case (a, b) if a > b => gcd(b, a % b)
  case (a, b) if b > a => gcd(a, b % a)
  case _ => 1


// Task 4 - Svolto da solo
enum Shape:
  case Square(s: Double)
  case Rectangle(maxS: Double, minS: Double)
  case Circle(r: Double)

import Shape.*
def perimeter(shape: Shape): Double = shape match
  case Square(s) => s * 4
  case Rectangle(maxS, minS) => (maxS + minS) * 2
  case Circle(r) => 2 * Math.PI * r

def area(shape: Shape): Double = shape match
  case Square(s) => s * s
  case Rectangle(maxS, minS) => maxS * minS
  case Circle(r) => Math.PI * r * r

def scale(shape: Shape, alpha: Double): Shape = shape match
  case Square(s) => Shape.Square(s * alpha)
  case Rectangle(maxS, minS) => Shape.Rectangle(maxS * alpha, minS * alpha)
  case Circle(r) => Shape.Circle(r * alpha)


// Task 5 - Svolto da solo
object Optionals:
  /**
   * Optional is a type that represents a value that may or may not be present.
   * Similar to Optional in Java but using the ADT concept.
   * Therefore, an Optional is a sum type with two cases: Maybe and Empty.
   * Maybe contains the value, and Empty represents the absence of a value.
   *
   * @tparam A
   */
  enum Optional[A]:
    case Maybe(value: A)
    case Empty()

  object Optional:
    /**
     * isEmpty returns true if the optional is Empty, false otherwise.
     * Example:
     *
     * isEmpty(Empty()) == true
     * isEmpty(Maybe(1)) == false
     *
     * @param optional the optional to check
     * @tparam A the type of the optional
     * @return true if the optional is Empty, false otherwise
     */
    def isEmpty[A](optional: Optional[A]): Boolean = optional match
      case Empty() => true
      case _ => false

    /**
     *
     * getOrElse returns the value of the optional if it is Maybe, otherwise it returns the default value.
     * Example:
     * orElse(Maybe(1), 0) == 1
     * orElse(Empty(), 0) == 0
     *
     * @param optional the optional to get the value from
     * @param default the default value to return if the optional is Empty
     * @tparam A the type of the optional
     * @tparam B the type of the default value
     * @return the value of the optional if it is Maybe, otherwise the default value
     */
    def orElse[A, B >: A](optional: Optional[A], default: B): B = optional match
      case Maybe(value) => value
      case Empty() => default

    // map and filter implementation ------------------------------------------------

    /**
     * map applies the function f to the value of the optional if it is Maybe, otherwise it returns Empty.
     * Example:
     *
     * map(Maybe(1), (x: Int) => x + 1) == Maybe(2)
     * map(Empty(), (x: Int) => x + 1) == Empty()
     *
     *
     * @param optional the optional to apply the function to
     * @param f the function to apply to the value of the optional
     * @tparam A the type of the optional
     * @tparam B the type of the result of the function
     * @return the result of applying the function to the value of the optional if it is Maybe, otherwise Empty
     */
    def map[A, B](optional: Optional[A], f: A => B): Optional[B] = optional match
      case Maybe(value) => Maybe(f(value))
      case Empty() => Empty()

    /**
     * filter the value of the optional according to the function f it is Maybe, otherwise it returns Empty.
     *
     * @param optional the optional to filter
     * @param f the function to filter the value of the optional
     * @tparam A the type of the optional
     * @return the optional if the value satisfies the function f and it is not Empty, otherwise Empty
     */
    def filter[A](optional: Optional[A], f: A => Boolean): Optional[A] = optional match
      case Maybe(value) if f(value) => Maybe(value)
      case _ => Empty()

    // --------------------------------------------------------------------------------