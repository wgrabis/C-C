package Game.Data.Visual

import BoardPanel.Board
import BottomPanel.InfoPanel

/**
 * Created by Admin on 2015-08-15.
 */
class VisualHolder(board: Board, bottomPanel: InfoPanel) {

  def setInactive(): Unit ={
    board.inactivate()
    bottomPanel.makeInactive()
  }
  def setNames(): Unit ={
    bottomPanel.setEditable()
  }
  def startGame(): Unit ={
    board.clear()
    bottomPanel.setActiveGame()
  }
  // ugly
  def playerOneMove(posX: Int, posY: Int): Unit ={
    board.setCross(posX, posY)
  }
  def playerTwoMove(posX: Int, posY: Int): Unit ={
    board.setCircle(posX, posY)
  }
}
