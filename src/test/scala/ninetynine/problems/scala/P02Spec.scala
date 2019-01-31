package ninetynine.problems.scala

import org.scalatest.{FunSuite, Matchers}

class P02Spec extends FunSuite with Matchers {
  val p02: P02[Int] = new P02Impl[Int]

  test("that returns none for empty list") {
    p02.penultimate(List()) should be(None)
  }

  test("that returns none for single element's list") {
    p02.penultimate(List(3)) should be(None)
  }

  test("that returns element for two element's list") {
    p02.penultimate(List(3, 5)) should equal(Some(3))
  }

  test("that returns penultimate element for list") {
    p02.penultimate(List(1, 1, 2, 3, 5, 8)) should equal(Some(5))
  }
}
