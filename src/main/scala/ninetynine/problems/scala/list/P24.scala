package ninetynine.problems.scala.list

trait P24 {
  def lotto(n: Int, range: Int): List[Int]
}

class P24Impl extends P24 {
  override def lotto(n: Int, range: Int): List[Int] = new P23RecursiveImpl[Int].randomSelect(n, 1 to range toList)
}
