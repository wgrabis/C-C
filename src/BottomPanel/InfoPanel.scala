package BottomPanel

import java.awt.Graphics2D

import BottomPanel.ButtonPanel.{ButtonPanel, NewGameButton}
import BottomPanel.PlayerPanel.PlayerPanel
import Events.EventQueue

import scala.swing.GridPanel

/**
 * Created by Admin on 2015-08-14.
 */
class InfoPanel (sizeX: Int, sizeY: Int, eventQueue: EventQueue) extends GridPanel(1, 3){
  val fixedSize: Int = sizeX / 3

  val player1 = new PlayerPanel(fixedSize, sizeY - 30, eventQueue)
  player1.alignLeft()

  val player2 = new PlayerPanel(fixedSize, sizeY - 30, eventQueue)
  player2.alignRight()

  val buttonPanel = new ButtonPanel(fixedSize, sizeY, eventQueue)

  this.contents += player1
  this.contents += buttonPanel
  this.contents += player2

  def setEditable() : Unit ={
    buttonPanel.setApprove()
    player1.setEditable()
    player2.setEditable()
  }

  def setActiveGame(): Unit ={
    buttonPanel.setNewGame()
    player1.setBlocked()
    player2.setBlocked()
  }

  def activatePlayer1(): Unit ={
    player1.setActive()
    player2.setInactive()
  }

  def activatePlayer2(): Unit ={
    player1.setInactive()
    player2.setActive()
  }

  def makeInactive(): Unit ={
    buttonPanel.setNewGame()
    player1.setBlocked()
    player2.setBlocked()
  }


  override def paintComponent(g: Graphics2D) {
    g.clearRect(0, 0, size.width, size.height)
  }
}
