package cases

import scala.util.Random


object CaseDemo01 extends App {

  val arr = Array("1", "2", "3")
  val name = arr(Random.nextInt(arr.length))
  println(name)
  name match {
    case "3" => println("3")
    case "2" => println("2")
    case _ => println("1")
  }

}
