package BoardPanel.GameButton

import java.awt.Dimension
import Events.EventQueue

import scala.swing.Button

/**
 * Created by Admin on 2015-07-15.
 */
class GameButton(Size: Int, eventQueue: EventQueue, val posX: Int, val posY: Int) extends Button{

  val iconMatcher = new IconMatcher

  var state = 0
  preferredSize = new Dimension(Size, Size)

  action = new GameAction("", posX, posY, eventQueue)

  private def change(): Unit ={
    //println("x: " + (PosX).toString + " y: " + (PosY).toString + " info: " + state.toString)
    icon = iconMatcher.matchTest(state)
    repaint()
  }

  def markCircle() : Unit = {
    state = 2
    change()
  }

  def markCross() : Unit ={
    state = 3
    change()
  }

  def markWon(): Unit = {
    if(state <= 2) state += 5
    change()
  }

  def markEmpty(): Unit = {
    state = 0
    change()
  }

  def markInactive(): Unit = {
    if(state <= 2) state += 3
    change()
  }

}
