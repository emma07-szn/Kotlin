// when statement

fun main(){
    var year:Int=2012

    when(year){
        in 2012..2016->println("Leap year")
        in 2017..2018->println("Not leap")
        in 2019..2021->println("Not leap")
        in 2022..2023->println("Not leap")
        in 2024..2028->println("Leap year")
        else ->println("Invalid")

    }
}