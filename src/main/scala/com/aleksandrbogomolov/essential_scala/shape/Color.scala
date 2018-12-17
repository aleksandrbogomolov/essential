package com.aleksandrbogomolov.essential_scala.shape

sealed trait Color {

  def r: Double
  def g: Double
  def b: Double
  def isLight: Boolean = (r + g + b) / 3.0 > 0.5
  def isDark: Boolean = !isLight
}

case object Red extends Color {

  def r: Double = 1.0
  def g: Double = 0.0
  def b: Double = 0.0
}

case object Yellow extends Color {

  def r: Double = 1.0
  def g: Double = 1.0
  def b: Double = 0.0
}

case object Pink extends Color {

  def r: Double = 1.0
  def g: Double = 0.0
  def b: Double = 1.0
}

case class CustomColor(r: Double, g: Double, b: Double) extends Color
