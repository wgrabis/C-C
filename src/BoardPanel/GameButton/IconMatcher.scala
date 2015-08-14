package BoardPanel.GameButton

import javax.swing.ImageIcon


/**
 * Created by Admin on 2015-08-14.
 */
class IconMatcher {
  def matchTest(x: Int): ImageIcon = x match {
    case 0 => IconSet.ActiveEmpty
    case 1 => IconSet.ActiveCross
    case 2 => IconSet.ActiveCircle
    case 3 => IconSet.inActiveEmpty
    case 4 => IconSet.inActiveCross
    case 5 => IconSet.inActiveCircle
    case 6 => IconSet.HighlightedCross
    case 7 => IconSet.HighlightedCircle
    case _ => IconSet.InvalidIcon
  }
}
