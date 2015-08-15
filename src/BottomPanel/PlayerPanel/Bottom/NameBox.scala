package BottomPanel.PlayerPanel.Bottom

import java.awt.{Dimension, Font}

import Events.EventQueue

import scala.swing.event.EditDone
import scala.swing.{Alignment, TextField}

/**
 * Created by Admin on 2015-08-14.
 */
class NameBox(sizeX: Int, sizeY: Int, name: String, eventQueue: EventQueue) extends TextField(name){

  editable=false
  font=new Font("Serif",100,40)
  preferredSize=new Dimension(sizeX, sizeY)


  def alignRight() : Unit ={
    horizontalAlignment=Alignment.Right
  }

  def alignLeft() : Unit ={
    horizontalAlignment=Alignment.Left
  }

  def setEditable() : Unit ={
    editable = true
  }

  def setInactive() : Unit ={
    editable = false
  }

  def getText() : String ={
    text
  }

  action = new EditAction(name, eventQueue)

}
