package ninetynine.problems.scala._0_list

trait P25[T] {
  val p23 = new P23RecursiveImpl[T]

  def randomPermute(list: List[T]): List[T]
}

class P25Impl[T] extends P25[T] {
  override def randomPermute(list: List[T]): List[T] = p23.randomSelect(list.size, list)
}