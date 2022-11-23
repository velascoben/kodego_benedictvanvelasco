package exercises.grocery

fun main() {

    var userCredentials = SearchUsers()
    var userLogin = VerifyLogin()
    var fruitsList = Fruits()
    var cerealsList = Cereals()
    var beveragesList = Beverages()
    var groceryList = Grocery()

    var options : String = ""
    var select : String = ""
    var username : String = ""
    var password : String = ""
    var flag : Boolean = true
    var flag2 : Boolean = true
    var flag3 : Boolean = true

    // End Declarations

    while (flag) {

        groceryList.border()
        groceryList.programTitle()
        groceryList.border()
        groceryList.loginPage()
        print("Username: ")
        userLogin.user = readln()

        if(userLogin.user != "") {

            while (flag2) {

                groceryList.border()
                username = userLogin.user
                println("Username: $username")
                print("Password: ")
                userLogin.pass = readln()

                if (userLogin.pass != "") {
                    flag2 = false
                    password = userLogin.pass

                    if (userCredentials.searchUser(username, password)) {
                        flag = false

                        while (options != "X") {

                            groceryList.border()
                            groceryList.programTitle()
                            groceryList.border()
                            groceryList.dashboardPage()
                            println("[1] View Items")
                            println("[2] Add Items")
                            println("[3] Remove Items")
                            println("[4] Reload Grocery")
                            println("[5] Buy Items")
                            println("[X] Exit System")
                            print("Option: ")
                            options = readln().uppercase()

                            if (options == "1") {

                                groceryList.border()
                                groceryList.programTitle()
                                groceryList.border()
                                println("[------------------------VIEW ITEMS------------------------]")
                                groceryList.listFruits()
                                groceryList.listCereals()
                                groceryList.listBeverages()

                            } else if (options == "2") {

                                while (flag3) {
                                    groceryList.border()
                                    groceryList.programTitle()
                                    groceryList.border()
                                    println("[------------------------SELECT AN ITEM TO ADD------------------------]")
                                    println("[1] Fruits")
                                    println("[2] Cereals")
                                    println("[3] Beverages")
                                    println("[X] Exit")
                                    print("Select: ")
                                    select = readln().uppercase()
                                    var addItem: String = ""
                                    var addCount: Int = 0
                                    if (select == "1") {
                                        print("Enter Item to Add: ")
                                        addItem = readln().uppercase()
                                        fruitsList.inventoryItems.add(addItem)
                                        print("Enter Inventory Count: ")
                                        addCount = readln().toInt()
                                        fruitsList.inventoryCount.add(addCount)
                                        flag3 = false
                                    } else if (select == "2") {
                                        print("Enter Item to Add: ")
                                        addItem = readln().uppercase()
                                        cerealsList.inventoryItems.add(addItem)
                                        print("Enter Inventory Count: ")
                                        addCount = readln().toInt()
                                        cerealsList.inventoryCount.add(addCount)
                                        flag3 = false
                                    } else if (select == "3") {
                                        print("Enter Item to Add: ")
                                        addItem = readln().uppercase()
                                        beveragesList.inventoryItems.add(addItem)
                                        print("Enter Inventory Count: ")
                                        addCount = readln().toInt()
                                        beveragesList.inventoryCount.add(addCount)
                                        flag3 = false
                                    } else {
                                        flag3 = true
                                        println("Invalid selection!")
                                    }

                                }
                            } else if (options == "3") {

                                while (flag3) {
                                    groceryList.border()
                                    groceryList.programTitle()
                                    groceryList.border()
                                    println("[------------------------SELECT AN ITEM TO REMOVE------------------------]")
                                    println("[1] Fruits")
                                    println("[2] Cereals")
                                    println("[3] Beverages")
                                    println("[X] Exit")
                                    print("Select: ")
                                    select = readln().uppercase()
                                    var removeItem: Int = 0
                                    if (select == "1") {
                                        groceryList.border()
                                        groceryList.listFruits()
                                        groceryList.border()
                                        print("Select an Item to Remove: ")
                                        removeItem = readln().toInt()
                                        fruitsList.inventoryItems.removeAt(removeItem-1)
                                        fruitsList.inventoryCount.removeAt(removeItem-1)
                                        flag3 = false
                                    } else if (select == "2") {
                                        groceryList.border()
                                        groceryList.listCereals()
                                        groceryList.border()
                                        print("Select an Item to Remove: ")
                                        removeItem = readln().toInt()
                                        cerealsList.inventoryItems.removeAt(removeItem-1)
                                        cerealsList.inventoryCount.removeAt(removeItem-1)
                                        flag3 = false
                                    } else if (select == "3") {
                                        groceryList.border()
                                        groceryList.listBeverages()
                                        groceryList.border()
                                        print("Select an Item to Remove: ")
                                        removeItem = readln().toInt()
                                        beveragesList.inventoryItems.removeAt(removeItem-1)
                                        beveragesList.inventoryCount.removeAt(removeItem-1)
                                        flag3 = false
                                    } else {
                                        flag3 = true
                                        println("Invalid selection!")
                                    }

                                }

                            } else if (options == "4") {
                                while (flag3) {
                                    groceryList.border()
                                    groceryList.programTitle()
                                    groceryList.border()
                                    println("[------------------------SELECT A GROCERY ITEM TO RELOAD------------------------]")
                                    println("[1] Fruits")
                                    println("[2] Cereals")
                                    println("[3] Beverages")
                                    println("[X] Exit")
                                    print("Select: ")
                                    select = readln().uppercase()
                                    var buyItem: Int = 0
                                    var deductThis: Int = 0
                                    var totalDiff: Int = 0
                                    var totalSum: Int = 0
                                    if (select == "1") {
                                        groceryList.border()
                                        groceryList.listFruits()
                                        groceryList.border()
                                        print("Select an Item to Reload: ")
                                        buyItem = readln().toInt()
                                        print("How many to Buy: ")
                                        deductThis = readln().toInt()
                                        totalDiff = fruitsList.inventoryCount.get(buyItem-1) - deductThis
                                        totalSum = fruitsList.groceryCount.get(buyItem-1) + deductThis
                                        fruitsList.inventoryCount.set(buyItem-1,totalDiff)
                                        fruitsList.groceryCount.set(buyItem-1,totalSum)
                                        flag3 = false
                                    } else if (select == "2") {
                                        groceryList.border()
                                        groceryList.listFruits()
                                        groceryList.border()
                                        print("Select an Item to Reload: ")
                                        buyItem = readln().toInt()
                                        print("How many to Buy: ")
                                        deductThis = readln().toInt()
                                        totalDiff = cerealsList.inventoryCount.get(buyItem-1) - deductThis
                                        totalSum = cerealsList.groceryCount.get(buyItem-1) + deductThis
                                        cerealsList.inventoryCount.set(buyItem-1,totalDiff)
                                        cerealsList.groceryCount.set(buyItem-1,totalSum)
                                        flag3 = false
                                    } else if (select == "3") {
                                        groceryList.border()
                                        groceryList.listFruits()
                                        groceryList.border()
                                        print("Select an Item to Reload: ")
                                        buyItem = readln().toInt()
                                        print("How many to Buy: ")
                                        deductThis = readln().toInt()
                                        totalDiff = beveragesList.inventoryCount.get(buyItem-1) - deductThis
                                        totalSum = beveragesList.groceryCount.get(buyItem-1) + deductThis
                                        beveragesList.inventoryCount.set(buyItem-1,totalDiff)
                                        beveragesList.groceryCount.set(buyItem-1,totalSum)
                                        flag3 = false
                                    } else {
                                        flag3 = true
                                        println("Invalid selection!")
                                    }

                                }
                            } else if (options == "5") {
                                while (flag3) {
                                    groceryList.border()
                                    groceryList.programTitle()
                                    groceryList.border()
                                    println("[------------------------SELECT A GROCERY ITEM TO BUY------------------------]")
                                    println("[1] Fruits")
                                    println("[2] Cereals")
                                    println("[3] Beverages")
                                    println("[X] Exit")
                                    print("Select: ")
                                    select = readln().uppercase()
                                    var buyItem: Int = 0
                                    var deductThis: Int = 0
                                    var totalDiff: Int = 0
                                    var totalSum: Int = 0
                                    if (select == "1") {
                                        groceryList.border()
                                        groceryList.listFruits()
                                        groceryList.border()
                                        print("Select an Item to Reload: ")
                                        buyItem = readln().toInt()
                                        print("How many to Buy: ")
                                        deductThis = readln().toInt()
                                        totalDiff = fruitsList.groceryCount.get(buyItem-1) - deductThis
                                        fruitsList.groceryCount.set(buyItem-1,totalDiff)
                                        flag3 = false
                                    } else if (select == "2") {
                                        groceryList.border()
                                        groceryList.listFruits()
                                        groceryList.border()
                                        print("Select an Item to Reload: ")
                                        buyItem = readln().toInt()
                                        print("How many to Buy: ")
                                        deductThis = readln().toInt()
                                        totalDiff = cerealsList.groceryCount.get(buyItem-1) - deductThis
                                        cerealsList.groceryCount.set(buyItem-1,totalDiff)
                                        flag3 = false
                                    } else if (select == "3") {
                                        groceryList.border()
                                        groceryList.listFruits()
                                        groceryList.border()
                                        print("Select an Item to Reload: ")
                                        buyItem = readln().toInt()
                                        print("How many to Buy: ")
                                        deductThis = readln().toInt()
                                        totalDiff = beveragesList.groceryCount.get(buyItem-1) - deductThis
                                        beveragesList.groceryCount.set(buyItem-1,totalDiff)
                                        flag3 = false
                                    } else {
                                        flag3 = true
                                        println("Invalid selection!")
                                    }

                                }
                            }
                        }

                    } else {
                        flag = true
                        println("Invalid credentials!")
                    }

                }

                if (flag2) {
                    println("Password cannot be empty!")
                }

            }

        } else {
            flag = true
            println("Username cannot be empty!")
        }


    }

}


class VerifyLogin {

    var user : String = ""
        get() = field
        set(value){
            if(value == "") {
                field = ""
            } else {
                field = value
            }
        }

    var pass : String = ""
        get() = field
        set(value){
            if(value == "") {
                field = ""
            } else {
                field = value
            }
        }
}


fun String.checkIntOrString(): Any {
    var v = toIntOrNull()
    return when(v) {
        null -> "false"
        else -> "true"
    }
}