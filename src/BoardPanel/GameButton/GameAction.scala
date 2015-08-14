package BoardPanel.GameButton

import Events.EventQueue
import Events.Events.GameButtonEvent

import scala.swing.Action

/**
 * Created by Admin on 2015-08-13.
 */
class GameAction(nameAction: String, posX: Int, posY: Int, eventQueue: EventQueue) extends Action(nameAction: String){
  override def apply(): Unit = {
      eventQueue.add(new GameButtonEvent(posX, posY))
  }
}
