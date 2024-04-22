import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.BeforeAndAfterAll
import subdomains1to4.SparkOpInstance1
import org.apache.spark.sql.SparkSession

class SparkOpInstance1Test extends AnyFunSuite with BeforeAndAfterAll {
  val sparkSession: SparkSession = SparkSession.builder().appName("SubdomainOpsTest").master("local").getOrCreate()

  test("SparkOpInstance1: name should be SparkOpInstance1") {
    assert(SparkOpInstance1.name == "SparkOpInstance1")
  }

  test("SparkOpInstance1: inputs should be empty") {
    assert(SparkOpInstance1.inputs.isEmpty)
  }

  test("SparkOpInstance1: query should return empty DataFrame") {
    val inputs = Map.empty[String, org.apache.spark.sql.DataFrame]
    val result = SparkOpInstance1.query(inputs)
    assert(result.count() == 0)
  }

  test("SparkOpInstance1: metadata should not be null") {
    assert(SparkOpInstance1.metadata != null)
  }

  test("SparkOpInstance1: runConfigurations should not be null") {
    assert(SparkOpInstance1.runConfigurations != null)
  }

  // Ensure to stop the SparkSession after all tests have run
  override def afterAll(): Unit = {
    sparkSession.stop()
  }
}
