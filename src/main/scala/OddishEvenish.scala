import scala.io.StdIn.readLine

object OddishEvenish extends App{
  val str = readLine().trim
  if(str.sum%2 == 1)println("Oddish")
  else println("Evenish")
}
