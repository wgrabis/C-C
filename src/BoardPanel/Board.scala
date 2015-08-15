package BoardPanel

/**
 * Created by Wojtek on 2015-01-23.
 */

import java.awt.Graphics2D
import Events.EventQueue

import scala.swing._

class Board(mSize: Int, events: EventQueue) extends GridPanel(20,20){

  preferredSize = new Dimension(mSize, mSize)
  val boardButtons = new BoardArray(20, 20, events, this, mSize/20)
  border = Swing.EmptyBorder(0,0,0,0)
  inactivate()

  def setCross(posX: Int, posY: Int): Unit ={
    boardButtons.get(posX, posY).markCross()
  }

  def setCircle(posX: Int, posY: Int): Unit ={
    boardButtons.get(posX, posY).markCircle()
  }

  def setWon(posX: Int, posY: Int): Unit ={
    boardButtons.get(posX, posY).markWon()
  }

  def clear(): Unit = {
    boardButtons.clear()
  }

  def inactivate(): Unit= {
    boardButtons.inactivate()
  }

  override def paintComponent(g: Graphics2D) {
    g.clearRect(0, 0, size.width, size.height)

  }

}