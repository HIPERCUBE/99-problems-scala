package ninetynine.problems.scala.list

import org.scalatest.{FlatSpec, Matchers}

class P14Spec extends FlatSpec with Matchers {
  val p14: P14[Int] = new P14Impl[Int]

  "Duplicate method" should "work correctly" in {
    val list = List(1, 2, 3, 3, 4, 5)
    val expected = List(1, 1, 2, 2, 3, 3, 3, 3, 4, 4, 5, 5)
    p14.duplicate(list) should equal(expected)
  }

  "DuplicateR method" should "work correctly" in {
    val list = List(1, 2, 3, 3, 4, 5)
    val expected = List(1, 1, 2, 2, 3, 3, 3, 3, 4, 4, 5, 5)
    p14.duplicateR(list) should equal(expected)
  }
}
