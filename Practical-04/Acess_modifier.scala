class Parent {
    private var pvt: Int = 25
    protected var protect: Int = 15
    var public: Int = 65

    def display_private() : Unit = {
        println("\nDisplaying private variable of Parent class: " + pvt)
    }

    def display_protected() : Unit = {
        println("\nDisplaying protected variable of Parent class: " + protect)
    }
}

class Child extends Parent {

    def display_parent_protected() : Unit = {
        println("\n Private cannot be accessed in child class :")
        println("\nDisplaying protected variable of Parent class in Child class: " + protect)
        protect = 2
        println("Displaying protected variable of Parent class in Child class after modification: " + protect)
    }
}
object Program_4_3{
 def main(args: Array[String]) : Unit = {
        // Access Modifiers
        var parent = new Parent()
        println("\nPublic variable of parent class can be accessed from anywhere. It's value is: " + parent.public)
        parent.display_private()
        parent.display_protected()

        var child = new Child()
        child.display_parent_protected()
    }

}