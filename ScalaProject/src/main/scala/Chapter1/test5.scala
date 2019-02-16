package Chapter1

object test5 extends App {

  //构造分数以及各种运算操作
  class Rational(n: Int, d: Int) {
    require(d != 0)
    private val g = gcd(n.abs, d.abs)
    val numer: Int = n / g
    val denom: Int = d / g

    def this(n: Int) = this(n, 1) // auxiliary constructor

    //方法重载
    def +(i: Int): Rational =
      new Rational(numer + denom * i, denom)

    def +(that: Rational): Rational =
      new Rational(
        numer * that.denom + that.numer * denom,
        denom * that.denom
      )

    def -(i: Int): Rational =
      new Rational(numer - i * denom, denom)

    def -(that: Rational): Rational =
      new Rational(
        numer * that.denom - that.numer * denom,
        denom * that.denom
      )

    def *(i: Int): Rational =
      new Rational(i * numer, denom)

    def *(that: Rational): Rational =
      new Rational(
        numer * that.numer,
        denom * that.denom
      )

    def /(i: Int): Rational =
      new Rational(numer, denom * i)

    def /(that: Rational): Rational =
      new Rational(
        numer * that.denom,
        denom * that.numer
      )

    //重写toString方法
    override def toString =
      if (denom == 1) numer + "" else numer + "/" + denom

    //找最大公约数,便于后期化简
    private def gcd(a: Int, b: Int): Int =
      if (b == 0) a else gcd(b, a % b)
  }

  //2*x<=>2.*(x),Int类并没有接收Rational类的乘法方法,因为Rational并不是scala里面的标准类
  //隐式转换,可以执行2*x操作了
  //不能定义在Rational类里面,需要定义在作用域里面,否则无效
  implicit def intToRational(x: Int) = new Rational(x)

  val x = new Rational(2, 1)
  val y = new Rational(3, 9)
  println(x + y)
  println(x - y)
  println(x * y)
  println(x / y)
  println(x / 2)
  println(2 * x)
}
