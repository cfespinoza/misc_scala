package hackerrank.functional

object UpdateAbsList extends App{

  val l = List(2, -4, 3, -1, 23, -4, -54)

  def f(arr: List[Int]): List[Int] =
    if (arr.isEmpty)
      Nil
    else if (arr.head >= 0)
      arr.head :: f(arr.tail)
    else
      -arr.head :: f(arr.tail)

  f(l).foreach(println)
}
