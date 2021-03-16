package hackerrank.problem_solving.kangaroo

object Kangaroo extends App {
  def kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String = {
    if ((x1 < x2 && v1 < v2) || (x1 > 10000 && x2 > 10000))
      "NO"
    else if (x1 + v1 == x2 + v2)
      "YES"
    else if (((x1 - x2).toDouble/(v2 - v1).toDouble) % 1 == 0)
//    else if ((x1 - x2)/(v2 - v1) > 0)
      "YES"
    else
      "NO"
  }
  println(s"${kangaroo(0, 3, 4, 2)}")
  println(s"${kangaroo(0, 2, 5, 3)}")
  println(s"${kangaroo(1113, 612, 1331, 610)}")
  println(s"${kangaroo(1571, 4240, 9023, 4234)}")
  println(s"${kangaroo(21, 6, 47, 3)}")
}
