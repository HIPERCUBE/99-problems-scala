package ninetynine.problems.scala.list

import org.scalatest.{FlatSpec, Matchers}

class P24Spec extends FlatSpec with Matchers {
  val p24 = new P24Impl

  it should "draw N different random numbers the set 1..M" in {
    val drawed = p24.lotto(6, 49)
    drawed should have length 6
    drawed.foreach(d => {
      d should be >= 1
      d should be <= 49
    })
  }
}
