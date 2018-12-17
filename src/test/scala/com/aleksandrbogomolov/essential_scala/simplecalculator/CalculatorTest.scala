package com.aleksandrbogomolov.essential_scala.simplecalculator

import org.scalatest.{FlatSpec, Matchers}

class CalculatorTest extends FlatSpec with Matchers {

  "A functions +" should "return Success" in {
    assert(Calculator.+(Success(1), 1) == Success(2))
  }

  "A functions -" should "return Success" in {
    assert(Calculator.-(Success(1), 1) == Success(0))
  }

  "A functions +" should "return Failure" in {
    assert(Calculator.+(Failure("Badness"), 1) == Failure("Badness"))
  }

  "A functions /" should "return Success" in {
    assert(Calculator./(Success(4), 2) == Success(2))
  }

  "A functions /" should "return Failure(\"Division by zero\")" in {
    assert(Calculator./(Success(4), 0) == Failure("Division by zero"))
  }

  "A functions /" should "return Failure" in {
    assert(Calculator./(Failure("Badness"), 1) == Failure("Badness"))
  }
}
