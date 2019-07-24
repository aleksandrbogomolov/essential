package com.aleksandrbogomolov.essential_scala.pair

import org.scalatest.{FlatSpec, Matchers}

class PairTest extends FlatSpec with Matchers {

  val pair: Pair[String, Int] = Pair("hi", 2)

  "A pair one" should "equal \"hi\"" in {
    assert(pair.one == "hi")
  }

  "A pair two" should "equal 2" in {
    assert(pair.two == 2)
  }
}
