package edu.esiee

import scala.annotation.tailrec

package object scala17 {
  @tailrec
  def gcd(t: (Int, Int)):Int = t match {
    case (a, 0) => a
    case (a, 1) => 1
    case (a, b) if a > b => gcd(b, a % b)
    case (a, b) if a < b => gcd(b, a)
  }
}
