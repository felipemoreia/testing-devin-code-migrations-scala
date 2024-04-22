import org.scalatest.funsuite.AnyFunSuite
import legacy.SparkOpInstance8

class SparkOpInstance8Test extends AnyFunSuite {
  test("SparkOpInstance8: name should be dataset/spark-op-instance-8") {
    assert(SparkOpInstance8.name == "dataset/spark-op-instance-8")
  }

  // Additional tests for inputs, query, metadata, and runConfigurations can be added here
}
