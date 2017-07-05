def sumInts(list: List[Int]): Int = list.foldRight(0)(_ + _)

def concatStrings(list: List[String]): String = list.foldRight("")(_ ++ _)

def unionSets[A](list: List[Set[A]]): Set[A] = list.foldRight(Set.empty[A])(_ union _)

sumInts((1 to 10).toList)
concatStrings(List("a", "aab", "ac"))
unionSets(List(Set(1, 2), Set(2, 3)))


//Monoid to the rescue

trait Monoid[A] {
  def empty: A

  def combine(a: A, b: A): A
}

val intAddition: Monoid[Int] = new Monoid[Int]{
  override def empty: Int = 0

  override def combine(a: Int, b: Int): Int = a + b
}

val stringConcatenation: Monoid[String] = new Monoid[String]{
  override def empty: String = ""

  override def combine(a: String, b: String): String = a ++ b
}

case class SetMonoid[A]() extends Monoid[Set[A]]{
  override def empty: Set[A] = Set.empty[A]

  override def combine(a: Set[A], b: Set[A]): Set[A] = a union b
}

def combineAll[A](list: List[A], A: Monoid[A]): A  = list.foldRight(A.empty)(A.combine)

combineAll((1 to 10).toList, intAddition)