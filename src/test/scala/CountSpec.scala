 import org.scalatest.flatspec.AnyFlatSpec
 import org.scalatest.matchers.should.Matchers

 class CountSpec extends AnyFlatSpec with Matchers {

   "countNucleotides" should "count single occurrences" in {
     DNATools.countNucleotides("ACGT") should equal (Map('A' -> 1, 'C' -> 1, 'G' -> 1, 'T' -> 1))
   }
  
   it should "account for nucleotides that are not present" in {
     DNATools.countNucleotides("AG") should equal (Map('A' -> 1, 'C' -> 0, 'G' -> 1, 'T' -> 0))
   }
  
   it should "handle the empty string" in {
     DNATools.countNucleotides("") should equal (Map('A' -> 0, 'C' -> 0, 'G' -> 0, 'T' -> 0))
   }
  
   it should "count multiple occurrences" in {
     DNATools.countNucleotides("ACGTTAAGTGTCTCATG") should equal (Map('A' -> 4, 'C' -> 3, 'G' -> 4, 'T' -> 6))
   }
  
   it should "count multiple occurrences in long strings" in {
     DNATools.countNucleotides("ACGTTAACGTGTCTCATGAATGCCTTGTAGCTGCGAGGTATCGGGGTCTTCTAGCGAGGCTGAGGTCGATGATGCTGCTAGTACGTGCTGATGAGCTGCTCGTCGTAGTCGTACGTCGGCGCGCGGCGCGATCTGATGCTAGCTAGTGGGGCGTCTTAGCGAGTTTATATTATTATTCTCGAGTCTAGTCTGACTATTGCGTATCTATGC") should equal (Map('A' -> 36, 'C' -> 44, 'G' -> 65, 'T' -> 65))
   }
  
 }
