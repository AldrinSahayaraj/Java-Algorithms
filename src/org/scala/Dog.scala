class Dog(name: String) extends Speaker with TailWagger with Runner{
  override def speak(): String = "whor whor"
}

class Cat(name: String) extends Speaker with TailWagger with Runner{
  override def speak(): String = "meow"

  override def startRunning(): Unit = println("I don't run")

  override def stopRunning(): Unit = println("No need to stop")
}


