package edu.esiee.scala17

class Rational(a: Int, b: Int) {
  assert(b != 0)
  val num: Int = a / gcd(a, b)
  val den: Int = b / gcd(a, b)

  def this(n: Int) = this(n, 1)
}
