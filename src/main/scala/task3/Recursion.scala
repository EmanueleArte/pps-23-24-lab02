package task3

import math.Integral.Implicits.infixIntegralOps
import scala.annotation.tailrec

@tailrec
def gcd(a: Int, b: Int): Int = (a, b) match
  case (a, b) if a == b && a == 0 => throw new ArithmeticException("divide by 0")
  case (a, b) if a == b => a
  case (a, b) if a == 0 => b
  case (a, b) if b == 0 => a
  case (a, b) if a > b => gcd(b, a % b)
  case (a, b) if b > a => gcd(a, b % a)
  case _ => 1