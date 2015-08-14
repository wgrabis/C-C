package Events.Old

import scala.swing._


/**
 * Created by Admin on 2015-01-23.
 */
class EventDisplay() extends TextArea{
  editable=false
  def notify_event(event: Int,x: Int,y: Int): Unit =
  {
      if(event==1)text=" EVENT:NEW GAME"
      if(event==2)text=" EVENT:PLAYERS ACTIVE"
      if(event==3)text=" EVENT:PLAYER 1 MOVE:"+x.toString+","+y.toString
      if(event==4)text=" EVENT:PLAYER 1 WRONG MOVE"
      if(event==5)text=" EVENT:PLAYER 2 MOVE:"+x.toString+","+y.toString
      if(event==6)text=" EVENT:PLAYER 2 WRONG MOVE"
      if(event==7)text=" EVENT:PLAYERS INACTIVE"
      if(event==8)text=" EVENT:PLAYER 1 WON"
      if(event==9)text=" EVENT:PLAYER 2 WON"
      repaint()
  }

}
