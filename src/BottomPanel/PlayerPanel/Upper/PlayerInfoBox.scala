package BottomPanel.PlayerPanel.Upper

import java.awt.Dimension

import scala.swing.{Alignment, TextField}

/**
 * Created by Admin on 2015-08-14.
 */
class PlayerInfoBox(sizeX: Int, sizeY: Int, playerInfo: String) extends TextField {
  var inactiveText = "Gracz " + playerInfo
  var activeText = "Wprowadz imię gracza"

  editable=false
  preferredSize=new Dimension(sizeX, sizeY)

  var currState = 0
  setInactive()

  def getState() : Int = {
    currState
  }

  def setInactive() : Unit = {
    text = inactiveText
  }

  def setActive() : Unit = {
    text = activeText
  }

  def alignRight(): Unit ={
    horizontalAlignment = Alignment.Right
  }

  def alignLeft(): Unit ={
    horizontalAlignment = Alignment.Left
  }

}
