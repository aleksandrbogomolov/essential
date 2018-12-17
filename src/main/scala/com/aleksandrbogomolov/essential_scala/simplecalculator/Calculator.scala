package com.aleksandrbogomolov.essential_scala.simplecalculator

object Calculator {

  def +(calculation: Calculation, operand: Int): Calculation = calculation match {
    case Success(result) => Success(result + operand)
    case Failure(reasone) => Failure(reasone)
  }

  def -(calculation: Calculation, operand: Int): Calculation = calculation match {
    case Success(result) => Success(result - operand)
    case Failure(reasone) => Failure(reasone)
  }

  def /(calculation: Calculation, operand: Int): Calculation = calculation match {
    case Failure(reasone) => Failure(reasone)
    case Success(result) => operand match {
      case 0 => Failure("Division by zero")
      case _ => Success(result / operand)
    }
  }
}
