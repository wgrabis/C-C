package BottomPanel.Old

/**
 * Created by Admin on 2015-01-23.
 */


import java.awt.{Color, Graphics2D}

import scala.swing._
import scala.swing.event._


class PlayerOveview(var Name: String,val Number: Int)  extends FlowPanel{
  var Active=false
  background=new Color(200)

  //
  val ActiveBox=new TextArea{
    editable=false
    background=new Color(16777215)
    preferredSize=new Dimension(50,75)
  }
  //

  //
  val Player1inactive=new TextField("  Gracz "+Number.toString()+"  "){
    editable=false
    preferredSize=new Dimension(150,75)
  }
  val PlayerBox=new FlowPanel(){
    if(Number==1) {
      contents += Player1inactive
      contents += ActiveBox
    }
    else
    {
      contents += ActiveBox
      contents += Player1inactive
      Player1inactive.horizontalAlignment=Alignment.Right
    }
  }
  //
  //
  val SetName=new TextField(Name){
    editable=false
    font=new Font("Serif",100,40)
    preferredSize=new Dimension(200,75)
    if(Number==2)horizontalAlignment=Alignment.Right
  }
  //
  //
  def setActive(): Unit ={
    ActiveBox.background=new Color(15721648)
  }
  def setInActive(): Unit ={
    ActiveBox.background=new Color(16777215)
  }
  //

  override def paintComponent(g: Graphics2D): Unit = {
    g.clearRect(0, 0, size.width, size.height)
    contents+=PlayerBox
    contents+=SetName
  }
  listenTo(SetName)
  reactions+={
    case EditDone(SetName)=>
      if(SetName.text.length>10)
      {
        SetName.text=(SetName.text.substring(0,9))
      }
      Name=SetName.text
  }


  def setActive(state: Boolean)= {
    Active = state
    if(Active)
    {
      SetName.editable=false
      Player1inactive.text="  Gracz "+Number.toString()+"  "
    }
    else
    {
      SetName.editable=true
      Player1inactive.text="  Wpisz imię gracza  "
    }
    repaint()
  }
}
