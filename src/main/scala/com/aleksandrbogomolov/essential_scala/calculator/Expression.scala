package com.aleksandrbogomolov.essential_scala.calculator

sealed trait Expression {

  def eval: Calculation = this match {
    case Number(value) => Success(value)
    case Addition(left, right) => left.eval match {
      case Success(l) => right.eval match {
        case Success(r) => Success(l + r)
        case Failure(reasone) => Failure(reasone)
      }
      case Failure(reasone) => Failure(reasone)
    }
    case Subtraction(left, right) => left.eval match {
      case Success(l) => right.eval match {
        case Success(r) => Success(l - r)
        case Failure(reasone) => Failure(reasone)
      }
      case Failure(reasone) => Failure(reasone)
    }
    case Division(left, right) => left.eval match {
      case Success(l) => right.eval match {
        case Success(r) => if (r == 0) Failure("Division by zero") else Success(l / r)
        case Failure(reasone) => Failure(reasone)
      }
      case Failure(reasone) => Failure(reasone)
    }
    case SquareRoot(value) => value.eval match {
      case Success(result) => if (result >= 0.0) Success(math.sqrt(result)) else Failure("Square root of negative number")
      case Failure(reasone) => Failure(reasone)
    }
  }
}

case class Addition(left: Expression, right: Expression) extends Expression

case class Subtraction(left: Expression, right: Expression) extends Expression

case class Division(left: Expression, right: Expression) extends Expression

case class SquareRoot(value: Expression) extends Expression

case class Number(value: Double) extends Expression
