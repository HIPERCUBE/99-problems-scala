package ninetynine.problems.scala.list

import scala.util.Random

trait P23[T] {
  protected val p20 = new P20SplitImpl[T]

  def randomSelect(count: Int, list: List[T]): List[T]
}

// This solution is not ideal as it can produce duplicates.
class P23Impl[T] extends P23[T] {
  final override def randomSelect(count: Int, list: List[T]): List[T] = {
    val picks = List.fill(count)(Random.nextInt(list.size))
    picks.map(pick => list(pick))
  }
}

class P23RecursiveImpl[T] extends P23[T] {
  final override def randomSelect(count: Int, list: List[T]): List[T] = list match {
    case _ if count >= 1 =>
      val removed = p20.removeAt(Random.nextInt(list.size), list)
      removed._2 :: randomSelect(count - 1, removed._1)
    case _ => Nil
  }
}
