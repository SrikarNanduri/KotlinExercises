import kotlin.math.sqrt

fun main(args :Array<String>){

val  square = Square(25.0)

    println(square.area)

    square.area = 25.0

    println(square.width)
    println(square.area)


}

class Square(var width :Double){

    var area :Double
        //this is a getter
    get(){
        return width * width
    }
// this is a setter
    set(value){
        width = sqrt(value)
    }
}