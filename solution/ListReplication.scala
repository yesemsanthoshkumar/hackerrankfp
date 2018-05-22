import scala.collection.mutable.ListBuffer

object Solution extends App {
  def f(num:Int, arr:List[Int]):List[Int] = arr.map(List.fill(num)(_)).flatten

	val n = scala.io.StdIn.readInt
  var elements = new ListBuffer[Int]()

  var x = 0
  for(x <- 1 to n)
  	elements += scala.io.StdIn.readInt

	f(n, elements.toList)
}
