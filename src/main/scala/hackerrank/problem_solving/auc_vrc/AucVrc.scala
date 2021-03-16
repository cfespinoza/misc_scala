package hackerrank.problem_solving.auc_vrc


import scala.math.BigDecimal.double2bigDecimal

object AucVrc {

  def potenciaN(n: Double, potencia: Int): Double =
    if (potencia == 0)
      1.0
    else
      n * potenciaN(n, potencia - 1)

  // This function will be used while invoking "Summation" to compute
  // The area under the curve.

  def f(coefficients:List[Int],powers:List[Int],x:Double):Double =
    //Fill Up this function body
    // To compute the value of the function
    // For the given coefficients, powers and value of x
    if (coefficients.isEmpty && powers.isEmpty)
      0
    else
      coefficients.head * potenciaN(x, powers.head) + f(coefficients.tail, powers.tail, x)

  // This function will be used while invoking "Summation" to compute
  // The Volume of revolution of the curve around the X-Axis
  // The 'Area' referred to here is the area of the circle obtained
  // By rotating the point on the curve (x,f(x)) around the X-Axis
  def area(coefficients:List[Int],powers:List[Int],x:Double):Double =
    //Fill Up this function body
    // To compute the area of the circle on revolving the point
    // (x,f(x)) around the X-Axis
    // For the given coefficients, powers and value of x
    math.Pi * potenciaN(f(coefficients, powers, x), 2)

  // This is the part where the series is summed up
  // This function is invoked once with func = f to compute the area 	     // under the curve
  // Then it is invoked again with func = area to compute the volume
  // of revolution of the curve
  def summation(func: (List[Int], List[Int], Double) => Double, upperLimit: Int, lowerLimit: Int, coefficients: List[Int], powers: List[Int]): Double = {
    // Fill up this function
    val step = 0.001
    val subIntervals = lowerLimit.toDouble to upperLimit.toDouble by step
    subIntervals
      .foldLeft(0.0) { case (acc, x) => acc + func(coefficients, powers, x.toDouble) * step }
  }

  /*
  def f(coefficients:List[Int],powers:List[Int], x:Double):Double =
    coefficients.zip(powers)
    .foldLeft(0.0){case (acc,(c,p))=> acc + c * math.pow(x,p)}

  def area(coefficients:List[Int],powers:List[Int],x:Double):Double =
    math.Pi * math.pow(f(coefficients,powers,x),2)

   def summation(func:(List[Int],List[Int],Double)=>Double,
                 upperLimit:Int,
                 lowerLimit:Int,
                 coefficients:List[Int],
                 powers:List[Int]):Double =
   {
     val step = 0.001
     val subIntervals= lowerLimit.toDouble to upperLimit by step
     subIntervals
     .foldLeft(0.0){case (acc,x)=> acc + func(coefficients,powers,x)*step}

  }
   */

  // The Input-Output functions will be handled by us. You only need to concentrate your effort on the function bodies above.
}
