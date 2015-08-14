package Events

import _root_.Events.Events.Event

import scala.collection.mutable


/**
 * Created by Admin on 2015-07-15.
 */
class EventQueue {
  val mQueue = new mutable.Queue[Event]
  var mCount = 0

  def add(newEvent: Event): Unit = {
    // debug
    printf(newEvent.info() + "\n")

    mQueue += newEvent
    mCount += 1
  }

  def get(): Event = {
    if(mQueue.isEmpty) throw new NullPointerException
    mCount -= 1
    mQueue.dequeue()
  }

}
