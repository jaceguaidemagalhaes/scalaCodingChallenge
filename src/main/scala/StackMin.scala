import scala.io.StdIn.readLine
import scala.collection.mutable.ArrayBuffer
object StackMin extends App{

  //insert a list of values to create a stack to test
  println("Insert a list with values separated by space:")
  val listInserted = readLine().trim.split(" ").map(_.toInt)
  var min = listInserted(0)
  var arrayStack = new ArrayBuffer[List[Int]]
  for (elem <- listInserted) {
    if(elem < min){ min = elem}
    arrayStack.prepend(List(elem,min))
  }

  //test min, push and pop
  var option = ""
  var exit = false
  while(!exit){
    println("Select option to test")
    println("m => min")
    println("p => push")
    println("o => pop")
    println("e => exit")
    val option = readLine().trim.toLowerCase()
    option match {
      case "p" => {
        println("Give the number to insert")
        val num = readLine().toInt
        push(num)
        printArray()
      }
      case "o" => {
        if(arrayStack.isEmpty) println("Stack is empty")
        else println("First element = " + pop().toString)
        printArray()
      }
      case "m" => {
        if(arrayStack.isEmpty) println("Stack is empty")
        else println("Min = " + minStack())
        printArray()
      }
      case "e" => {
        exit = true
        println("Thank you!!!")
      }
      case _ => println("Wrong option.")
    }
  }



  def minStack(): Int={
    if(arrayStack.isEmpty) return 0
    else return arrayStack.head(1)
  }

  def push(a: Int): Unit ={
    min = minStack()
    if(a < min){ min = a}
    StackMin.arrayStack.prepend(List(a,min))
  }

  def pop(): Int={
    val result = StackMin.arrayStack.head(0)
    StackMin.arrayStack.remove(0)
    return result
  }

  def printArray(): Unit={
  print("Stack: (")
    for(elem <- arrayStack){
      print(elem(0)+ " ")
    }
    println(")")
  }


}
