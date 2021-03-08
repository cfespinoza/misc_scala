package hackerrank.functional

object SumaRecursiva extends App {
  val l = List(1, 2, 4, 5, 6, 7)
  val lSeq = Seq(1, 2, 4, 5, 6, 7)
  def f(l: List[Int]): Int = if (l.isEmpty) 0 else l.head + f(l.tail)
  def fSeq(l: Seq[Int]): Int = if (l.isEmpty) 0 else l.head + fSeq(l.tail)

  println(f(l))
  println(fSeq(l))
}
