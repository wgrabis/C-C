package Events.Events

import BoardPanel.GameButton.GameButton
import Events.Executors.{Executor, GameButtonExecutor}

/**
 * Created by Admin on 2015-08-13.
 */
class GameButtonEvent(posX: Int, posY: Int) extends Event{
  def action(): Executor = {
    new GameButtonExecutor(posX, posY)
  }
  def info(): String = {
    "Game event :: x:" + posX.toString + "y:" + posY.toString
  }
}
