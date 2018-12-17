package com.aleksandrbogomolov.essential_scala.visitor

object Main extends App {

  def older(v1: Visitor, v2: Visitor): Boolean = v1.createdAt.before(v2.createdAt)

  val anonymous = Anonymous("1")

  val user = User("2", "test@gmail.com")

  println(older(anonymous, user))
}
