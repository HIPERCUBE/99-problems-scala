package ninetynine.problems.scala._0_list

import org.scalatest.{FlatSpec, Matchers}

class P26Spec extends FlatSpec with Matchers {
  val p26s: List[P26[Int]] = List(
    new P26Impl[Int],
    new P26RecursiveImpl[Int],
  )

  it should "generate the combinations of 10 distinct objects from the 3 elements of a list" in {
    p26s.foreach(p26 => {
      p26.combinations(3, 1 to 10 toList) should equal((1 to 10).combinations(3) toList)
    })
  }
}
