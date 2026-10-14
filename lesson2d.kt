fun main(){
    val marks=9

    if (marks>=0 && marks<=29){
        println("Failed")
    }
    else if(marks>=30 && marks<=49){
    println("Below Average")
    }
    else if(marks>=50 && marks<=64){
        println("Average")
    }
    else if(marks>=65 && marks<=79){
        println("Above Average")
    }
    else if(marks>=80 && marks<=100){
        println("Excellent")
    }
    else{
        println("Invalid Marks")
    }
}