package com.aleksandrbogomolov.essential_scala

class Timestamp(val seconds: Long)

object Timestamp {

  def apply(hours: Int, minutes: Int, seconds: Int): Timestamp = new Timestamp(hours * 60 * 60 + minutes * 60 + seconds)
}
