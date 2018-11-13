import java.util.*

fun main(arge :Array<String>){

    val scannar = Scanner(System.`in`)

    var number = scannar.nextInt()

  val resule =  when{
        number%3 == 0 && number%5==0 -> "FizzBuzz"
        number%3 == 0 -> "Fizz"
        number%5 ==0 -> "Buzz"
        else -> "Not Fizz Buzz"

    }

    println(resule)
}