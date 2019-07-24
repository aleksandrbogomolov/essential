package com.aleksandrbogomolov.essential_scala

import org.scalatest.{FlatSpec, Matchers}

class TimestampTest extends FlatSpec with Matchers {

  "A call object of class as function" should "return correct result" in {
    assert(Timestamp(1, 1, 1).seconds == 3661)
  }
}
