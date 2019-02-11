package ninetynine.problems.scala._0_list

trait P13[T] {
  def encodeDirect(list: List[T]): List[(Int, T)]
}

class P13Impl[T] extends P13[T] {
  final override def encodeDirect(list: List[T]): List[(Int, T)] = {
    def encodeDirectR(acc: (Int, T), lt: List[T]): List[(Int, T)] = lt match {
      case e :: tail if acc._1 == 0 => encodeDirectR((1, e), tail)
      case e :: tail if acc._2 == e => encodeDirectR((acc._1 + 1, acc._2), tail)
      case e :: tail => acc :: encodeDirectR((1, e), tail)
      case Nil => List(acc)
    }

    encodeDirectR((1, list.head), list.tail)
  }
}
