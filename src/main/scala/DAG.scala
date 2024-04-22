import subdomains.utils.SubdomainOp
import subdomains.domain1to4.{SparkOpInstance2, SparkOpInstance3, SparkOpInstance4, SparkOpInstance5, SparkOpInstance6}

object DAG {
  val ops: Set[SubdomainOp] = Set(
    SparkOpInstance2(),
    SparkOpInstance3(),
    SparkOpInstance4(),
    SparkOpInstance5(),
    SparkOpInstance6()
    // Note: SparkOpInstance7 to SparkOpInstance20 need to be defined and imported if they exist
  )
}
