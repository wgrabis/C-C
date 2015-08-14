package Events.Old

import BoardPanel.Board
import BottomPanel.Old.BottomPanelActive
import Miscellaneous.Array2Dim

import scala.swing._


/**
 * Created by Admin on 2015-01-23.
 */
class EventMatch(bottom: => BottomPanelActive,board: => Board,eventPrint: => EventDisplay) {
  var CurrentPlayer=1
  var BoardData = new Array2Dim
  var GameActive=0
  def notify_board(event: Int): Unit =
  {
  }
  def notify_bottom(event: Int,x: Int,y: Int):Unit =
  {
  }
  def repaint_event(event: Int,x: Int,y: Int):Unit =
  {
      eventPrint.notify_event(event,x,y)
  }
  def winnerRepaint(pos_x: Int,pos_y: Int,incrX: Int,incrY: Int): Unit =
  {
    var temp_x=pos_x
    var temp_y=pos_y
    for(i <- 0.to(4))
    {
      //board.colorWon(temp_x,temp_y)
      BoardData.setArg(temp_x,temp_y,2+CurrentPlayer)
      temp_x+=incrX
      temp_y+=incrY
    }
  }
  def GameEngine(pos_x: Int,pos_y: Int): Boolean =
  {
      var Count=new Array[Int](8)
      for(i <- 0.to(7))
      {
        var temp_x=pos_x
        var temp_y=pos_y
        var incX: Int=0
        var incY: Int=0
        if(i == 0 || i == 1 || i == 2)incY=(-1)
        if(i == 4 || i == 5 || i == 6)incY=1
        if(i == 2 || i == 3 || i == 4)incX=1
        if(i == 0 || i == 7 || i == 6)incX=(-1)
        var TempCount=0
        while(BoardData.getArg(pos_x,pos_y)==BoardData.getArg(temp_x,temp_y)&&TempCount<5)
        {
          TempCount+=1
          temp_x+=incX
          temp_y+=incY
        }
        Count(i)=TempCount-1
        println(pos_x.toString+","+pos_y.toString+":"+incX.toString+","+incY.toString+"        count:"+Count(i).toString)
      }
      if(Count(0)+Count(4)>=4 || Count(1)+Count(5)>=4 || Count(2)+Count(6)>=4 || Count(3)+Count(7)>=4){
        if(Count(0)+Count(4)>=4) {
          println(Count(0)+" "+Count(4))
          winnerRepaint(pos_x - Count(0) * 1, pos_y - Count(0) * 1, 1, 1)
        }
        else
        if(Count(1)+Count(5)>=4) {
          println(Count(1)+" "+Count(5))
          winnerRepaint(pos_x, pos_y - Count(1) * 1, 0, 1)
        }
        else
        if(Count(2)+Count(6)>=4) {
          println(Count(2)+" "+Count(6))
          winnerRepaint(pos_x + Count(2) * 1, pos_y - Count(2) * 1, -1, 1)
        }
        else
        if(Count(3)+Count(7)>=4) {
          println(Count(3)+" "+Count(7))
          winnerRepaint(pos_x + Count(3) * 1, pos_y, -1, 0)
        }
        true
      }
      else false
  }
  def ClearBoardData(): Unit ={
    for (i <- 0.to(399)){
      BoardData.setArg(i%20,i/20,0)
    }
  }
  def EventEngine(event: Int,pos_x: Int,pos_y: Int): Int =
  {
      var retData: Int=0
      if(event==1)
      {
        if(BoardData.getArg(pos_x,pos_y)==0 && GameActive==1){
          if(CurrentPlayer==1) {
              retData=1
              BoardData.setArg(pos_x,pos_y,1)
              repaint_event(3,pos_x,pos_y)
             // bottom.Player1.setInActive()
              bottom.Player2.setActive()
              if(GameEngine(pos_x,pos_y))
              {
                bottom.Player1.setActive()
            //    bottom.Player2.setInActive()
                repaint_event(8,0,0)
                //Dialog.showMessage(message = "Wygrał gracz 1")
                println(bottom.Player1.name)
                EventEngine(3,0,0)
                retData=6
                bottom.winner(1)
      //          Dialog.showMessage(message = "Wygrał gracz:"+bottom.Player1.SetName.text+"!")
              }
              CurrentPlayer=2
          }
          else {
              retData=2
              BoardData.setArg(pos_x,pos_y,2)
              repaint_event(5,pos_x,pos_y)
              bottom.Player1.setActive()
          //    bottom.Player2.setInActive()
              if(GameEngine(pos_x,pos_y))
              {
        //        bottom.Player1.setInActive()
                bottom.Player2.setActive()
                repaint_event(9,0,0)
                //Dialog.showMessage(message = "Wygrał gracz 2")
                println(bottom.Player2.name)
                EventEngine(3,0,0)
                retData=7
                bottom.winner(2)
 //               Dialog.showMessage(message = "Wygrał gracz:"+bottom.Player2.SetName.text+"!")
              }
              CurrentPlayer=1
          }
        }
        else{
          retData = BoardData.getArg(pos_x, pos_y)
          if(GameActive==0) {
            repaint_event(7, pos_x, pos_y)
          }
          else {

            repaint_event(4 + (CurrentPlayer - 1) * 2, pos_x, pos_y)
          }
        }
      }
      if(event==2)
      {
        GameActive=1
        CurrentPlayer=1
        board.clear()
        ClearBoardData()
        retData=1
        bottom.Player1.setActive()
      }
      if(event==3)
      {
        GameActive=0
        retData=1
      }
      retData
  }
}
