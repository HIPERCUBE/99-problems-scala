package ninetynine.problems.scala._0_list

trait P09[T] {
  def pack(list: List[T]): List[List[T]]
}

class P09Impl[T] extends P09[T] {
  override def pack(list: List[T]): List[List[T]] = {
    def packInner(acc: List[T], lt: List[T]): List[List[T]] = lt match {
      case e :: tail if acc.isEmpty => packInner(List(e), tail)
      case e :: tail if acc.head == e => packInner(e :: acc, tail)
      case e :: tail => acc :: packInner(List(e), tail)
      case Nil => List(acc)
    }

    packInner(List(), list)
  }
}
