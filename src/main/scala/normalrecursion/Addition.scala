package normalrecursion

class Addition {

   def add(n:Int): Int = {
    {
      if (n>=21) 0
      else n+add(n+1)
    }
  }

}