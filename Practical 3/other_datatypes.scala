object special_datatypes {

  def dummy_function(): Nothing = {
    println("This is a dummy_function which throws an exception")
    throw new Exception("A made up Exception for demonstration\n\n")
  }

  def function_for_AnyRef(variable: AnyRef) {
    println("Passed variable: " + variable)
  }

  def function_for_AnyVal(variable: AnyVal) {
    println("Passed variable: " + variable)
  }

  def function_for_Any(variable: Any) {
    println("Passed variable: " + variable)
  }

  def main(args: Array[String]) {
    val nullinstancevariable: String = null
    try {
      nullinstancevariable.length()
    } catch {
      case e: Exception =>
        println("Null instance :\n Caught an Exception: " + e + "\n\n")
    }

    val nullclassexample: Null = null
    println(
      "\nNULL Class\nHere `nullclassexample` is of class `NULL` and it does not\nhave any method or member to call or print so\ncalling a function or member will result in throwing of error\nand hence termination of program"
    )

    println(
      "\n\nNothing is used generally when programmer needs to return an exception"
    )
    println("Calling a dummy_function to demonstrate `Nothing` datatype")
    try {
      var nothingvariable: Nothing = dummy_function()
    } catch {
      case e: Exception =>
        println(
          "Returns value " + e
        )
    }

    println("AnyVal\nIt can take and process any primitive datatype")
    println("Passing integer 11 and a character 'P'")
    function_for_AnyVal(11)
    function_for_AnyVal('P')
    println("\n")

    println(
      "AnyRef\nIt can take and process any non-primitive datatype like string and lists and user defined classes"
    )
    println("Passing a string 'Prateek krishali'")
    function_for_AnyRef("Prateek krishali")
    println("\n")

    println(
      "Any\nIt can take and process all types of datatypes both of AnyVal as well as AnyRef"
    )
    println(
      "Passing a string 'High position comes with great responsibility' and an integer 78"
    )
    function_for_Any("High position comes with great responsibility")
    function_for_Any(78)
    print("\n")
  }

}