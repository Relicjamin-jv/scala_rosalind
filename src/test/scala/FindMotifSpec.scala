// import org.scalatest.flatspec.AnyFlatSpec
// import org.scalatest.matchers.should.Matchers

// class FindMotifSpec extends AnyFlatSpec with Matchers {

//   "findMotif" should "handle an empty haystack" in {
//     DNATools.findMotif("", "") should equal (Nil)
//     DNATools.findMotif("", "AAT") should equal (Nil)
//   }
  
//   it should "find no occurrences of an empty motif" in {
//     DNATools.findMotif("ATGC", "") should equal (Nil)
//     DNATools.findMotif("A", "") should equal (Nil)
//   }
  
//   it should "handle single-character strings" in {
//     DNATools.findMotif("A", "T") should equal (Nil)
//     DNATools.findMotif("T", "A") should equal (Nil)
//     DNATools.findMotif("T", "T") should equal (List(1))
//   }
  
//   it should "handle haystacks shorter than the motif" in {
//     DNATools.findMotif("A", "TTTTTT") should equal (Nil)
//     DNATools.findMotif("TAGCCGGCAT", "TAGCCGGCATA") should equal (Nil)
//   }
  
//   it should "handle motifs that do not occur" in {
//     DNATools.findMotif("CATTTAGTTTAAC", "AAT") should equal (Nil)
//     DNATools.findMotif("CAT", "CGT") should equal (Nil)
//     DNATools.findMotif("AGGCTTAAGGCTCTCTTAGGCGATT", "AGGCTGAAGGCTCTCTTAGGCGATT") should equal (Nil)
//     DNATools.findMotif("AGC", "TGC") should equal (Nil)
//     DNATools.findMotif("AGC", "AGT") should equal (Nil)
//   }
  
//   it should "handle motifs that occur exactly once" in {
//     DNATools.findMotif("AACCGGT", "T") should equal (List(7))
//     DNATools.findMotif("AACCGG", "AC") should equal (List(2))
//     DNATools.findMotif("ACGCGCGA", "CGA") should equal (List(6))
//     DNATools.findMotif("CCCTCCCTCCCCTC", "CCCC") should equal (List(9))
//   }

//   it should "handle motifs that occur more than once" in {
//     var res = DNATools.findMotif("AACCGGT", "A")
//     res.toSet should equal (Set(1, 2))
//     res.size should be (2)
    
//     res = DNATools.findMotif("ACTGGACGCTACTA", "ACT")
//     res.toSet should equal (Set(1, 11))
//     res.size should be (2)

//     res = DNATools.findMotif("ACTAGGACGCTAGTAATAGC", "TAG")
//     res.toSet should equal (Set(3, 11, 17))
//     res.size should be (3)
//   }

//   it should "handle motifs that occur in overlapping parts of the haystack" in {
//     var res = DNATools.findMotif("AACAACAACAA", "AACAA")
//     res.toSet should equal (Set(1, 4, 7))
//     res.size should be (3)
    
//     res = DNATools.findMotif("GGCAGGCAGGCAGGCA", "GCAGG")
//     res.toSet should equal (Set(2, 6, 10))
//     res.size should be (3)
//   }
  
// }
