object datatypes {
     def dummy_function(): Unit = {
    print("In dummy_function which will return Unit")
  }
  def main(args: Array[String]) {
    var lresultb: Byte = -128
    var hresultb: Byte = 127
    println("Bytes can only be between: " + lresultb + " and " + hresultb)
    var lresults: Short = -32768
    var hresults: Short = 32767
    println("Short can only be between: " + lresults + " and " + hresults)
    var lresulti: Int = -2147483648
    var hresulti: Int = 2147483647
    println("Int can only be between: " + lresulti + " and " + hresulti)
    var lresultl: Long = -2147483648;
    var hresultl: Long = 2147483647;
    println("Long can only be between: " + lresultl + " and " + hresultl)
    var lresultf: Float = 1.175494351e-38f
    var hresultf: Float = 3.4028237e+37f
    println("Float can only be between: " + lresultf + " and " + hresultf)
    var lresultd: Double = 2.22507385850720138e-308
    var hresultd: Double = 1.79769313486231571e+308
    println("Double can only be between: " + lresultd + " and " + hresultd)
    var char: Char = 'P'
    println("Here character is: "+char)
    var string: String = "My name is Prateek krishali"
    println("Here string is: "+string)
    println("Here booleans are: " +(9==9)+ " and " +(10!=10))
    println("\n\nCalling for a dummy function to return Unit")
    println(" Here is the Unit returned by dummy_function: " +dummy_function()+ " ")
  }

 
}