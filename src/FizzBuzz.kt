import java.util.Scanner;


fun main (args: Array<String>){

    val scannar = Scanner(System.`in`)

    var number :Int = scannar.nextInt()

    if (number % 3 ==0 && number % 5 ==0) {
        println("FizzBuzz")
    }else
        if (number % 3 == 0) {
            println("Fizz")
        } else if (number % 5 == 0) {
            println("Buzz")
        } else {
            println("Not Fizz Buzz")
        }


}