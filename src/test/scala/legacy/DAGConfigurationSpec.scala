import munit.FunSuite
import subdomains.utils._
import subdomains.domain1to4.{SparkOpInstance2, SparkOpInstance3, SparkOpInstance4, SparkOpInstance5, SparkOpInstance6}

class DAGConfigurationSpec extends FunSuite {
  val ops = Seq(SparkOpInstance2, SparkOpInstance3, SparkOpInstance4, SparkOpInstance5, SparkOpInstance6)

  test("DAG should have no cycles") {
    val visited = scala.collection.mutable.Set[String]()
    val recStack = scala.collection.mutable.Set[String]()

    def isCyclic(op: SubdomainOp): Boolean = {
      println(s"Checking for cycles at: ${op.name}")
      if (recStack.contains(op.name)) return true
      if (visited.contains(op.name)) return false

      visited.add(op.name)
      recStack.add(op.name)

      val result = op.inputs.exists { input =>
        ops.exists(_.name == input.name) && isCyclic(ops.find(_.name == input.name).get)
      }
      recStack.remove(op.name)
      result
    }

    val hasCycles = ops.exists(isCyclic)
    assert(!hasCycles, "The DAG contains cycles")
  }

  test("SubdomainOp inputs must exist in the DAG") {
    val opNames = ops.map(_.name).toSet
    val inputsExist = ops.forall(op => op.inputs.forall(input => opNames.contains(input.name)))

    assert(inputsExist, "All SubdomainOp inputs must exist in the DAG")
  }
}
