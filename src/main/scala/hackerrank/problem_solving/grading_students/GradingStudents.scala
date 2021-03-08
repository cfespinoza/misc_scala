package hackerrank.problem_solving.grading_students

object GradingStudents extends App {

  /*
   * Complete the 'gradingStudents' function below.
   *
   * The function is expected to return an INTEGER_ARRAY.
   * The function accepts INTEGER_ARRAY grades as parameter.
   */
  val grades = Array(73, 67, 38, 33)

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

  gradingStudents(grades).foreach(println)
}
