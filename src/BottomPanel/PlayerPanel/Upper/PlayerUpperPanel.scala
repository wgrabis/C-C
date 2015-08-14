package BottomPanel.PlayerPanel.Upper

import java.awt.{Graphics2D, Color}

import scala.swing.FlowPanel

/**
 * Created by Admin on 2015-08-14.
 */
class PlayerUpperPanel(sizeX : Int, sizeY: Int, name: String) extends FlowPanel{

  background=new Color(200)
  val activeBox = new ActiveBox(sizeX/4, sizeY)
  val playerInfoBox = new PlayerInfoBox(sizeX - sizeX/4, sizeY, name)

  // default alignment

  alignRight()

  def clear(): Unit ={
    contents -= activeBox
    contents -= playerInfoBox
  }

  def alignRight(): Unit ={
    clear()
    contents += activeBox
    contents += playerInfoBox
    playerInfoBox.alignRight()
  }

  def alignLeft(): Unit ={
    clear()
    contents += playerInfoBox
    contents += activeBox
    playerInfoBox.alignLeft()
  }

  def setActiveEdit(): Unit ={
    playerInfoBox.setActive()
  }

  def setActiveGame(): Unit ={
    playerInfoBox.setInactive()
  }

  def setActive() : Unit ={
    activeBox.turnon()
  }

  def setInactive() : Unit ={
    activeBox.turnoff()
  }

  override def paintComponent(g: Graphics2D): Unit = {
    g.clearRect(0, 0, size.width, size.height)
  }
}
