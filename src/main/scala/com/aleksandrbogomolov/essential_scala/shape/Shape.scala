package com.aleksandrbogomolov.essential_scala.shape

sealed trait Shape {

  def sides: Int

  def perimeter: Double

  def area: Double

  def color: Color
}

trait Rectangular extends Shape {

  def width: Int

  def height: Int

  override def sides: Int = 4

  override def perimeter: Double = 2 * width + 2 * height

  override def area: Double = width * height
}

case class Circle(radius: Int, color: Color) extends Shape {

  override def sides: Int = 1

  override def perimeter: Double = 2 * math.Pi * radius

  override def area: Double = math.Pi * radius * radius
}
