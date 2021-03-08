package hackerrank.problem_solving.grading_students

import java.io._
import scala.io._

object Result {

  /*
   * Complete the 'gradingStudents' function below.
   *
   * The function is expected to return an INTEGER_ARRAY.
   * The function accepts INTEGER_ARRAY grades as parameter.
   */

  def gradingStudents(grades: Array[Int]): Array[Int] = {
    // Write your code here
    val lowerLimit = 38
    val multiplier = 5
    val max_difference = 3
    grades.map {
      case grade if (grade < lowerLimit) => grade
      case grade if multiplier - (grade % multiplier) >= max_difference => grade
      case grade if multiplier - (grade % multiplier) < max_difference => grade + (multiplier - (grade % multiplier))
    }
  }

}

object Solution {
  def main(args: Array[String]) {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val gradesCount = StdIn.readLine.trim.toInt

    val grades = Array.ofDim[Int](gradesCount)

    for (i <- 0 until gradesCount) {
      val gradesItem = StdIn.readLine.trim.toInt
      grades(i) = gradesItem
    }

    val result = Result.gradingStudents(grades)

    printWriter.println(result.mkString("\n"))

    printWriter.close()
  }
}
