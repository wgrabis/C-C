package Events.Events

import Events.Executors.Executor

/**
 * Created by Admin on 2015-07-15.
 */
abstract class Event{
  def action() : Executor
  def info() : String
}
