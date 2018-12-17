package com.aleksandrbogomolov.essential_scala.tree

sealed trait Tree {

  def sum: Int = {
    def calculate(tree: Tree, total: Int): Int = tree match {
      case Leaf(element) => total + element
      case Node(left, right) => calculate(left, total) + calculate(right, total)
    }
    calculate(this, 0)
  }

  def double: Tree = {
    def calculate(tree: Tree): Tree = tree match {
      case Leaf(element) => Leaf(element * 2)
      case Node(left, right) => Node(calculate(left), calculate(right))
    }
    calculate(this)
  }
}

case class Node(left: Tree, right: Tree) extends Tree

case class Leaf(element: Int) extends Tree
