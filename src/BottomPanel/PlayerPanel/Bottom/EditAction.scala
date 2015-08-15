package BottomPanel.PlayerPanel.Bottom

import Events.EventQueue
import Events.Events.EditEvent

import scala.swing.Action

/**
 * Created by Admin on 2015-08-15.
 */
class EditAction(nameAction: String, eventQueue: EventQueue) extends Action(nameAction: String){
  override def apply(): Unit = {
    eventQueue.add(new EditEvent(nameAction))
  }
}
