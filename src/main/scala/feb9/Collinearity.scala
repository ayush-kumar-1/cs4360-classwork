package feb9 

import scalation.analytics.Regression
import scalation.linalgebra.{VectoD, VectorD, MatriD, MatrixD}
import scalation.stat.StatVector.corr

object Collinearity extends App {


    val x = new MatrixD((4,3),  1, 1, 1, 
                                1, 2, 2,
                                1, 3, 3,
                                1, 4, 0)

    val y = VectorD(1.0, 3.0, 3.0, 4.0)

    println(s"x = $x")
    println(s"corr (x) = ${corr(x)}")

    val rg = new Regression(x, y)
    rg.train().eval()

    println(rg.report)
    println(rg.summary) 

    

} // Collinearity 
