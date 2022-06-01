import scala.io.StdIn.readLine

object IsValidHexCode extends App {

  val hexCode = readLine().trim
  if(hexCode.matches("#[0-9a-fA-F]{6}")){
    println(s"$hexCode is a valid Hexadecimal Code.")
  }else{
    println(s"$hexCode is not a valid Hexadecimal Code.")
    println(s"Valid hex code is a # followed by 6 hexadecimal digits.")
  }

}
