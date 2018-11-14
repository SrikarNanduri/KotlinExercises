fun main(args :Array<String>){

        val walMart = ShoppingList("Walmart")
/*    walMart.groceryItems.add(GroceryItem("Milk", 2))
    walMart.groceryItems.add(GroceryItem("Milk", 6))
    walMart.groceryItems.add(GroceryItem("Soft Drink", 2))
    walMart.groceryItems.add(GroceryItem("potato", 2))*/

    walMart.addGroceryItem(GroceryItem("milk", 2))
    walMart.addGroceryItem(GroceryItem("Milk", 12))

    println(walMart.getGroceryItems().size)

}

data class GroceryItem(var name :String, var quantity :Int){

}

class ShoppingList(var name :String){

    private var groceryItems = mutableListOf<GroceryItem>()

    fun getGroceryItems() :List<GroceryItem>{
        return  this.groceryItems
    }

        fun addGroceryItem(groceryItem: GroceryItem){
            val gi = this.groceryItems.find {
                it.name.toLowerCase() == groceryItem.name.toLowerCase()
            }

            if(gi == null){
                this.groceryItems.add(groceryItem)
            }
        }
}