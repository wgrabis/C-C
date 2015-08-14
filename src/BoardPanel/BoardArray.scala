package BoardPanel

import BoardPanel.GameButton.GameButton
import Events.EventQueue

/**
 * Created by Admin on 2015-08-14.
 */
class BoardArray(sizeX: Int, sizeY: Int, eventQueue: EventQueue, board: Board, buttonSize: Int) {
  var boardButtons = new Array[GameButton](400)

  for (i <- 0.to(399)) {
    boardButtons(i)= new GameButton(buttonSize, eventQueue, i%20, i/20)
    board.contents += boardButtons(i)
  }

  def get(posX: Int, posY: Int) : GameButton ={
    boardButtons(posX + (sizeY - 1) * posY)
  }

  def clear(): Unit = {
    for (i <- 0.to(399)){
      boardButtons(i).markEmpty()
    }
  }

  def inactivate(): Unit = {
    for (i <- 0.to(399)){
      boardButtons(i).markInactive()
    }
  }
}
