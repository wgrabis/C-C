package Game.Data

import Game.Data.Logic.{BoardData, CurrentPlayer}

/**
 * Created by Admin on 2015-08-15.
 */
class DataHolder {
  val currentPlayer = new CurrentPlayer
  val boardData = new BoardData
}
