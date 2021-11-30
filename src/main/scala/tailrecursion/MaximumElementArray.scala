package tailrecursion

import scala.annotation.tailrec

object MaximumElementArray extends App{

  def max(input:Array[Int]):Int={

    @tailrec
    def com(input:Array[Int], len:Int, large:Int):Int={

if(len == input.length) large
else com(input,len+1,Math.max(large,input(len)))
    }
    com(input,1,input(0))
  }
println(max(Array(66,2,3,4,5,25,55)))
}
