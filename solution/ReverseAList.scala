object Solution extends App {
  def f(arr:List[Int]):List[Int] = {
    arr match {
      case head::tail => f(tail):::List(head)
      case Nil => Nil
    }
  }

  // Another cleaner way
  def f2(arr: List[Int]): List[Int] = 
    arr.foldLeft(List[Int]())((acc, nextVal)=>nextVal::acc)

  val a = (1 to 10).toList
  println(f(a))
  println(f2(a))
}