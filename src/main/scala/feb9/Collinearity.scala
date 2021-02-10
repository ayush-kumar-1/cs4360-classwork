package feb9 

import scalation.analytics.Regression
import scalation.linalgebra.{VectoD, VectorD, MatriD, MatrixD}

object Collinearity extends App {


    val x = new MatrixD((4,3),  1, 1, 1, 
                                1, 2, 2,
                                1, 3, 3,
                                1, 4, -1)

    val y = VectorD(1.0, 3.0, 3.0, 4.0)

    println(s"x = $x")
    println(s"y = $y")

    

} // Collinearity 
