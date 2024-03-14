package task2a

object Positive extends App:

  val positive: Int => String = {
    case x if x >= 0 => "positive"
    case _ => "negative"
  }

  def positiveMethod(x: Int): String = x match
    case x if x >= 0 => "positive"
    case _ => "negative"
