package ninetynine.problems.scala

trait P06[T] {
  def isPalindrome(list: List[T]): Boolean
}

class P06Impl[T] extends P06[T] {
  final override def isPalindrome(list: List[T]): Boolean = list match {
    /**
      * Empty list is palindrome
      */
    case Nil => true
    case _ :: Nil => true

    /**
      * Two-element list is palindrome only when two element is same
      */
    case _ :: _ if list.length == 2 => list.head == list.last

    /**
      * First and last element of palindrome list should be equal.
      */
    case _ :: _ => if (list.head == list.last) isPalindrome(list.slice(1, list.length - 1)) else false
  }
}
