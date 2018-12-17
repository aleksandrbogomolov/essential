package com.aleksandrbogomolov.essential_scala.shape

case class Square(size: Int, color: Color) extends Rectangular {

  override def width: Int = size

  override def height: Int = size
}
