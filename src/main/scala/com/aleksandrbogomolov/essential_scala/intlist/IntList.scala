package com.aleksandrbogomolov.essential_scala.intlist

sealed trait IntList {
  def fold[A](accum: A, f: (Int, A) => A): A = this match {
    case End => accum
    case Pair(hd, tl) => f(hd, tl.fold(accum, f))
  }

  def length: Int = fold(0, (_, tl) => 1 + tl)

  def product: Int = fold(1, (hd, tl) => hd * tl)

  def sum: Int = fold(0, (hd, tl) => hd + tl)

  def double: IntList = fold[IntList](End, (hd, tl) => Pair(hd * 2, tl))
}

case object End extends IntList

case class Pair(head: Int, tail: IntList) extends IntList
