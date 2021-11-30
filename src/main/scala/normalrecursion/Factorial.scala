package normalrecursion

// n* fact(n-1) Methodology

class Factorial {

  def fact(n:Int): Int =
  {
    if (n==1) 1
    else n*fact(n-1)
  }

}
