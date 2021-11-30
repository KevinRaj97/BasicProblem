package tailrecursion

import scala.annotation.tailrec
import scala.io.StdIn

object Palindrome extends App{

  @tailrec
  def palindrome(k: String): String = {

    if (k.length<=1)
      "Its Palindrome"
    else if (k.charAt(0).toLower!=k.charAt(k.length-1).toLower)
      "Its not  palindrome"
    else
  palindrome(k.substring(1,k.length-1))
  }
var s = StdIn.readLine()
  println(palindrome(s))
}
