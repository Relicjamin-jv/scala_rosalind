@main def main: Unit = {
    
}

object DNATools {
    def transcribe(input: String): String = for(i <- input) yield if i == 'T' then 'U' else i 
    def reverseComplement(input: String): String = {
        val complementMap: Map[Char, Char] = Map('A' -> 'T', 'T' -> 'A', 'C' -> 'G', 'G' -> 'C')
        val reversedString = input.reverse
        for (i <- reversedString) yield complementMap.getOrElse(i, i) // if i is in the map then return whats in it, otherwise, just return the value
    }
}