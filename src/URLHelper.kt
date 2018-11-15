
fun main(args :Array<String>){
    println(URLs.addCustomers)
    println(URLs.allCustomers)
}


//This is my singleTon object
object URLs{
    val allCustomers = "http://someurl.com/customers"
    val addCustomers = "http://someurl.com/add"
}