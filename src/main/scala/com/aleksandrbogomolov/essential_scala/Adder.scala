package com.aleksandrbogomolov.essential_scala

class Adder(amount: Int) {

  def apply(in: Int): Int = in + amount
}

object Adder extends App {

  val adder = new Adder(3)
  println(adder(2))
}
