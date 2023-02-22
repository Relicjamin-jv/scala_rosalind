import scala.collection.mutable
@main def main: Unit = {
}

object DNATools {
    def transcribe(input: String): String = for(i <- input) yield if i == 'T' then 'U' else i 
    def reverseComplement(input: String): String = {
        val complementMap: Map[Char, Char] = Map('A' -> 'T', 'T' -> 'A', 'C' -> 'G', 'G' -> 'C')
        val reversedString = input.reverse
        for (i <- reversedString) yield complementMap.getOrElse(i, i) // if i is in the map then return whats in it, otherwise, just return the value
    }
    def countNucleotides(input: String): Map[Char, Int] = {
        val countMap = scala.collection.mutable.Map[Char, Int]('A' -> 0, 'C' -> 0, 'G' -> 0, 'T' -> 0)
        for (i <- input) countMap(i) += 1
        countMap.toMap
    }
    def pointMutations(input_one: String, input_two: String): Int = {
        // strings are equal length so when one is length 0 the other one is as well
        if (input_one.length() == 0) return 0
        if input_one(0) == input_two(0) then pointMutations(input_one.substring(1), input_two.substring(1)) else pointMutations(input_one.substring(1), input_two.substring(1)) + 1
    }
    def findMotif(input_one: String, input_two: String): List[Int] = {
        val motifSize = input_two.length()
        if input_one.length() == 0 then return List()
        if input_two.length() == 0 then return List()
        (for (i <- 0 to input_one.length() - motifSize if input_one.substring(i, i + motifSize) == input_two) yield i+1).toList
    }
}