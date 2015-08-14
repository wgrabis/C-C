package BottomPanel.PlayerPanel.Bottom

import java.awt.{Graphics2D, Color}

import scala.swing.{Alignment, FlowPanel}

/**
 * Created by Admin on 2015-08-14.
 */
class PlayerBottomPanel(sizeX : Int, sizeY: Int, name: String) extends FlowPanel{
  background = new Color(200)
  val nameBox = new NameBox(sizeX, sizeY, name)

  contents += nameBox

  def alignRight() : Unit ={
    nameBox.alignRight()
  }

  def alignLeft() : Unit ={
    nameBox.alignLeft()
  }

  def setActiveEdit() : Unit ={
    nameBox.setEditable()
  }

  def setInactiveEdit() : Unit ={
    nameBox.setInactive()
  }

  // Currently not used

  def getText() : String ={
    nameBox.getText()
  }

  override def paintComponent(g: Graphics2D): Unit = {
    g.clearRect(0, 0, size.width, size.height)
  }
}
