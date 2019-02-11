package ninetynine.problems.scala.list

import org.scalatest.{FunSuite, Matchers}

class P03Spec extends FunSuite with Matchers {
  val p03: P03[Int] = new P03Impl[Int]

  test("that returns nth element") {
    p03.nth(0, List(3, 4, 5, 1, 2, 8, 7)) should be(Some(3))
    p03.nth(1, List(3, 4, 5, 1, 2, 8, 7)) should be(Some(4))
    p03.nth(4, List(3, 4, 5, 1, 2, 8, 7)) should be(Some(2))
    p03.nth(6, List(3, 4, 5, 1, 2, 8, 7)) should be(Some(7))
  }

  test("that fails if n is bigger then length of the list") {
    p03.nth(30, List(1, 2, 3)) should be(None)
    p03.nth(3, List(1, 2, 3)) should be(None)
    p03.nth(0, List()) should be(None)
  }

  test("that fails if n is negative") {
    p03.nth(-1, List(0, 1)) should be(None)
    p03.nth(-1, List()) should be(None)
  }
}
