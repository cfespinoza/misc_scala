package hackerrank.functional

object ArrayNElements extends App{
  def f(num:Int) : List[Int] = if (num > 0) num::f(num-1) else Nil

  f(5).foreach(println)
}
