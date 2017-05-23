package fiddle

class StringFiddle(val str: String) {
  def longestWord = str.toLowerCase.split(" ").reduceLeft((a, b) => if (a.length > b.length) a else b)

  def mostCommonWord = str.toLowerCase.split(" ").groupBy(a => a).maxBy(_._2.length)._1

  def mostCommonLetter = str.toLowerCase.filter(Character.isAlphabetic(_)).toCharArray.groupBy(ch=>ch).maxBy(_._2.length)._1

  def mapOfLetterAndWord =
    str.toLowerCase.split(" ").flatMap(str=>str.filter(Character.isAlphabetic(_)).toCharArray.map((_, str))).distinct.groupBy(_._1).mapValues(_.map(_._2))
}
