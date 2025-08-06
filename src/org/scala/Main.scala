object Test {
  def main(args: Array[String]): Unit = {
    println("Hello Aldrin Learn scala!")
    val javaObj:InteropTest = new InteropTest()
    javaObj.show();

    // Loops
//    val list = List(1,2,3)
//    println("Normal Loop")
//    list.foreach(println)
//    println("Loop with Guards")
//    for s <- list if s > 1 do println(s)
//    println("Loop with multiple guards")
//    for
//        i <- 1 to 3
//        j <- 'a' to 'c'
//        if i == 2
//        if j == 'b'
//    do println(s"i == $i, j == $j")
//
//    println("Loop with expressions -> For expressions")
//    println("Multiplying by 2 and get list")
//    val result = for i <- list yield i * 2
//    result.foreach(println)

  // Switch
  val i = 3

    println("Scala normal match")
    i match
      case 1 => println("One")
      case 2 => println("Two")
      case 3 => println("Three")
      case _ => println("Default")
  }
}