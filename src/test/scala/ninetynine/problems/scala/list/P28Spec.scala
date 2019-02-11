package ninetynine.problems.scala.list

import org.scalatest.{FlatSpec, Matchers}

class P28Spec extends FlatSpec with Matchers {
  val p28a = new P28aImpl[String]
  val p28b = new P28bImpl[String]

  "P28a" should "sort list elements by length" in {
    val input = List(List("a", "b", "c"), List("d", "e"), List("f", "g", "h"), List("d", "e"), List("i", "j", "k"), List("m", "n"), List("o"))
    val result = p28a.lsort(input)
    result should equal(List(List("o"), List("d", "e"), List("d", "e"), List("m", "n"), List("a", "b", "c"), List("f", "g", "h"), List("i", "j", "k")))
  }

  "P28b" should "sort list by length frequency" in {
    val input = List(List("a", "b", "c"), List("d", "e"), List("f", "g", "h"), List("d", "e"), List("i", "j", "k", "l"), List("m", "n"), List("o"))
    val result = p28b.lsortFreq(input)
    result should equal(List(List("i", "j", "k", "l"), List("o"), List("a", "b", "c"), List("f", "g", "h"), List("d", "e"), List("d", "e"), List("m", "n")))
  }

  "P28b" should "sort list by element list length frequency" in {
    val input = List(List("a", "b", "c", "d"), List("d", "e"), List("f", "g", "h"), List("d", "e"), List("i", "j", "k", "l"), List("m", "n"), List("o"))
    val result = p28b.lsortFreq(input)
    result should equal(List(List("o"), List("f", "g", "h"), List("a", "b", "c", "d"), List("i", "j", "k", "l"), List("d", "e"), List("d", "e"), List("m", "n")))
  }
}
