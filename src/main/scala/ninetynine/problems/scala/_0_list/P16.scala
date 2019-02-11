package ninetynine.problems.scala._0_list

trait P16[T] {
  def drop(interval: Int, list: List[T]): List[T]

  def dropR(interval: Int, list: List[T]): List[T]
}

class P16Impl[T] extends P16[T] {
  final override def drop(interval: Int, list: List[T]): List[T] = {
    list.zipWithIndex.withFilter(p => (p._2 + 1) % interval != 0).map(_._1)
  }

  final override def dropR(interval: Int, list: List[T]): List[T] = {
    def drop(n: Int, index: Int, lt: List[T]): List[T] = lt match {
      case _ :: tail if n == index => drop(n, 1, tail)
      case e :: tail => e :: drop(n, index + 1, tail)
      case Nil => Nil
    }

    drop(interval, 1, list)
  }
}
