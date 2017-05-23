class OrderedTraitFiddle(val someVal: Int) extends Ordered[OrderedTraitFiddle] {
  override def compare(that: OrderedTraitFiddle): Int = {
    someVal - that.someVal
  }
}

object OrderedTraitFiddle {
  def apply(someVal: Int) = new OrderedTraitFiddle(someVal)
}

implicit def intToOrderedTraitFiddle(x: Int): OrderedTraitFiddle = new OrderedTraitFiddle(x)

1 < OrderedTraitFiddle(2)
1 > OrderedTraitFiddle(2)


