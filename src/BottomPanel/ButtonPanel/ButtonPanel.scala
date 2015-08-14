package BottomPanel.ButtonPanel

import java.awt.{Graphics2D, Dimension, Color}

import Events.EventQueue

import scala.swing.FlowPanel

/**
 * Created by Admin on 2015-08-14.
 */
class ButtonPanel (sizeX: Int, sizeY: Int, eventQueue: EventQueue) extends FlowPanel{
  background=new Color(200)

  preferredSize =  new Dimension(sizeX, sizeY)

  val newGameButton = new NewGameButton(eventQueue, sizeX, sizeY)

  contents += newGameButton

  def setApprove() : Unit ={
    newGameButton.setApprove()
  }

  def setNewGame() : Unit ={
    newGameButton.setNewGame()
  }

  override def paintComponent(g: Graphics2D): Unit = {
    g.clearRect(0, 0, size.width, size.height)
  }
}
