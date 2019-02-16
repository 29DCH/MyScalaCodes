package Chapter1

//大数阶乘(递归)
object test2 extends App {
  def factorial(x:BigInt):BigInt =
    if(x == 0 ) 1 else x*factorial(x-1)
  println(factorial(100))
}