import scala.math.pow

object ArmstrongNumbers {
  def isArmstrongNumber(i: Int): Boolean = {
    val order = i.toString.length
    val digits = i.toString.map(_.asDigit)
    i == digits.foldLeft(0)(_ + pow(_, order).toInt)
  }
}