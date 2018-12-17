package com.aleksandrbogomolov.essential_scala.simplecalculator

sealed trait Calculation

case class Success(result: Int) extends Calculation

case class Failure(reasone: String) extends Calculation
