package com.aleksandrbogomolov.essential_scala.linkedlist

sealed trait LinkedList[A] {
  def length: Int = this match {
    case Empty() => 0
    case Pair(_, tl) => 1 + tl.length
  }

  def contains(item: A): Boolean = this match {
    case Empty() => false
    case Pair(head, tail) => if (head == item) true else tail.contains(item)
  }

  def apply(index: Int): Result[A] = this match {
    case Empty() => Failure("Index out of bounds")
    case Pair(head, tail) => if (0 == index) Success(head) else tail(index - 1)
  }

  def fold[B](end: B, f: (A, B) => B): B = this match {
    case Empty() => end
    case Pair(hd, tl) => f(hd, tl.fold(end, f))
  }
}

final case class Empty[A]() extends LinkedList[A]

final case class Pair[A](head: A, tail: LinkedList[A]) extends LinkedList[A]
