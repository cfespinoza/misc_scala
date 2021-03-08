package hackerrank.functional

object FilterPositionInAList extends App {
  val l = List(2, 5, 3, 4, 6, 7, 9, 8)
  val l2 = List(19, 28, 27, 3, 27, 26, 24, 25, 11, 15, 23, 11, 20, 24, 15)


  def f(arr: List[Int]): List[Int] = {
    def oddCondition(size: Int):Boolean = size % 2 != 0
    def evenCondition(size: Int):Boolean = size % 2 == 0
    def auxF(auxArr: List[Int], c: Int => Boolean):List[Int] =
      if (auxArr.isEmpty)
        Nil
      else if (c(auxArr.size))
        List(auxArr.head) ::: auxF(auxArr.tail, c)
      else
        auxF(auxArr.tail, c)

    if (evenCondition(arr.size))
      auxF(arr, oddCondition)
    else
      auxF(arr, evenCondition)
  }
  f(l).foreach(println)
  println("#"*10)
  f(l2).foreach(println)
}
