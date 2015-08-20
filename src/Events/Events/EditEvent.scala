package Events.Events

import Events.Executors.{EditExecutor, Executor}

/**
 * Created by Admin on 2015-08-15.
 */
class EditEvent(name: String) extends Event{
  override def action(): Executor = {
    new EditExecutor
  }

  override def info(): String = {
    "Player edit ended: " + name
  }
}
