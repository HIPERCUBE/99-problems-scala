package ninetynine.problems.scala._1_arithmetic

import org.scalatest.{FlatSpec, Matchers}
import ninetynine.problems.scala._1_arithmetic.P31.RichInt

class P31Spec extends FlatSpec with Matchers {
  "7" should "returned true" in {
    3.isPrime should be(true)
  }

  "10" should "returned false" in {
    10.isPrime should be(false)
  }
}
