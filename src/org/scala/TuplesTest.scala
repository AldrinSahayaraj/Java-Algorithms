object TuplesTest extends App{
  val x = ("Aldrin", 29, "Ragavi", 29, "Rian", 3)
  println(x(0))
  println(x(1))
  println(x(2))
  val (fatherName, fatherAge, mothername, motherAge, child1name, child1Age) = x
  println(child1Age)
  println(child1name)



}
