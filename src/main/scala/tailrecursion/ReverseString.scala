package tailrecursion

import scala.annotation.tailrec

object ReverseString extends App{

   final def rev(reverse:String): String= {

  @tailrec
  def com(reverse:String, n:Int, out:String):String={
  if(n<0) out
  else com(reverse,n-1,out+reverse.charAt(n))
  }
    com(reverse,reverse.length-1,out="")
  }
  println(rev("kevin"))
  }
