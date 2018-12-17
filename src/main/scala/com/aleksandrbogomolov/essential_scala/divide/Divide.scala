package com.aleksandrbogomolov.essential_scala.divide

object Divide {

  def apply(first: Int, second: Int): DivisionResult = second match {
    case 0 => Infinite
    case _ => Finite(first / second)
  }

  def main(args: Array[String]): Unit = {
    println(Divide(1, 2))
    println(Divide(1, 0))
  }
}
