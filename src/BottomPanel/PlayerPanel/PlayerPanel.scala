package BottomPanel.PlayerPanel

import java.awt.{Dimension, Color, Graphics2D}

import BottomPanel.PlayerPanel.Bottom.PlayerBottomPanel
import BottomPanel.PlayerPanel.Upper.PlayerUpperPanel
import Events.EventQueue

import scala.swing.FlowPanel

/**
 * Created by Admin on 2015-08-14.
 */
class PlayerPanel(sizeX: Int, sizeY: Int, eventQueue: EventQueue) extends FlowPanel{
  background=new Color(200)

  preferredSize =  new Dimension(sizeX, sizeY)

  val bottomPanel = new PlayerBottomPanel(sizeX, sizeY/2, "1", eventQueue)
  val upperPanel = new PlayerUpperPanel(sizeX, sizeY/2, "1")

  contents += upperPanel
  contents += bottomPanel

  def alignRight() : Unit ={
    bottomPanel.alignRight()
    upperPanel.alignRight()
    repaint()
  }

  def alignLeft() : Unit ={
    bottomPanel.alignLeft()
    upperPanel.alignLeft()
    repaint()
  }

  def setActive() : Unit ={
    upperPanel.setActive()
    repaint()
  }

  def setInactive() : Unit ={
    upperPanel.setInactive()
    repaint()
  }
  def setEditable() : Unit ={
    upperPanel.setActiveEdit()
    bottomPanel.setActiveEdit()
    repaint()
  }

  def setBlocked() : Unit ={
    upperPanel.setActiveGame()
    bottomPanel.setInactiveEdit()
    repaint()
  }

  def getName() : String={
    bottomPanel.getText()
  }

  override def paintComponent(g: Graphics2D): Unit = {
    g.clearRect(0, 0, size.width, size.height)
  }
}
