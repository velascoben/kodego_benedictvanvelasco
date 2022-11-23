package exercises.grocery

class Grocery : Process(), Display {

    var getFruits = Fruits()
    var getCereals = Cereals()
    var getBeverages = Beverages()


    override fun listFruits() {

        var ctr: Int = 0
        println("[------------------------Fruits------------------------]")
        println("INVENTORY COUNT")
        for (item in getFruits.inventoryItems) {
            println("[${ctr + 1}] $item = ${getFruits.inventoryCount[ctr]}")
            ctr++
        }
        println("GROCERY COUNT")
        ctr = 0
        for (item in getFruits.inventoryItems) {
            println("[${ctr + 1}] $item = ${getFruits.groceryCount[ctr]}")
            ctr++
        }

    }

    override fun listCereals() {

        var ctr: Int = 0
        println("[------------------------Cereals------------------------]")
        println("INVENTORY COUNT")
        for (item in getCereals.inventoryItems) {
            println("[${ctr + 1}] $item = ${getCereals.inventoryCount[ctr]}")
            ctr++
        }
        println("GROCERY COUNT")
        ctr = 0
        for (item in getCereals.inventoryItems) {
            println("[${ctr + 1}] $item = ${getCereals.groceryCount[ctr]}")
            ctr++
        }

    }

    override fun listBeverages() {

        var ctr: Int = 0
        println("[------------------------Beverages------------------------]")
        println("INVENTORY COUNT")
        for (item in getBeverages.inventoryItems) {
            println("[${ctr + 1}] $item = ${getBeverages.inventoryCount[ctr]}")
            ctr++
        }
        println("GROCERY COUNT")
        ctr = 0
        for (item in getBeverages.inventoryItems) {
            println("[${ctr + 1}] $item = ${getBeverages.groceryCount[ctr]}")
            ctr++
        }

    }


    override fun border () {
        println("**************************************")
    }

    override fun loginPage () {
        println("-Login Page-")
    }

    override fun dashboardPage () {
        println("-Dashboard-")
    }

    override fun programTitle () {
        println("WELCOME TO THE CITY SUPERMARKET")
    }

}