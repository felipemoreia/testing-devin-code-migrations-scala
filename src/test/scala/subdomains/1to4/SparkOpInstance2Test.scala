import org.scalatest.funsuite.AnyFunSuite
import subdomains1to4.SparkOpInstance2
import org.scalatest.BeforeAndAfterAll
import org.apache.spark.sql.SparkSession

class SparkOpInstance2Test extends AnyFunSuite with BeforeAndAfterAll {
  val sparkSession: SparkSession = SparkSession.builder().appName("SubdomainOpsTest").master("local").getOrCreate()

  test("SparkOpInstance2: name should be dataset/spark-op-instance-2") {
    assert(SparkOpInstance2.name == "dataset/spark-op-instance-2")
  }

  test("SparkOpInstance2: inputs should be empty") {
    assert(SparkOpInstance2.inputs.isEmpty)
  }

  test("SparkOpInstance2: query should return empty DataFrame") {
    val inputs = Map.empty[String, org.apache.spark.sql.DataFrame]
    val result = SparkOpInstance2.query(inputs)
    assert(result.count() == 0)
  }

  test("SparkOpInstance2: metadata should not be null") {
    assert(SparkOpInstance2.metadata != null)
  }

  test("SparkOpInstance2: runConfigurations should not be null") {
    assert(SparkOpInstance2.runConfigurations != null)
  }

  // Ensure to stop the SparkSession after all tests have run
  override def afterAll(): Unit = {
    sparkSession.stop()
  }
}
