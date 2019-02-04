package ninetynine.problems.scala

import org.scalatest.{FlatSpec, Matchers}

class P16Spec extends FlatSpec with Matchers {
  val p16: P16[Int] = new P16Impl[Int]

  it should "drop every nth elements in list" in {
    p16.drop(3, (1 to 10).toList) should equal(List(1, 2, 4, 5, 7, 8, 10))
    p16.dropR(3, (1 to 10).toList) should equal(List(1, 2, 4, 5, 7, 8, 10))
  }

  it should "drop every elements in list" in {
    p16.drop(1, (1 to 10).toList) should equal(List[Int]())
    p16.dropR(1, (1 to 10).toList) should equal(List[Int]())
  }
}
