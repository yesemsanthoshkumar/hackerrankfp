object Solution extends App {
  def f(arr:List[Int]):Int =
    arr.filter(_ % 2 != 0).reduceLeft(_+_)

  val elem = (1 until 10).toList
  f(elem)
}