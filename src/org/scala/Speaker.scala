trait Speaker {
  def speak(): String
}
trait TailWagger {
  def startTail():Unit = println("Tail is wagging")
  def stopTail():Unit = println("Tail is stopped")
}
trait Runner{
  def startRunning():Unit = println("Iam Running")
  def stopRunning():Unit = println("Stopped running")
}
