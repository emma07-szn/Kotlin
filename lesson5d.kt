fun main(){
    try {
        val result=10/0
        println("Result is $result")
    }
    catch(e:ArithmeticException) {
        println("Error: Cannot divide number by 0")
        
    }
}