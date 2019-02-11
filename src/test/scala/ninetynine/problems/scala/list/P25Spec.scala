package ninetynine.problems.scala.list

import org.scalatest.{FlatSpec, Matchers}

class P25Spec extends FlatSpec with Matchers {
  val p25 = new P25Impl[Int]

  it should "generate a random permutation of the elements of a list" in {
    val permutated = p25.randomPermute(1 to 10 toList)
    permutated should not equal (1 to 10 toList)
    permutated.sorted should equal(1 to 10 toList)
  }
}
