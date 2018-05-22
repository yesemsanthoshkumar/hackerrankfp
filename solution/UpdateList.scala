object Solution extends App {
  def f(arr:List[Int]):Int =
    arr.map(Math.abs)

  val elem = (1 until 10).toList
  f(elem)
}