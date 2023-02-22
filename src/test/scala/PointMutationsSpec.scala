 import org.scalatest.flatspec.AnyFlatSpec
 import org.scalatest.matchers.should.Matchers

 class PointMutationsSpec extends AnyFlatSpec with Matchers {

   "pointMutations" should "handle the empty string" in {
     DNATools.pointMutations("", "") should be (0)
   }
  
   it should "handle single-character strings" in {
     DNATools.pointMutations("A", "T") should be (1)
     DNATools.pointMutations("T", "A") should be (1)
     DNATools.pointMutations("T", "T") should be (0)
   }
  
   it should "handle strings differing at one point" in {
     DNATools.pointMutations("CAT", "AAT") should be (1)
     DNATools.pointMutations("CAT", "CGT") should be (1)
     DNATools.pointMutations("CAT", "CAA") should be (1)
     DNATools.pointMutations("AGGCTTAAGGCTCTCTTAGGCGATT", "AGGCTGAAGGCTCTCTTAGGCGATT") should be (1)
   }
  
   it should "handle strings with multiple mutations" in {
     DNATools.pointMutations("CAT", "GGG") should be (3)
     DNATools.pointMutations("CAT", "CGG") should be (2)
     DNATools.pointMutations("CAT", "AAA") should be (2)
     DNATools.pointMutations("AGGCTTAAGGCTCTCTTAGGCGATT", "CCGCTGAAGGCTCTCTTAGGCGACC") should be (5)
     DNATools.pointMutations("CAT", "TAC") should be (2)
   }

 
 }
