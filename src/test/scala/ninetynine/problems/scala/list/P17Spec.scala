package ninetynine.problems.scala.list

import org.scalatest.{FlatSpec, Matchers}

class P17Spec extends FlatSpec with Matchers {
  val p17s: List[P17[Int]] = List(
    new P17Impl[Int],
    new P17TakeDropImpl[Int],
  )

  it should "split a empty list into one part" in {
    p17s.foreach(p17 => {
      p17.split(1, List(1)) should equal((List(1), List()))
      p17.split(2, List(1, 2)) should equal((List(1, 2), List()))
    })
  }

  it should "split a list into two part" in {
    p17s.foreach(p17 => {
      p17.split(1, (1 to 5).toList) should equal((List(1), (2 to 5).toList))
      p17.split(3, (1 to 10).toList) should equal(((1 to 3).toList, (4 to 10).toList))
    })
  }
}
