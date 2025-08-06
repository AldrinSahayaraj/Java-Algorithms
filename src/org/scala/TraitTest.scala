object TraitTest extends App {
  val dog = new Dog("bubbly")
  println(dog.speak())

  val cat = new Cat("bubbly cat")
  println(cat.speak())
  cat.startRunning()
  cat.stopRunning()
}
