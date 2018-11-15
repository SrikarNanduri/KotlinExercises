

fun main(argd :Array<String>){


    val bmw = BMW("BMW", "Series 3")
    bmw.start()
    bmw.isTurboOn = true
    processServide(bmw)
}

fun processServide(car :Car){

    if(car is BMW){
        println("Car is BMW!")
    }

    val bmw = car as? BMW
    bmw?.start()
    bmw?.isTurboOn = true
}

open class Car(var make :String, var model :String){

    open fun start(){

    }
}

class BMW(make :String, model :String) :Car(make, model){

    var isTurboOn :Boolean = true
    override fun start(){
        println("Starting BMW!")
    }
}