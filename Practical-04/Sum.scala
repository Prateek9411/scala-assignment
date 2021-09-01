object Program_4_2
{
     def readline(msg: String) : String={
        var s: String =scala.io.StdIn.readLine(msg)
        return s
    }
     def add_mutable(a: Int, b: Int) : Int = {
        return a + b
    }

    def add_immutable(p: Int, q: Int) : Int = {
        return p + q
    }
    def main(args: Array[String]): Unit=
    {
       val a: Int = readline("\nEnter 1st number (Immutable): ").toInt
        val b: Int = readline("Enter 2st number (Immutable): ").toInt

        var x: Int = readline("\nEnter 1st number (Mutable): ").toInt
        var y: Int = readline("Enter 2st number (Mutable): ").toInt

      var sum_mutable:Int =add_mutable(a,b)
      val sum_immutable:Int =add_immutable(x,y)
       
       println("sum_mutable : "+ sum_mutable)
       sum_mutable+=89
       println("sum_mutable :" + sum_mutable)

       println("sum_immutable :" + sum_immutable)
      // sum_immutable+=20 =>this will throw error
      // println("sum_immutable :" + sum_immutable)

    }
}