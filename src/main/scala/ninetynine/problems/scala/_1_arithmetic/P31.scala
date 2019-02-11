package ninetynine.problems.scala._1_arithmetic

object P31 {
  implicit class RichInt(val num: Int) extends AnyVal {
    def isPrime: Boolean = if (num < 2) false else !((2 to Math.sqrt(num).toInt) exists (num % _ == 0))
  }
}

