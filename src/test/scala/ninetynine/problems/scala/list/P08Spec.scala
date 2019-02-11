package ninetynine.problems.scala.list

import org.scalatest.{FunSuite, Matchers}

class P08Spec extends FunSuite with Matchers {
  val p08: P08[Char] = new P08Impl[Char]

  test("that already compressed list returned untouched") {
    p08.compress(List('a', 'b', 'c', 'd', 'e')) should equal(List('a', 'b', 'c', 'd', 'e'))
  }

  test("that compress consecutive duplicates") {
    p08.compress(List('a', 'a', 'b', 'b', 'b', 'b', 'c', 'd', 'd', 'e', 'e', 'e')) should equal(List('a', 'b', 'c', 'd', 'e'))
  }
}
