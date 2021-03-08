package hackerrank.functional

object LongitudLista extends App {
  val l = List(2, 5, 1, 4, 3, 7, 8, 6, 0, 9)

  def f(arr: List[Int]): Int = if (arr.isEmpty) 0 else 1 + f(arr.tail)

  println(f(l))
}
