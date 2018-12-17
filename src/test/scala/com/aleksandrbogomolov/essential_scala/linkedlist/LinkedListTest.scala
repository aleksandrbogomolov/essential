package com.aleksandrbogomolov.essential_scala.linkedlist

import org.scalatest.{FlatSpec, Matchers}

class LinkedListTest extends FlatSpec with Matchers {

  val example = Pair(1, Pair(2, Pair(3, Empty())))

  "A example" should "have length == 3" in {
    assert(example.length == 3)
  }

  "A example" should "have length == 2" in {
    assert(example.tail.length == 2)
  }

  "A Empty" should "have length == 0" in {
    assert(Empty().length == 0)
  }

  "A example" should "return true" in {
    assert(example.contains(3))
  }

  "A example" should "return false" in {
    assert(!example.contains(4))
  }

  "A Empty" should "return false" in {
    assert(!Empty().contains(0))
  }

  "A example" should "return Success(1)" in {
    assert(example(0) == Success(1))
  }

  "A example" should "return Success(2)" in {
    assert(example(1) == Success(2))
  }

  "A example" should "return Success(3)" in {
    assert(example(2) == Success(3))
  }

  "A example" should "return Failure(\"Index out of bounds\")" in {
    assert(example(3) == Failure("Index out of bounds"))
  }
}
