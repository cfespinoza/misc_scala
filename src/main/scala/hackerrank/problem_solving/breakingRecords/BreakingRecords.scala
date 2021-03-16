package hackerrank.problem_solving.breakingRecords

object BreakingRecords extends App {

  val arr1 = Array(3, 4, 21, 36, 10, 28, 35, 5, 24, 42)
  val arr2 = Array(10, 5, 20, 20, 4, 5, 2, 25, 1)

  val seq = Seq(1, 2, 3, 4, 5)
  seq.tail

  def breakingRecords(scores: Array[Int]): Array[Int] = {
    var min = scores.head
    var max = scores.head
    var breakingMax = 0
    var breakingMin = 0
    for (p <- scores.tail) {
      if (p < min) {
        breakingMin += 1
        min = p
      }
      if (p > max) {
        breakingMax += 1
        max = p
      }
    }
    Array(breakingMax, breakingMin)
  }

  def breakingRecordsRec(arr: Array[Int]): Array[Int] = {

    def f(a: Array[Int], num: Int, isMax: Boolean): Int =
      if (a.isEmpty)
        0
      else if (isMax) {
        if (arr.head > num)
          1 + f(a = a.tail, num = a.head, isMax = isMax)
        else
          f(a = a.tail, num = num, isMax = isMax)
      }
      else {
        if (a.head < num)
          1 + f(a = a.tail, num = a.head, isMax = isMax)
        else
          f(a = a.tail, num = num, isMax = isMax)
      }

    (f(a = arr.tail, num = arr.head, isMax = true) :: f(a = arr.tail, num = arr.head, isMax = false)  :: Nil).toArray
  }

  println(s"arr1: ${breakingRecords(arr1).toList}")
  println(s"arr2: ${breakingRecords(arr2).toList}")
  println("#"*20)
  println(s"arr1: ${breakingRecordsRec(arr1).toList}")
  println(s"arr2: ${breakingRecordsRec(arr2).toList}")

}
