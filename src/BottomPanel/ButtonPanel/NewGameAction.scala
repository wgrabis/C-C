package BottomPanel.ButtonPanel

import Events.EventQueue
import Events.Events.NewGameEvent

import scala.swing.Action

/**
 * Created by Admin on 2015-08-14.
 */
class NewGameAction (nameAction: String, eventQueue: EventQueue) extends Action(nameAction: String){
  override def apply(): Unit = {
    eventQueue.add(new NewGameEvent())
  }
}
