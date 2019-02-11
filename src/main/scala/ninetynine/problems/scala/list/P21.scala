package ninetynine.problems.scala.list

import scala.annotation.tailrec

trait P21[T] {
  def insertAt(value: T, pos: Int, list: List[T]): List[T]

  final protected def ensurePosValid(pos: Int, list: List[T]) = pos match {
    case _ if pos < 0 || pos > list.size => throw new IllegalArgumentException("pos is not valid")
    case _ =>
  }
}

class P21Impl[T] extends P21[T] {
  final override def insertAt(value: T, pos: Int, list: List[T]): List[T] = {
    ensurePosValid(pos, list)

    val (front, end) = list.splitAt(pos)
    (front :+ value) ++ end
  }
}

class P21InbuiltImpl[T] extends P21[T] {
  final override def insertAt(value: T, pos: Int, list: List[T]): List[T] = {
    ensurePosValid(pos, list)

    val buffer = list.toBuffer
    buffer.insert(pos, value)
    buffer.toList
  }
}

class P21RecursiveImpl[T] extends P21[T] {
  final override def insertAt(value: T, pos: Int, list: List[T]): List[T] = {
    ensurePosValid(pos, list)

    @tailrec
    def insertAtR(remaining: List[T], complete: List[T], cur: Int): List[T] = remaining match {
      case _ if cur == pos => (complete :+ value) ++ remaining
      case e :: tail if cur < pos => insertAtR(tail, complete :+ e, cur + 1)
      case _ if cur > pos => throw new IllegalArgumentException("cur can not be greater than pos")
      case Nil => Nil
    }

    insertAtR(list, List(), 0)
  }
}
