package fiddle

case class Precision(precision: Double)

class DoubleWrapper(val x: Double) {
  def ~=(that: Double)(implicit p: Precision): Boolean = (this.x - that).abs <= p.precision
}

object DoubleWrapperMain {

  implicit def doubleToDoubleWrapper(d: Double): DoubleWrapper = new DoubleWrapper(d)

  implicit val precision = Precision(0.001)

  def main(args: Array[String]): Unit = {
    if (0.0 ~= 0.00001)
      println("They Are equal")
  }
}