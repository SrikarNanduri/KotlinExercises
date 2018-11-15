

val Double.celsius :Double
get(){
    return (this -32) *5/9
}

val Double.fahrenheit :Double
get(){
    return (this * 9/5) +32
}

fun main(args :Array<String>){

    println(32.0.fahrenheit)
    println(89.6.celsius)
}