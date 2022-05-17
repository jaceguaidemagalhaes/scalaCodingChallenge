import scala.io.StdIn.readLine

object SumLinkedList {

  //This object gets two linked lists, reverse their values,
  //sum the value of the lists as an integer, and return a list with the digits of the result

  def main(args: Array[String]): Unit={
    //Read the first linked list
    println("Enter first list (Each integer separated by space):")
    val list1: List[Int] = readLine().split(" ").map(_.toInt).toList

    //Read the second linked list
    println("Enter second list (Each integer separated by space):")
    val list2: List[Int] = readLine().split(" ").map(_.toInt).toList

    //Reverse the lists and create integers
    val numRev1 = list1.reverse.mkString.toInt
    val numRev2 = list2.reverse.mkString.toInt

    //Sum the numbers and creat a list with the digits
    val sum = (numRev1+numRev2).toString.split("").toList

    //Print the result as a list
    print(s"Result = $sum")
  }

}
