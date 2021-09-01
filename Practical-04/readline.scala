object program_4_1{
    def readline(msg: String) : String={
        var s: String =scala.io.StdIn.readLine(msg)
        return s
    }
    def main(args: Array[String]) : Unit = {
        var s:String=readline("Enter your string :")
        println("The string is :"+s)
    }
}