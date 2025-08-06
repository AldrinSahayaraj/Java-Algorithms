object FirstClassFunctions extends App {
  val a = List(1,2,3).map(i => i*2)
  println(a)
  val b = List(1,2,3).map(_*2)
  println(b)

  println("use method instead of lambda")
  def double(i: Int) = i * 2
  val c = List(1, 2, 3).map(i => double(i))
  println(c)
  val d = List(1, 2, 3).map(double)
  println(d)

  val list = (1 to 10).toList
  val result = list.filter(_ > 3).filter(_ < 7).map( _ * 10)
  println(result)

}
