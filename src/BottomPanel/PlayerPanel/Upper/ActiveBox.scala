package BottomPanel.PlayerPanel.Upper

import java.awt.{Color, Dimension}

import scala.swing.TextField

/**
 * Created by Admin on 2015-08-14.
 */
class ActiveBox(sizeX: Int, sizeY: Int) extends TextField{
  val activeColor = new Color(15721648)
  val inactiveColor = new Color(16777215)

  editable=false
  preferredSize=new Dimension(sizeX, sizeY)

  turnoff()

  def turnon(): Unit ={
    background = activeColor
    repaint()
  }

  def turnoff(): Unit ={
    background = inactiveColor
    repaint()
  }
}
