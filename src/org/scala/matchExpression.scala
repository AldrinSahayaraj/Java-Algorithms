object matchExpression extends App{
//  val i =3
//   i match {
//    case 1 => println("One")
//    case 2 => println("Two")
//    case 3 => println("Three")
//    case check => println(s"Default: $check")
//  }

  println(anymatch(1.0F))
    def anymatch (i: Matchable): String = i match {
      case in: Int => " Got Integer"
      case s: String => "Got String"
      case f: Float => "Got Float"
      case n => "Unknown: $n"
    }
}
