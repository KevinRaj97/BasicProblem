package tailrecursion

import scala.annotation.tailrec

object Fibonacci extends App {

  final def fib(n:Int): Int =
  {
    @tailrec
    def fib1(n:Int, prev:Int, curr:Int, index:Int):Int={
      if(index==n) curr
      else fib1(n,curr,prev+curr,index+1)
    }
    fib1(n,prev=0, curr=1,index=1)

  }
  println(fib(6))

}
