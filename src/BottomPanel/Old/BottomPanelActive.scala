package BottomPanel.Old

/**
 * Created by Admin on 2015-01-23.
 */


import java.awt.Graphics2D

import BottomPanel.PlayerPanel.PlayerPanel
import Events.EventQueue

import scala.swing._
import scala.swing.event._


class BottomPanelActive (rows0: Int, cols0: Int, eventQueue: EventQueue) extends GridPanel(1, cols0){
  val height=2
  val width=2
  var NewGameActive=false

  def this(eventQueue: EventQueue)={
    this(1,3,eventQueue)
    this.contents+=Player1
    this.contents+=buttonOne
    this.contents+=Player2
  }
  def winner(number: Int): Unit ={
    if(number==1){
      buttonOne.text="Wygrał gracz "+Player1.getName()+"!"
    }
    else{
      buttonOne.text="Wygrał gracz "+Player2.getName()+"!"
    }
  }
  val Player1=new PlayerPanel(200,140)
  Player1.alignLeft()

  val Player2=new PlayerPanel(200,140)
  Player2.alignRight()

  val buttonOne = new Button {
    text = "Nowa gra"
  }
  listenTo(buttonOne)
  reactions+={
    case ButtonClicked(buttonOne)=>
      if(NewGameActive)
      {
        NewGameActive=false
        buttonOne.text="Nowa gra"
        Player1.setBlocked()
        Player2.setBlocked()
        //events.EventEngine(2,0,0)
      }
      else
      {
        NewGameActive=true
        Dialog.showMessage(message = "Nowa gra")
        buttonOne.text="Zatwierdź nazwy graczy"
        Player1.setEditable()
        Player2.setEditable()
        //events.EventEngine(3,0,0)
      }
  }
  override def paintComponent(g: Graphics2D) {
    g.clearRect(0, 0, size.width, size.height)
    g.drawRect(1, 1, 100, 100)

  }
}

