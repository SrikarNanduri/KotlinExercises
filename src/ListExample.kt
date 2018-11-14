fun main(args :Array<String>){
    var list = mutableListOf<String>()

    list.add("name")
    list.add("place")
    list.add("animal")

    for(i in 0 until list.size){
        println(list.get(i))
    }

}