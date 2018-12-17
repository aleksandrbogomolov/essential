package com.aleksandrbogomolov.essential_scala.tree

import org.scalatest.{FlatSpec, Matchers}

class TreeTest extends FlatSpec with Matchers {

  val example = Node(Node(Leaf(1), Leaf(2)), Node(Leaf(3), Leaf(4)))

  "A functions sum" should "return 10" in {
    assert(example.sum == 10)
  }

  "A functions sum" should "return 7" in {
    assert(example.right.sum == 7)
  }

  "A functions double" should "return Node(Node(Leaf(2), Leaf(4)), Node(Leaf(6), Leaf(8)))" in {
    assert(example.double == Node(Node(Leaf(2), Leaf(4)), Node(Leaf(6), Leaf(8))))
  }

  "A functions double" should "return Node(Leaf(6), Leaf(8))" in {
    assert(example.right.double == Node(Leaf(6), Leaf(8)))
  }
}
