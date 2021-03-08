package hackerrank.functional

object FiltroRecursivo extends App {
  val l = List(25, -41, 46, -28, 21, 52, 83, -29, 84, 27, 40)

  def f(delim: Int, arr: List[Int]): List[Int] =
    if (arr.isEmpty)
      List.empty
    else if (arr.head >= delim)
      f(delim, arr.tail)
    else
      List(arr.head) ++ f(delim, arr.tail)

  f(25, l).foreach(println)
}
