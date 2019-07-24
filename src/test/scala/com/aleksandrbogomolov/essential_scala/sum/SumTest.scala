package com.aleksandrbogomolov.essential_scala.sum

import org.scalatest.{FlatSpec, Matchers}

class SumTest extends FlatSpec with Matchers {

  "A left value" should "equal 1" in {
    assert(Left[Int, String](1).value == 1)
  }

  "A right value" should "equal \"foo\"" in {
    Right[Int, String]("foo").value
  }

  "A sum value" should "equal \"foo\"" in {
    val sum: Sum[Int, String] = Right("foo")
    val result = sum match {
      case Left(v) => v.toString
      case Right(v) => v
    }
    assert(result == "foo")
  }
}
