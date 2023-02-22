import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ReverseComplementSpec extends AnyFlatSpec with Matchers {

  "reverseComplement" should "handle the empty string" in {
    DNATools.reverseComplement("") should equal ("")
  }
  
  it should "complement single-character strings" in {
    DNATools.reverseComplement("T") should equal ("A")
    DNATools.reverseComplement("A") should equal ("T")
    DNATools.reverseComplement("G") should equal ("C")
    DNATools.reverseComplement("C") should equal ("G")
  }
  
  it should "complement multi-character strings" in {
    DNATools.reverseComplement("CAT") should equal ("ATG")
    DNATools.reverseComplement("GGGGGGAAAAAAAAAATCGA") should equal ("TCGATTTTTTTTTTCCCCCC")
    DNATools.reverseComplement("TTTTT") should equal ("AAAAA")
  }
}
