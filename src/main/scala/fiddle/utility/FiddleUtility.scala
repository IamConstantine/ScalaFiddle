package fiddle.utility

object FiddleUtility {

  def coalesce[T](value1: Option[T], value2: Option[T], valueN: Option[T]*) = (Seq(value1, value2) ++ valueN).find(_.isDefined).getOrElse(Option(None))
}
