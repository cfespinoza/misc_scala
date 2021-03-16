package hackerrank.functional

object ReverseAList extends App {

  val l = List(19, 22, 3, 28, 26, 17, 18, 4, 28, 0)

  def f(arr: List[Int]): List[Int] =
    if (arr.isEmpty)
      Nil
    else
      f(arr.tail) ++ List(arr.head)

  println(s"l: ${l.mkString(",")}")
  println(s"f: ${f(l).mkString(",")}")
}
