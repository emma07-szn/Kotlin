fun main(){
    val mysquare=Square()

    mysquare.area()
    mysquare.perimeter()

}

class Square{
    val width=5
    val length=5
    val colour="Blue"


    fun area(){
        val answer=width*length

        println("The area is $answer")
    }


    fun perimeter(){
        val answer=width+length

        println("The perimeter is $answer")
    }
}