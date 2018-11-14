fun main(args :Array<String>){

    var nameAge = mutableMapOf("john" to 30, "max" to 20, "jane" to 40)

    //Add new key and value
    nameAge["jake"] = 15
    println(nameAge["jake"])

    //remove a key and value
    nameAge.remove("jake")
    println(nameAge["jake"])

    //print all the values and keys
    for((name , age) in nameAge){
        println("$name - $age")
    }

    for (key in nameAge.keys){
        println("$key")
    }

}