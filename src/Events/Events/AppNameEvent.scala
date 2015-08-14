package Events.Events

import Events.Executors.{AppNameExecutor, Executor}

/**
 * Created by Admin on 2015-08-14.
 */
class AppNameEvent extends Event{
  override def action(): Executor = {
    new AppNameExecutor
  }

  override def info(): String = {
    "Approve names event"
  }
}
