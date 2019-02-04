package ninetynine.problems.scala

import org.scalatest.{FlatSpec, Matchers}

class P20Spec extends FlatSpec with Matchers {
  val p20s: List[P20[Int]] = List(
    new P20TakeDropImpl[Int],
    new P20SplitImpl[Int],
  )

  it should "remove the Kth element from a list" in {
    p20s.foreach(p20 => {
      p20.removeAt(3, (0 to 4).toList) should equal((List(0, 1, 2, 4), 3))
    })
  }
}
