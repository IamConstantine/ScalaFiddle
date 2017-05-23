package fiddle

import org.scalatest.{FlatSpec, Matchers}

class StringFiddleTest extends FlatSpec with Matchers {

  val stringFiddle = new StringFiddle("It is one thing to praise discipline and another to submit to it")

  it should "return longest Word in sentence" in {
    assert(stringFiddle.longestWord == "discipline")
  }
  it should "return most common word" in {
    assert(stringFiddle.mostCommonWord == "to")
  }
  it should "return most common letter" in {
    assert(stringFiddle.mostCommonLetter == 'i')
  }
  it should "return map of letter and word" in {
    val mapOfLetterAndWord = stringFiddle.mapOfLetterAndWord
    assert(mapOfLetterAndWord.size == 17)
    assert(mapOfLetterAndWord('e').size == 4)
    assert(mapOfLetterAndWord('e').contains("praise"))
  }
}
