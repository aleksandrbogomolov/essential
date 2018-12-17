package com.aleksandrbogomolov.essential_scala.intlist

import org.scalatest.{FlatSpec, Matchers}

class IntListTest extends FlatSpec with Matchers {

  val example = Pair(1, Pair(2, Pair(3, End)))

  "A functions sum" should "return 6" in {
    assert(example.sum == 6)
  }

  "A functions sum" should "return 5" in {
    assert(example.tail.sum == 5)
  }

  "A functions sum" should "return 0" in {
    assert(End.sum == 0)
  }

  "A functions length" should "return 3" in {
    assert(example.length == 3)
  }

  "A functions length" should "return 2" in {
    assert(example.tail.length == 2)
  }

  "A functions length" should "return 0" in {
    assert(End.length == 0)
  }

  "A functions product" should "return 6" in {
    assert(example.product == 6)
  }

  "A functions product" should "return 6 for tail" in {
    assert(example.tail.product == 6)
  }

  "A functions product" should "return 1" in {
    assert(End.product == 1)
  }

  "A functions double" should "return Pair(2, Pair(4, Pair(6, End)))" in {
    assert(example.double == Pair(2, Pair(4, Pair(6, End))))
  }

  "A functions double" should "return Pair(4, Pair(6, End))" in {
    assert(example.tail.double == Pair(4, Pair(6, End)))
  }

  "A functions double" should "return End" in {
    assert(End.double == End)
  }
}
