package hackerrank.problem_solving.divisible_sum_pairs

object DivisibleSumPairs extends App {

  val seq = Array(1, 3, 2, 6, 1, 2)

  // Complete the divisibleSumPairs function below.
  def divisibleSumPairsAux(n: Int, k: Int, ar: Array[Int]): Int = {
    val pairs = ar.map(x => ar.map(y => (x, y))).flatMap(_.filter(x => x._1 != x._2))
    pairs.count { case (x, y) => (x + y) % k == 0 }
  }

  def divisibleSumPairs(n: Int, k: Int, ar: Array[Int]): Int =
    if (ar.isEmpty)
      0
    else
      ar.tail.count(x => (ar.head + x) % k == 0) + divisibleSumPairs(n, k, ar.tail)

  println(s"total de multiplos: ${divisibleSumPairs(seq.length, 3, seq)}")


}
