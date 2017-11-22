package edu.esiee.scala17

object Complex {
  def apply(re: Double, im: Double) = new Complex(re, im)
}

class Complex(val re: Double, val im: Double) {
  override def toString = s"$re+i$im"
}
