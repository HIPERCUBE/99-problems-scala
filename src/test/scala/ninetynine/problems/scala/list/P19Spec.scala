package ninetynine.problems.scala.list

import org.scalatest.{FlatSpec, Matchers}

class P19Spec extends FlatSpec with Matchers {
  val p19s: List[P19[Int]] = List(
    new P19TakeDrop[Int],
    new P19RecursiveImpl[Int],
  )

  it should "rotate a list N places to the left" in {
    p19s.foreach(p19 => {
      p19.rotate(3, (1 to 10).toList) should equal((4 to 10).toList ++ (1 to 3).toList)
    })
  }
}
