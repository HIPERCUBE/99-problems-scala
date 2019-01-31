package ninetynine.problems.scala

import org.scalatest.{FunSuite, Matchers}

class P01Spec extends FunSuite with Matchers {
  val p01: P01[Int] = new P01Impl[Int]

  test("that returns element for single element's list") {
    p01.last(List(3)) should equal(Some(3))
  }

  test("that returns none for empty list") {
    p01.last(List()) should be(None)
  }

  test("that returns last element of list") {
    p01.last(List(1, 1, 2, 3, 5, 8)) should be(Some(8))
  }
}
