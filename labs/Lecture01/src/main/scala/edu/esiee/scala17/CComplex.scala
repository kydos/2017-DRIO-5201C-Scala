package edu.esiee.scala17

object CComplex {
  def apply(re: Double, im: Double) = new CComplex(re, im)
}

class CComplex(val re: Double, val im: Double) {

  def + (other: CComplex): CComplex =
    CComplex(re + other.re, im + other.im)

  def - (other: CComplex) = CComplex(re - other.re, im - other.im)

  def unary_- : CComplex = CComplex(-re, -im)

  override def toString = s"$re+i$im"
}
