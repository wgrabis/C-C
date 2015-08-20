package Events.Executors

import Game.GameLogic

/**
 * Created by Admin on 2015-08-13.
 */
abstract class Executor {
  def execute(gameLogic: GameLogic): Unit
}
