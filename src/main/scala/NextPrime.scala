import scala.io.StdIn.readLine
import util.control.Breaks.{breakable, break}
object NextPrime extends App {
  var num = readLine().trim.toInt
  if(num <= 2){
    println(s"Prime number = 2")
  }else{
    checkPrime(num, true)
  }

  def checkPrime(pnum: Int, pprime: Boolean): Unit ={
    var prime = pprime
    if(pnum%2 == 0)checkPrime(pnum+1,true)
    else{
      breakable{
        for(i <- 3 to pnum/2 by 2){
          if(pnum%i == 0){
            prime = false
            break()
          }
        }
      }
      if(prime && num != pnum && pnum%2 != 0){
        println(s"Next prime number after $num = $pnum")
      }else if(prime && pnum%2 != 0){
        println(s"$num is a prime number")
      }else{
        checkPrime(pnum+1,true)
      }
    }
  }//end checkPrime
}
