package tailrecursion

object MaximumElement extends App {
  val x = List(1777, 255, 3, 4, 8888)

  var maxx: Int = x(0);

  for (i <- 1 to (x.length - 1)) {
    if (x(i) > maxx) maxx = x(i)
  }

  println("Max is " + maxx);
}
