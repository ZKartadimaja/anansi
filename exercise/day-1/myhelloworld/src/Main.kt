import java.util.Scanner

fun main() {
//    val name = "Hello World"
//    println(name+ "!")
//
//    var score: Int = 78
//    if (score > 90 && score <= 100) {
//        println("A")
//    }
//    else if (score >= 80 && score <= 89) {
//        println("B")
//    }
//    else if (score >= 70 && score <= 79) {
//        println("Your Grade is C")
//    }
//    else if (score >= 60 && score <= 69) {
//        println("Your Grade is D")
//    }
//    else if (score >= 0 && score <= 60) {
//        println("Your Grade is F")
//    }
//    else {
//        println("Please input number from 0 - 100")
//    }
//    var salary  = 4500000.00
//    var durationYear = 3
//    var bonus= if (durationYear > 5)
//        salary*20/100
//    else if (durationYear >= 2 && durationYear <=5 )
//        salary * 10/100
//    else 0.00
//    println(bonus)
//    var totalAmount = 250f
//    var discount: Float = if (totalAmount > 200) {
//        totalAmount * 0.3f
//    } else if(totalAmount > 100f && totalAmount <= 200f){
//        totalAmount * 0.2f
//    } else if (totalAmount > 50f && totalAmount <= 100f){
//        totalAmount * 0.1f
//    }
//    else {
//        0.0f
//    }
//    var finalPrice = totalAmount - discount
//
//    println(finalPrice)
    var usage = 300.0
    var electricBill= if (usage >= 0 && usage <= 100){
        usage * 1.0
    } else if (usage > 100.0 && usage <=200F){
        ((usage-100F) * 1.5F) + 100F
    }
    else if (usage > 200F){
        (usage - 200F) * 2F + 250F
    }
    else {
        null
    }
    println("Your electric bill is $" + electricBill)
}
