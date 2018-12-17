package com.aleksandrbogomolov.essential_scala.water

sealed trait Source

case object Well extends Source

case object Spring extends Source

case object Tap extends Source
