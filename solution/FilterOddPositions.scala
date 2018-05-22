object Solution extends App {
  def f(arr:List[Int]):List[Int] = {
  	arr.view.zipWithIndex.filter{_._2 % 2 != 0}.map{_._1}.toList
  }

  val elements = (1 to 10).toList
  f(elements)
}
