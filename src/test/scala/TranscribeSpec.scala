import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TranscribeSpec extends AnyFlatSpec with Matchers {

  "transcribe" should "handle the empty string" in {
    DNATools.transcribe("") should equal ("")
  }
  
  it should "transcribe T" in {
    DNATools.transcribe("T") should equal ("U")
  }
  
  it should "transcribe single-character strings" in {
    DNATools.transcribe("A") should equal ("A")
    DNATools.transcribe("C") should equal ("C")
    DNATools.transcribe("G") should equal ("G")
  }

  it should "transcribe several strings" in {
    DNATools.transcribe("ACGTACGT") should equal ("ACGUACGU")
    DNATools.transcribe("GCGAGATCTCAAAAGCCGCCG") should equal ("GCGAGAUCUCAAAAGCCGCCG")
  }
}
