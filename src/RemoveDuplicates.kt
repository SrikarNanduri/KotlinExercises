fun main(args :Array<String>){


    //duplicate numbers array
    val num = arrayOf(1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 5, 6)


    //changed it to set
    val set = setOf(*num)


    //set will remove duplicates so now we need to convert it back to array to have a duplicate free array
    val duplicateFreeNumbersArray = set.toIntArray()

    //run the loop nd print the array to check if there are any duplicates
    for(i in 0 until duplicateFreeNumbersArray.size){
        println(duplicateFreeNumbersArray[i])
    }


}