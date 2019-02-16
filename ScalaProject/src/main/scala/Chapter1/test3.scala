package Chapter1

//体会函数式编程
object test3 extends App{
  def max(x:Int,y:Int):Int = if (x>y) x else y
  print(max(1,2))
}
