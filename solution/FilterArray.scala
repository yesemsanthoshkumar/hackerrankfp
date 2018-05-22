object Solution extends App {
	def f(delim:Int, arr:List[Int]):List[Int] = arr.filter(_ < delim)

	val n = scala.io.StdIn.readInt
  var elements = (1 to 10).toList

  f(n, elements)
}
