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

  val sizeX = 620
  val sizeY = 840

  def bottomSize() : Int = sizeY - sizeX - 20
  def boardSize() : Int = sizeX - 20

  val eventQueue = new EventQueue()
  val board = new Board(boardSize(), eventQueue)
  val BottomPanel = new InfoPanel(boardSize(), bottomSize(), eventQueue)

  def top = new MainFrame {

    resizable = false
    foreground=new Color(255)
    title = "Kółko i krzyżyk"
    preferredSize = new Dimension(sizeX - 10, sizeY)

    contents = new FlowPanel{
      contents+=board
      contents+=BottomPanel
    }
  }
}