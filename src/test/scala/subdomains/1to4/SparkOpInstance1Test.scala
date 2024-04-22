import org.scalatest.funsuite.AnyFunSuite
import subdomains1to4.SparkOpInstance1

class SparkOpInstance1Test extends AnyFunSuite {
  test("SparkOpInstance1: name should be SparkOpInstance1") {
    assert(SparkOpInstance1.name == "SparkOpInstance1")
  }

  // Additional tests for inputs, query, metadata, and runConfigurations can be added here
}
