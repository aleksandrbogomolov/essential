package com.aleksandrbogomolov.essential_scala.traffic

object TrafficMain {

  def main(args: Array[String]): Unit = {
    val red = Red
    println(red.next)

    val redP = RedP
    println(redP.next)
  }
}
