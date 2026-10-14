fun main(){
    val myanimal=Animal()
    val mydog=Dog()

    myanimal.eating()
    mydog.bark()
    mydog.eating()
 

}

open class Animal{
    val origin="Africa"

    fun eating(){
        println("This animal can eat")
    }



}

class Dog:Animal(){
    fun bark(){
        println("This dog can bark")
    }
}