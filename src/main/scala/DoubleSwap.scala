import scala.io.StdIn.readLine

object DoubleSwap extends App {

  def doubleSwap(str: String, p1: String, p2:String): Unit={
    var newStr = ""
    for(chr <- str){
      if(chr.toString == p1) newStr += p2
      else if(chr.toString == p2) newStr += p1
      else newStr += chr
    }
    println(newStr)
  }

  println("Type a string")
  val istr = readLine()
  println(("Type charachters to swap separated by space"))
  var achr = readLine().split(" ")
  doubleSwap(istr.toString,achr(0).toString,achr(1).toString)
}
