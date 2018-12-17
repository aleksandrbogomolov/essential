package com.aleksandrbogomolov.essential_scala.intlist

import scala.annotation.tailrec

object MainIntList {

  @tailrec
  def sum(list: IntList, total: Int = 0): Int = list match {
    case End => total
    case Pair(head, tail) => sum(tail, total + head)
  }
}
