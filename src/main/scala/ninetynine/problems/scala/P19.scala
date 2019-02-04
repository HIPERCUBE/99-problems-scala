package ninetynine.problems.scala

import scala.annotation.tailrec

trait P19[T] {
  def rotate(n: Int, list: List[T]): List[T]
}

class P19TakeDrop[T] extends P19[T] {
  final override def rotate(n: Int, list: List[T]): List[T] = list.drop(n) ++ list.take(n)
}

class P19RecursiveImpl[T] extends P19[T] {
  @tailrec
  final override def rotate(n: Int, list: List[T]): List[T] = list match {
    case e :: tail if n > 0 => rotate(n - 1, tail :+ e)
    case _ => list
  }
}
