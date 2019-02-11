package ninetynine.problems.scala.list

trait P15[T] {
  def duplicateN(n: Int, list: List[T]): List[T]

  def duplicateNR(n: Int, list: List[T]): List[T]
}

class P15Impl[T] extends P15[T] {
  final override def duplicateN(n: Int, list: List[T]): List[T] = list.flatMap(e => List.fill(n)(e))

  final override def duplicateNR(n: Int, list: List[T]): List[T] = list match {
    case e :: tail => List.fill(n)(e) ++ duplicateNR(n, tail)
    case Nil => Nil
  }
}
