package com.aleksandrbogomolov.essential_scala.shape

object Draw {

  def apply(shape: Shape): Unit = {
    val result = shape match {
      case Circle(radius, color) => s"A ${Draw(color)} Circle with radius = $radius"
      case Rectangle(width, height, color) => s"A ${Draw(color)} Rectangle with width = $width, height = $height"
      case Square(size, color) => s"A ${Draw(color)} Square with size = $size"
    }
    println(result)
  }

  def apply(color: Color): String = color match {
    case Red => "red"
    case Yellow => "yellow"
    case Pink => "pink"
    case c => if (c.isLight) "light" else "dark"
  }

  def main(args: Array[String]): Unit = {
    Draw(Circle(3, Yellow))
    Draw(Circle(3, CustomColor(1.0, 1.0, 0.0)))
  }
}
