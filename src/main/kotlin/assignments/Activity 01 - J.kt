package assignments


/*

Using Activity 01 - C

Implement a process where items are added to the grocery cart.

User : Cashier

Goal : List of Items bought, how many items were bought and total cost.

Scope :

Data Structures

 */

// ------------------------------------------- DECLARATIONS ------------------------------- //

var answer2 : String = "y"
var again2 : Boolean = true
var option2 : String = "y"
var inventory = mutableMapOf<Int,String>(1 to "Apple",2 to "Orange",3 to "Banana",4 to "Coco Crunch",5 to "FruitLoops",6 to "Cocoa Puffs",7 to "Coca Cola",8 to "Sprite",9 to "Pepsi")
var inventoryCount = arrayOf<Int>(50,35,45,42,40,56,57,43,35)
var inventoryCost = arrayOf<Double>(15.00,15.00,18.00,142.00,157.00,156.00,87.00,87.00,90.00)
var cartItems = mutableListOf<String>()
var cartCount = mutableListOf<Int>()
var cartCost = mutableListOf<Double>()
var category = arrayOf<String>("Fruits","Fruits","Fruits","Cereals","Cereals","Cereals","Beverages","Beverages","Beverages")

// ------------------------------------------- DECLARATIONS END ------------------------------- //

fun main() {

    while (again2 == true) {

        println("WELCOME TO THE PIONEER GROCERY")
        println("-Main Menu-")
        println("Choose:")
        println("[1] Show Inventory")
        println("[2] Add Inventory")
        println("[3] Add to Cart")
        println("[x] Exit System")

        print("Answer: ")
        option2 = readln()

        ShowOptions(option2)

    }


}

class ShowOptions<T>(value : T){
    init {
        if (option2 == "1") {

            println("-Inventory Count-")
            var ctr: Int = 0
            for (value in inventory) {

                if (category[ctr] == "Fruits") {
                    print("[--FRUITS--]")
                    println("[${ctr + 1}] ${inventory[ctr]} = ${inventoryCount[ctr]}")
                } else if (category[ctr] == "Cereals") {
                    print("[--CEREALS--]")
                    println("[${ctr + 1}] ${inventory[ctr]} = ${inventoryCount[ctr]}")
                } else {
                    print("[--BEVERAGES--]")
                    println("[${ctr + 1}] ${inventory[ctr]} = ${inventoryCount[ctr]}")
                }
                ctr++
            }

            println("")
            println("[x] Return to Main Menu")
            print("Answer: ")
            option2 = readln()

        } else if (option2 == "2") {
            println("-Inventory Update-")
            println("\nChoose an Inventory to Update:")
            var itemNumber: Int = readln().toInt()

            println("Item: ${inventory[itemNumber - 1]}")
            println("Count: ${inventoryCount[itemNumber - 1]}")

            print("How much to add to inventory item?: ")

            inventoryCount.set(itemNumber - 1, inventoryCount[itemNumber - 1] + readln().toInt())

            println("\nINVENTORY SUCCESSFULLY UPDATED!")

        } else if (option2 == "3") {

            println("-Add to Cart-")
            println("\nEnter Item Code:")
            var itemNumber: Int = readln().toInt()

            println("Item: ${inventory[itemNumber - 1]}")
            println("Count: ${inventoryCount[itemNumber - 1]}")

            print("Quantity Purchased?: ")
            var quantity : Int = readln().toInt()

            inventoryCount.set(itemNumber - 1, inventoryCount[itemNumber - 1] - quantity)
            cartItems.add(quantity.toString())
            cartCost.add(inventoryCost[itemNumber - 1])
            cartCount.add(quantity)

            println("\nGROCERY SUCCESSFULLY UPDATED!")

        } else if (option2 == "x") {

            println("Thank you for using the system!")
            again2 = answer2 == "x"

        } else {

            println("Invalid option!")

        }
    }
}