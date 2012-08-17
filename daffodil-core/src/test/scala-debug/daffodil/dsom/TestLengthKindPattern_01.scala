package daffodil.section12.lengthKind

import junit.framework.Assert._
import org.scalatest.junit.JUnit3Suite
import scala.xml._
import daffodil.xml.XMLUtils
import daffodil.xml.XMLUtils._
import daffodil.compiler.Compiler
import daffodil.util._
import daffodil.tdml.DFDLTestSuite
import java.io.File

class TestLengthKindPattern_01 extends JUnit3Suite {
  val testDir = "test-suite/tresys-contributed/"
  val aa = testDir + "PatternTests_01.tdml"
  val runner = new DFDLTestSuite(new File(aa))

  /* DFDL-253 */
  def test_LengthPatternIllegalBits() { runner.runOneTest("LengthPatternIllegalBits") }

  /* DFDL-254 */
  def test_lengthKindPatternSimpleType() { runner.runOneTest("lengthKindPatternSimpleType") }

}