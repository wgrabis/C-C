/**
 * Created by Wojtek on 2015-01-23.
 */


import BoardPanel.Board
import BottomPanel.InfoPanel
import Events.Old.{EventDisplay, EventMatch}
import Events.EventQueue

import scala.swing._
import java.awt.{ Color, Graphics2D }


object MainFrameObject extends SimpleSwingApplication{
  //val events: EventMatch=new EventMatch(BottomPanel,board,EventPrint)
  //debug
  val eventQueue = new EventQueue()
  val board =new Board(600, eventQueue)


  val BottomPanel = new InfoPanel(600, 170, eventQueue)

  val EventPrint:EventDisplay= new EventDisplay(){
    preferredSize=new Dimension(600,70)
  }
  def top = new MainFrame {
    resizable= true
    foreground=new Color(255)
    title = "Kółko i krzyżyk"
    preferredSize = new Dimension(620,840)
    contents = new FlowPanel{
      contents+=board
      contents+=BottomPanel
      contents+=EventPrint
    }
  }
}