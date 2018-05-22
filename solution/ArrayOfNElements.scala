object Solution extends App {
    def f(num:Int):List[Int] = {
        arr.view.zipWithIndex.filter{_._2 % 2 != 0}.map{_._1}.toList
    }

    val num = scala.io.StdIn.readInt
    f(num)
}