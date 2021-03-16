package hackerrank.problem_solving.migratory_birds

object MigratoryBirds extends App {

  def migratoryBirdsAux(arr: Array[Int]): Int = {
    val m = arr.map(x => x -> arr.count(y => x == y)).toMap
    m.filter(_._2 == m.values.max).keys.min
  }

  def migratoryBirds(arr: Array[Int]): Int = {
    var m = Map.empty[Int, Int]
    for (i <- arr) {
      if (m.contains(i)) {
        val k = m(i) + 1
        m = m + (i -> k)
      } else
        m = m + (i -> 1)
    }
    m.filter(_._2 == m.values.max).keys.min
  }
}
