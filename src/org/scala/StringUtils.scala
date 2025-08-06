object StringUtils {
  def sum(a: Int, b: Int) = a+b
}

class StringUtils(a: Int, b:Int){
  import StringUtils._
  def callSum: Int = sum(a,b)
}
object nametest extends App {
  val x = StringUtils.sum(1, 2)
  println(x)

  println("calling companion class")
  val y = new StringUtils(2,2)
  println(y.callSum)
}