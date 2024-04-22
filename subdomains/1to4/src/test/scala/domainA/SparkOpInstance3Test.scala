import org.scalatest.funsuite.AnyFunSuite
import subdomains.domainA.SparkOpInstance3

class SparkOpInstance3Test extends AnyFunSuite {
  test("SparkOpInstance3: name should be SparkOpInstance3") {
    assert(SparkOpInstance3.name == "SparkOpInstance3")
  }

  // Additional tests for inputs, query, metadata, and runConfigurations can be added here
}
