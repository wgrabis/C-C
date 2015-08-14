package Events.Events

import Events.Executors.{Executor, NewGameExecutor, GameButtonExecutor}

/**
 * Created by Admin on 2015-08-14.
 */
class NewGameEvent extends Event{
  def action(): Executor = {
    new NewGameExecutor
  }
  def info(): String = {
    "New Game event"
  }
}
