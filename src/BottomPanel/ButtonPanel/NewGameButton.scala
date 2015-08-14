package BottomPanel.ButtonPanel

import java.awt.Dimension

import Events.EventQueue

import scala.swing.Button

/**
 * Created by Admin on 2015-08-14.
 */
class NewGameButton(eventQueue: EventQueue, sizeX: Int, sizeY: Int) extends Button{
  val actionNewGame = new NewGameAction("New Game", eventQueue)
  //replace
  val actionApproveNames = new NewGameAction("Zatwierdź nazwę", eventQueue)
  preferredSize = new Dimension(sizeX, sizeY)

  //default action
  setNewGame()

  def setApprove() : Unit ={
    action = actionApproveNames
  }

  def setNewGame() : Unit ={
    action = actionNewGame
  }
}
