package ninetynine.problems.scala

trait P07 {
  def flatten(list: List[Any]): List[Any]
}

class P07Impl extends P07 {
  final override def flatten(list: List[Any]): List[Any] = list match {
    case Nil => Nil
    case head :: tail if head.isInstanceOf[List[_]] => flatten(head.asInstanceOf[List[_]]) ++ flatten(tail)
    case head :: tail => head :: flatten(tail)
  }
}
