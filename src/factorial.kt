
import java.util.Scanner

fun main(args : Array<String>){

    println("Hello Kotlin")
    val reader = Scanner(System.`in`)
    var num :Int

    println("enter the number to find the factorial:")
    num =  reader.nextInt()
      var factorial =   fact(num)
println("the factorial of $num is: $factorial" )
}

fun fact( a: Int): Int{
    if(a == 1){
        return 1
    }
    var output: Int = fact(a-1)* a
    return output
}
