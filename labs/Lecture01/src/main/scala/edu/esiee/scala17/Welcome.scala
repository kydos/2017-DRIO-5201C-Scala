package edu.esiee.scala17

object Welcome {
  def main(args: Array[String]): Unit = {
    val name = if (args.length > 0) args(0) else "student"
    println(s"Dear $name, welcome to the Scala class!")
  }
}
