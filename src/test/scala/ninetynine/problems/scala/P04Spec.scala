package ninetynine.problems.scala

import org.scalatest.{FunSuite, Matchers}

class P04Spec extends FunSuite with Matchers {
  val p04: P04[Int] = new P04Impl[Int]

  test("that returns 0 for empty list") {
    p04.length(List()) should be(0)
  }

  test("that returns 1 for one-element list") {
    p04.length(List(0)) should be(1)
    p04.length(List(3)) should be(1)
  }

  test("that returns the list length") {
    p04.length(List(7, 5, 1, 4, 3)) should be(5)
    p04.length((1 to 100).toList) should be(100)
  }
}
