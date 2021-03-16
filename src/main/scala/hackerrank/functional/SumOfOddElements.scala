package hackerrank.functional

object SumOfOddElements extends App {
  val l = List(3, 2, 4, 6, 5, 7, 8, 0, 1)

  def f(arr: List[Int]): Int =
    arr.filter(_ % 2 != 0).sum

  def fRecursivo(arr: List[Int]): Int =
    if (arr.isEmpty)
      0
    else if (arr.head % 2 != 0)
      arr.head + fRecursivo(arr.tail)
    else
      fRecursivo(arr.tail)

  println(s"f: ${f(l)}")
  println(s"fRecursivo: ${fRecursivo(l)}")
}
