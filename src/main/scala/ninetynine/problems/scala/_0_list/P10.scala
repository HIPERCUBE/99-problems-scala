package ninetynine.problems.scala._0_list

trait P10[T] {
  def encode(list: List[T]): List[(Int, T)]
}

class P10Impl[T] extends P10[T] {
  override def encode(list: List[T]): List[(Int, T)] = {
    new P09Impl[T].pack(list).map(lt => (lt.size, lt.head))
  }
}
