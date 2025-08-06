import Array._

object ArraysTest extends App {
  val arr: Array[String] = Array("Santho", "Ginger")
  println(s"arr: ${arr.foreach(println)}")
  val builder = new StringBuilder()

  val x = arr.addString(builder)
  println(s"add String using String builder: ${x}")

  println(s"Get index of Santho : ${arr.indexOf("Santho")}")
  println(s" Array length : ${arr.length}")
  println(s" Array Size : ${arr.size}")
  println(s" Array Empty : ${arr.isEmpty}")
  println(s" Replace 2nd element ")
  arr(1) = "Bubbly" // it implicitly calls update method
  println(s"arr: ${arr.foreach(println)}")

  var a : Array[String] = new Array[String](2)
  println(s"new Array initalized Size ${a.size}")
  a(0) = "Aldrin"
  a(1) = "Ragavi"
//  a(2) = "Rian" throw array index out of bound exception
  println("Array inserted with 2 values")
  a.foreach(println)
  println(s"Get 1st element : ${a(0)}") // it implicitly calls apply method
// appending 1 item
  println("Array b - Appending 1 Item")
val b = a :+ "Rian"
  b.foreach(println)
// appending N items
  println("Array C - Appending multiple elements")
  val c = b ++ Array("Poulin", "Arun bosco")
  for (elem <- c) {println(elem)}
// Prepending 1 item
  println("Array D - Prepending 1 item")
  val d = "Arun SV" +: c
  for(elem <- d) { println(elem)}
// Prepending multiple items
  println("Array E - Prepending multiple item")
  val e = Array("Velmurugan", "Selvarani") ++: d
  e.foreach(println)
// Concat arrays
  println("Array F - Concat 2 arrays")
  val f = concat(arr, e)
  f.foreach(println)
  println(s"Contains Check Aldrin :${f.contains("Aldrin")}")
  println(s"Insert duplicate")
  val g = f :+ "Aldrin"
  g.foreach(println)
  println(s"--- Get distinct" )
  val h = f.distinct
  h.foreach(println)
  println("Array reverse")
  val i = h.reverse
  for (elem <- i) {print(s"$elem , ")}
  println("Take n elements")
  val j = i.take(3)
  for(elem <- j) {print(s"$elem , ")}
  println("To string")
  println(s"mkString method ${h.mkString(", ")}")
}
