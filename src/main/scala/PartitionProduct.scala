import scala.io.StdIn.readLine

object PartitionProduct extends App {
  println("Type integers separated by spaces")
  val aints = readLine().split(" ").map(_.toDouble)

  val product = aints.product

  var canPartition = false

  aints.foreach(x => if(product/x == x)canPartition=true)
  print(canPartition)


}
