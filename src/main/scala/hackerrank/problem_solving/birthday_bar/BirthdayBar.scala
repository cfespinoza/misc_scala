package hackerrank.problem_solving.birthday_bar

object BirthdayBar extends App {
  // Complete the birthday function below.
  def birthday(s: Array[Int], d: Int, m: Int): Int = {
    if (s.isEmpty)
      0
    else if (m == 0)
      0
    else if (s.length < m)
      0
    else if (s.slice(0, m).sum == d)
      1 + birthday(s.tail, d, m)
    else
      birthday(s.tail, d, m)
  }

  val l = Array(1, 2, 1, 3, 2)
  val m = 2
  val d = 3

  println(s"${birthday(l, d, m)}")
}