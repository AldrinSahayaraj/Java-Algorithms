class ClassTest(var firstName : String, var lastname: String) {

  println("Class initialization")
  val fullName = firstName + lastname

  def getFullName():Unit = {
    println(fullName)
  }

  getFullName()
  println("Initialization ends")
}

object Maintest extends App {
  val person = new ClassTest("Aldrin", lastname= "Paul Sahayaraj")
  person.getFullName()
}
