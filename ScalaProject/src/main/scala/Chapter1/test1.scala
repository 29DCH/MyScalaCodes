package Chapter1
object test1 extends App {
  //map关联映射
  var capital = Map("US" -> "Washington","France" -> "Paris")
  capital += ("China" -> "Beijing")
  println(capital("China"))
}
