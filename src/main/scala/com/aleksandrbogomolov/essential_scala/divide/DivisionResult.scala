package com.aleksandrbogomolov.essential_scala.divide

sealed trait DivisionResult

case class Finite(value: Int) extends DivisionResult

case object Infinite extends DivisionResult
