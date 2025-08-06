object ListsTest extends App {
  val a = List(1,2,3) // normal
  val b = (1 to 5).toList // using to
  val c = (1 to 10 by 2).toList // excludes multiples of list
  val d = (1 until 5)
  val e = List.range(1, 5)
  val f = List.range(1,10,3) // fetch only 3rd position value starting from 1

  val g = List(10,20,30,40,50)
  println(s"Actual List : $g")
  println("Dropping first 2 elements")
  println(g.drop(2))

  println("Drop while condition < 35")
  println(g.dropWhile(_<35))

  println("Filter condition > 35")
  println(g.filter(_>35))

  println("Slice/fetch first 2 elements")
  println(g.slice(0,2))

  println("Get Tail elements excluding first element")
  println(g.tail)

  println("Take first 2 elements")
  println(g.take(2))

  println("Take while < 35")
  println(g.takeWhile(_<35))

  println("Flatter list combination of 2 list")
  val h = List(List(1, 2), List(3, 4))
  println(h.flatten)

  println("Map to uppercase")
  val i = List("one", "two")
  println(i.map(_.toUpperCase()))

  println("Map to split lis of string to chars using flatmap")
  println(i.flatMap(_.toUpperCase()))

  println("Reduce left - to sum up all values from left")
  println(g.reduceLeft(_+_))

  println("Fold Left - sum up value in left parenthesis to right parenthesis result")
  println(g.foldLeft(200)(_+_))
}
