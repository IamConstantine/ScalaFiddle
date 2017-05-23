package fiddle

case class Precision(precision: Double)

class DoubleWrapper(val x: Double) {
  def ~=(that: Double)(implicit p: Precision): Boolean = (this.x - that).abs <= p.precision
}
