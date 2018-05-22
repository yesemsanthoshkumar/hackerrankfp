object Solution extends App {
  def f(arr:List[Int]):Int = arr.foldLeft(0){(acc, _)=> acc + 1}

  val elem = (1 until 10).toList
  f(elem)
}