import java.util.Scanner

fun main() {
    val name = "Hello World"
    println(name+ "!")

    var score: Int = 78
    if (score > 90 && score <= 100) {
        println("A")
    }
    else if (score >= 80 && score <= 89) {
        println("B")
    }
    else if (score >= 70 && score <= 79) {
        println("Your Grade is C")
    }
    else if (score >= 60 && score <= 69) {
        println("Your Grade is D")
    }
    else if (score >= 0 && score <= 60) {
        println("Your Grade is F")
    }
    else {
        println("Please input number from 0 - 100")
    }
}
