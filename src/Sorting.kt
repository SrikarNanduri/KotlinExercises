fun main(args :Array<String>){

    var list = mutableListOf(3, 12, 78, 56, 2, 1)
    sortAssending(list)
    println(list)
    sortDecending(list)
    println(list)
}

fun sortAssending(num: MutableList<Int>){

   /* for(i in 0 until num.size){
        for(j in i+1 until num.size){
            if(num[i] > num[j]){
                val temp = num[i]
                num[i] = num[j]
                num[j] = temp
            }
        }
    }*/
    num.sort()

    //num.sort()
}

fun sortDecending(n: MutableList<Int>){

    n.sortDescending()
}