object Typecasting extends App {
  val x : Byte = 1
  println(s"Byte val $x")
  val y: Short = x
  println(s"Byte to Short : $y")
  val z: Int = y
  println(s"Short to Int: $z")
  val a: Long = z
  println(s"Int to Long: $a")
  val b: Float = a
  println(s"Long to Float : $b")

//  val y = 123456578L
//  println(s"Long value: $y")
//  val z: Float = y.toFloat
//  println(z)
}
