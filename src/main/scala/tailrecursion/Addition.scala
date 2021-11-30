package tailrecursion

import scala.annotation.tailrec

object Addition extends  App {

  final def addition(initial:Int):Int={

    @tailrec
    def add2(initial:Int, last:Int, sum:Int): Int ={

      if(initial >last) sum

      else add2(initial+1,last,sum+initial)}
    add2(initial,15, 0)
    }
  println(addition(10))
  }

