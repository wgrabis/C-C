package Miscellaneous

/**
 * Created by Wojtek on 2015-01-23.
 */


class Array2Dim() {
  var array=new Array[Int](40000)
  var size=200
  def setArg(x: Int,y: Int,value: Int)=
  {
      val tempPos=x+y*size
      array(tempPos)=value
      tempPos
  }
  def getArg(x: Int,y: Int)=
  {
    val tempPos=x+y*size
    array(tempPos)
  }
}
