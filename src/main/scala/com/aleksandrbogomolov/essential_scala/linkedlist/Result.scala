package com.aleksandrbogomolov.essential_scala.linkedlist

sealed trait Result[A]

case class Success[A](result: A) extends Result[A]

case class Failure[A](reason: String) extends Result[A]