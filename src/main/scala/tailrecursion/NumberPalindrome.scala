package tailrecursion

import scala.annotation.tailrec

object NumberPalindrome extends App{

  def pal(n:Int):Boolean={

    @tailrec
    def com(n:Int, org:Int, rev:Int):Boolean={

      if(n==0){
        if(org==rev) true
        else false
      }
      else {
        com(n/10,org,rev*10+(n%10))
      }
    }
    com(n,n,0)
  }
  println(pal(1211))

}
