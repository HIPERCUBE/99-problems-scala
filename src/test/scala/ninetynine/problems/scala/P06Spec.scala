package ninetynine.problems.scala

import org.scalatest.{FunSuite, Matchers}

class P06Spec extends FunSuite with Matchers {
  val p06: P06[Int] = new P06Impl[Int]

  test("that returns true for empty list") {
    p06.isPalindrome(List()) should be(true)
  }

  test("that returns true for one-element list") {
    p06.isPalindrome(List(4)) should be(true)
  }

  test("that returns true for two-same-element list") {
    p06.isPalindrome(List(3, 3)) should be(true)
  }

  test("that returns false for two-different-element list") {
    p06.isPalindrome(List(3, 4)) should be(false)
  }

  test("that returns true for palindrome list") {
    p06.isPalindrome(List(1, 1, 3, 4, 7, 4, 3, 1, 1)) should be(true)
  }

  test("that returns false for non-palindrome list") {
    p06.isPalindrome(List(1, 3, 5, 2, 2)) should be(false)
  }
}
