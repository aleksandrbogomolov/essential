package com.aleksandrbogomolov.essential_scala.calculator

import org.scalatest.{FlatSpec, Matchers}

class ExpressionTest extends FlatSpec with Matchers {

  "A functions eval" should "return Failure(\"Square root of negative number\")" in {
    assert(Addition(SquareRoot(Number(-1.0)), Number(2.0)).eval == Failure("Square root of negative number"))
  }

  "A functions eval" should "return Success(4.0)" in {
    assert(Addition(SquareRoot(Number(4.0)), Number(2.0)).eval == Success(4.0))
  }

  "A functions eval" should "return Failure(\"Division by zero\")" in {
    assert(Division(Number(4), Number(0)).eval == Failure("Division by zero"))
  }
}
