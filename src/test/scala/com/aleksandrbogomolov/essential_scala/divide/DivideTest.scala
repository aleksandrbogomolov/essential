package com.aleksandrbogomolov.essential_scala.divide

import org.scalatest.{FlatSpec, Matchers}

class DivideTest extends FlatSpec with Matchers {

  "A Divide" should "return Finite when no error" in {
    val result = Divide(1, 2)
    assert(Finite(0) == result)
  }

  "A Divide" should "return Infinite when divide by 0" in {
    val result = Divide(1, 0)
    assert(Infinite == result)
  }
}
