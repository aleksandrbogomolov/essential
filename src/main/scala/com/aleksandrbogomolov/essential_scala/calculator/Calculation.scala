package com.aleksandrbogomolov.essential_scala.calculator

sealed trait Calculation

case class Success(result: Double) extends Calculation

case class Failure(reasone: String) extends Calculation
