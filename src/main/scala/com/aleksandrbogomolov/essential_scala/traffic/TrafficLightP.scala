package com.aleksandrbogomolov.essential_scala.traffic

sealed trait TrafficLightP {
  def next: TrafficLightP
}

case object RedP extends TrafficLightP {
  override def next: TrafficLightP = GreenP
}

case object YellowP extends TrafficLightP {
  override def next: TrafficLightP = RedP
}

case object GreenP extends TrafficLightP {
  override def next: TrafficLightP = RedP
}
