fun main(args :Array<String>){
    println(evenOrOdd(3))
}

fun evenOrOdd(a : Int) :String{
    return when {
        a %2 == 0 -> "even"
        else -> "odd"
    }
}