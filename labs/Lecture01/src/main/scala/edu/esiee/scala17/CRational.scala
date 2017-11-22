package edu.esiee.scala17

object CRational {
  def inverse(i: Int): CRational = {
    assert(i != 0)
    new CRational(1, i)
  }
}
class CRational(a: Int, b: Int) {
  assert(b != 0)
  val num: Int = a / gcd(a, b)
  val den: Int = b / gcd(a, b)

  def this(n: Int) = this(n, 1)

  override def toString: String = s"$num/$den"
}
