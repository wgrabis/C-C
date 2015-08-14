package BoardPanel.GameButton

import javax.swing.ImageIcon

/**
 * Created by Admin on 2015-08-14.
 */
object IconSet extends Enumeration{
  val ActiveCross = new ImageIcon("../CourseProject/Cross&CircleObjects/Cross.png")
  val ActiveCircle = new ImageIcon("../CourseProject/Cross&CircleObjects/Circle.png")
  val ActiveEmpty = new ImageIcon("../CourseProject/Cross&CircleObjects/Empty.png")
  val HighlightedCross = new ImageIcon("../CourseProject/Cross&CircleObjects/CrossWon.png")
  val HighlightedCircle = new ImageIcon("../CourseProject/Cross&CircleObjects/CircleWon.png")
  val inActiveCross = new ImageIcon("../CourseProject/Cross&CircleObjects/Cross_inactive.png")
  val inActiveCircle = new ImageIcon("../CourseProject/Cross&CircleObjects/Circle_inactive.png")
  val inActiveEmpty = new ImageIcon("../CourseProject/Cross&CircleObjects/Empty_inactive.png")
  val InvalidIcon = new ImageIcon("../CourseProject/Cross&CircleObjects/invalid.png")
}
