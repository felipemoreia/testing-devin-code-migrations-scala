import org.scalatest.funsuite.AnyFunSuite
import subdomains.domain1to4.SparkOpInstance4

class SparkOpInstance4Test extends AnyFunSuite {
  test("SparkOpInstance4: name should be dataset/spark-op-instance-4") {
    assert(SparkOpInstance4.name == "dataset/spark-op-instance-4")
  }

  // Additional tests for inputs, query, metadata, and runConfigurations can be added here
}
