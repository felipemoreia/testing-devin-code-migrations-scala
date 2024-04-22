import org.scalatest.funsuite.AnyFunSuite
import legacy.SparkOpInstance10

class SparkOpInstance10Test extends AnyFunSuite {
  test("SparkOpInstance10: name should be dataset/spark-op-instance-10") {
    assert(SparkOpInstance10.name == "dataset/spark-op-instance-10")
  }

  // Additional tests for inputs, query, metadata, and runConfigurations can be added here
}
