// Price to Win

fun main(){
    val points= -90

    if (points>=0 && points<=100){
        println("You do not Qualify")
    }

    else if (points>=101 && points<=400){
        println("You win a Smartphone")
    }

    else if (points>=401 && points<=1000){
        println("You win a Laptop")
    }

    else if (points>=1000){
        println("You win a trip to Canada")
    }

    else{
        println("Invalid")
    }
}