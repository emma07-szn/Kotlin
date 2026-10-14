fun main(){

    // create an object using person class and store it in my person variable
    var myperson=Person()

    myperson.eat()
    myperson.walk()
    myperson.talk()
    myperson.sing()


}


// create a person class with attributes and behaviours

class Person{
    var name="John"
    var age=20
    var language="swahili"
    var heigh=4.9


    fun eat(){
        println("This person $name can eat")

    }

    fun walk(){
        println("This person $name can walk")
    }

    fun talk(){
        println("This persom $name can talk")
    }

    fun sing(){
        println("This person $name can sing")
    }
}