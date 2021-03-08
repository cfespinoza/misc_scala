package hackerrank.problem_solving.evaluation_ex

object Solution {
  def factorial(x: Int): Int = if (x == 0) 1 else x * factorial(x - 1)

  def potenciaN(n: Double, potencia: Int): Double =
    if (potencia == 0)
      1.0
    else
      n * potenciaN(n, potencia - 1)

  def serie(n: Double, iterations: Int): Double =
    if (iterations == 0)
      1
    else
      potenciaN(n, iterations) / factorial(iterations) + serie(n, iterations - 1)

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val n = stdin.readLine.trim.toInt

    for (nItr <- 1 to n) {
      val x = stdin.readLine.trim.toDouble
      println(serie(x, 9))
    }
  }
}