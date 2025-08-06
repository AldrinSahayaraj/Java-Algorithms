object types extends App {
  // default types
  val intval = 10l // to change it to long add l
  System.out.println(s"Default type for numbers ${intval.isInstanceOf[Int]}")
  val doubleval = 10.9 // to change it to float add f
  System.out.println(s"Default decimal value ${doubleval.isInstanceOf[Double]}")

  val boolval = false
  System.out.println(s"Default type of boolean ${boolval.isInstanceOf[Boolean]}")

  // Higher level data types
  val numericList = List(1,2,3)
  numericList.foreach(println)
  println("For Loop")
  for(s <- numericList) println(s)
  println("Scala 3 for loop")
  for s <- numericList if s > 1 do println(s)
  System.out.println(s"Numeric list type: ${numericList.isInstanceOf[List[Int]]}")

  val anyValList = List(1, 10.9, 20.9f, 109l )
  anyValList.foreach(println)
  System.out.println(s"Any val list type: ${anyValList.isInstanceOf[List[AnyVal]]}")

  val anyref = List("String", List(1,2,3))
  anyref.foreach(println)
  System.out.println(s"Any ref list type: ${anyref.isInstanceOf[List[AnyRef]]}")

  val anytypeList = List(1,10l,10.9, 10.9f, "String", List(1,2,3))
  anytypeList.foreach(println)
  System.out.println(s"Top type Any list: ${anytypeList.isInstanceOf[Any]}")

}
