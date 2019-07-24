package com.aleksandrbogomolov.essential_scala.tree

import org.scalatest.{FlatSpec, Matchers}

class TreeTest extends FlatSpec with Matchers {

  val example = Node(Node(Leaf(1), Leaf(2)), Node(Leaf(3), Leaf(4)))

  val tree: Tree[String] =
    Node(Node(Leaf("To"), Leaf("iterate")),
      Node(Node(Leaf("is"), Leaf("human,")),
        Node(Leaf("to"), Node(Leaf("recurse"), Leaf("divine")))))

    "A functions sum" should "return 10" in {
      val sum: Int = example.fold[Int]((a, b) => a + b, s => s)
      assert(sum == 10)
    }

    "A functions sum" should "return 7" in {
      val sum: Int = example.right.fold[Int]((a, b) => a + b, s => s)
      assert(sum == 7)
    }

//  "A functions double" should "return Node(Node(Leaf(2), Leaf(4)), Node(Leaf(6), Leaf(8)))" in {
//    assert(example.double == Node(Node(Leaf(2), Leaf(4)), Node(Leaf(6), Leaf(8))))
//  }

  //  "A functions double" should "return Node(Leaf(6), Leaf(8))" in {
  //    assert(example.right.double == Node(Leaf(6), Leaf(8)))
  //  }

  "A result" should "equal something" in {
    val result: String = tree.fold[String]((a, b) => a + " " + b, str => str)
    assert(result == "To iterate is human, to recurse divine")
  }
}
