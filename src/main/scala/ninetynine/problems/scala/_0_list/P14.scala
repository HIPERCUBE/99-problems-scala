package ninetynine.problems.scala._0_list

trait P14[T] {
  def duplicate(list: List[T]): List[T]

  def duplicateR(list: List[T]): List[T]
}

class P14Impl[T] extends P14[T] {
  final override def duplicate(list: List[T]): List[T] = list.flatMap(e => e :: e :: Nil)

  final override def duplicateR(list: List[T]): List[T] = list match {
    case e :: tail => e :: e :: duplicateR(tail)
    case Nil => Nil
  }
}
