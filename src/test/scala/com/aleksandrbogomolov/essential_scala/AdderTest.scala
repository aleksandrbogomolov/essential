package com.aleksandrbogomolov.essential_scala

import org.scalatest.{FlatSpec, Matchers}

class AdderTest extends FlatSpec with Matchers {

  "A call object of class as function" should "return correct result" in {
    val adder = new Adder(3)
    assert(adder(2) == 5)
    assert(adder(3) == 6)
    assert(adder(-2) == 1)
  }
}
