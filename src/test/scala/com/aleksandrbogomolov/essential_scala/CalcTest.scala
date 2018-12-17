package com.aleksandrbogomolov.essential_scala

import org.scalatest.{FlatSpec, Matchers}

class CalcTest extends FlatSpec with Matchers {

  "A square function" should "return correct result" in {
    val calc = new Calc
    assert(calc.square(2.0) == 4.0)
    assert(calc.square(3.0) == 9.0)
    assert(calc.square(-2.0) == 4.0)
  }
}
