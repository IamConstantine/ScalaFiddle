package fiddle

import org.scalatest.{FunSuite, Matchers}

class StringFiddleSuite extends FunSuite with Matchers {

  val stringFiddle = StringFiddle("It is one thing to praise discipline and another to submit to it")

  test("longest Word in sentence") {
    assert(stringFiddle.longestWord == "discipline")
  }
  test("most common word") {
    assert(stringFiddle.mostCommonWord == "to")
  }
  test("most common letter") {
    assert(stringFiddle.mostCommonLetter == 'i')
  }
  test("map of letter and word") {
    val mapOfLetterAndWord = stringFiddle.mapOfLetterAndWord
    assert(mapOfLetterAndWord.size == 17)
    assert(mapOfLetterAndWord('e').size == 4)
    assert(mapOfLetterAndWord('e').contains("praise"))
  }
  test("list of characters from list of strings common letter") {
    val list = stringFiddle.str.toLowerCase.split(" ").toList
    val charList = StringFiddle.charListFrom(list)
    assert(charList.size == 17)
  }
}
