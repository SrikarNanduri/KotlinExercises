fun main(args :Array<String>){

    val names = setOf("Jane", "Richad", "Frost")

    //if you want to add an array inside a set it need to add each index inside an array inside each index of set for that we need to use "*" otherwise it'll add the whole array inside the first index of the set

    val num = arrayOf(1, 2, 3, 4, 5, 6)

    //without "*"
    var numbersSet = setOf(num)
    println(numbersSet)

    //with "*"
    var numbersSet2 = setOf(*num)
    println(numbersSet2)

    //check if there is a number inside the set
    println(numbersSet2.contains(5))

    println(5 in numbersSet2)

    //if you want to add data dynamically then obvisely you need to create mutableset then you can add and remove.
}