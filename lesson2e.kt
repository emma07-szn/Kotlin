// when statement

fun main(){
    var marks:Int=40

    when(marks){
        in 0..29->println("Failed")
        in 30..49->println("Below Average")
        in 50..64->println("Average")
        in 65..79->println("Above Average")
        in 80..100->println("Excellent")
        else ->println("INvalid")

    }
}