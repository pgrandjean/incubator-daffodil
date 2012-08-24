package daffodil.section17.calc_value_properties

import java.io.File
import org.scalatest.junit.JUnit3Suite
import junit.framework.Assert._
import daffodil.xml.XMLUtils
import daffodil.xml.XMLUtils._
import scala.xml._
import daffodil.compiler.Compiler
import daffodil.tdml.DFDLTestSuite
import daffodil.util.LogLevel
import daffodil.util.LoggingDefaults
import daffodil.util.Misc

class TestInputValueCalc extends JUnit3Suite {
  val testDir = "/daffodil/section17/calc_value_properties/"
  val ar = testDir + "AR.tdml"
  lazy val runnerAR = new DFDLTestSuite(Misc.getRequiredResource(ar))

  def test_AR000() { runnerAR.runOneTest("AR000") }
  
  val aq = testDir + "AQ.tdml"
  lazy val runnerAQ = new DFDLTestSuite(Misc.getRequiredResource(aq))

  def test_AQ000() { runnerAQ.runOneTest("AQ000") }
  
  val aa = testDir + "AA.tdml"

  lazy val runnerAA = { new DFDLTestSuite(Misc.getRequiredResource(aa)) }
  
  def test_AA000() { runnerAA.runOneTest("AA000") }
  def test_inputValueCalcErrorDiagnostic1() { runnerAA.runOneTest("inputValueCalcErrorDiagnostic1")}
  def test_inputValueCalcErrorDiagnostic2() { runnerAA.runOneTest("inputValueCalcErrorDiagnostic2")}
}