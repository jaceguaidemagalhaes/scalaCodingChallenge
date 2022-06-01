import scala.io.StdIn.readLine

object ReorderDigitsArray extends App{
  println("Type integers separated by spaces")
  val adigits = readLine().split(" ").map(_.trim)
  val areorderAsc = new Array[String](adigits.length)
  val areorderDesc = new Array[String](adigits.length)
  for(i <- 0 to adigits.length-1){
    areorderAsc(i) = adigits(i).split("").sorted.mkString
    areorderDesc(i) = adigits(i).split("").sorted.reverse.mkString
  }
  println("Asc")
  print("[")
  areorderAsc.foreach(x => print(s"$x "))
  println("]")
  println("Desc")
  print("[")
  areorderDesc.foreach(x => print(s"$x "))
  print("]")

}
