fun main() {

    /*

    Practice Activity 4
    Formulate program SalesDiscount for a particular sales range generated by sale.
    Follow the given discount range:

    Price range             Discount
    0 - 10,000              0%
    10,001 - 20,000         5%
    20,001 - 50,000         10%
    50,001 - 100,000        15%
    Greater than 100,000    20%

    Sample Input/Output:
    Enter product: modem router
    Enter price : 14500.50
    Price of modem router is 14,500.50
    Discount is 725.02
    Net Price is 13,775.48

     */

    // Declarations
    var loopHere : Int = 1


    // Enter Details
//    print("Enter Product: ")
//    var product : String = readln()
//    print("Enter Price: ")
//    var price : Double = readln().toDouble()

    while (loopHere > 0) {

        println("**************************************")
        println("---Welcome to Tagoro Brother's Computer Shop---")

        println("Options:")
        println("[1] Show Products")
        println("[2] Add Products")
        println("[3] Add Quantity")
        println("[4] Buy Products")
        println("[5] Show Inventory")
        println("[0] Exit System")
        print("Answer: ")
        var option = ComputeDiscount2()
        option.getOption(readln().toInt())
        println("**************************************")

    }

}

class ComputeDiscount2() {

    fun getOption(option : Int) {

        var chosenOne: Int = 0
        var again: Int = 1

        var discount: Double = 0.0
        var net: Double = 0.0
        var amountTendered: Double = 0.0
        var amountChange: Double = 0.0

        var productList = mutableListOf<String>("HP", "Toshiba", "Lenovo", "Macbook", "Alienware")
        var productCount = mutableListOf<Double>(5.0, 4.0, 3.0, 2.0, 1.0)
        var productPrice = mutableListOf<Double>(9999.99, 15999.00, 25870.00, 78089.00, 157000.00)
        var purchasedProduct = ArrayList<String>()
        var purchasedPrice = ArrayList<Double>()
        var purchasedDiscount = ArrayList<Double>()
        var purchasedNet = ArrayList<Double>()

        if (option == 1) {
            println("PRODUCTS:")
            var ctr: Int = 1
            for (item in productList) {
                println("[$ctr] $item \n\t\t${String.format("%,.2f", productPrice[ctr - 1])}")
                ctr++
            }

        } else if (option == 2) {

            println("Product Name: ")
            productList.add(readln())
            println("Product Quantity: ")
            productCount.add(readln().toDouble())
            println("Product Price: ")
            productPrice.add(readln().toDouble())

        } else if (option == 3) {


        } else if (option == 4) {

            while (again == 1) {

                println("**************************************")
                print("Choose a Brand: ")
                chosenOne = readln().toInt()

                // Computation
                if ((productPrice[chosenOne - 1] >= 0.00) && (productPrice[chosenOne - 1] <= 10000.00)) {
                    discount = productPrice[chosenOne - 1] * 0.00
                    net = productPrice[chosenOne - 1] - discount
                } else if ((productPrice[chosenOne - 1] >= 10001.00) && (productPrice[chosenOne - 1] <= 20000.00)) {
                    discount = productPrice[chosenOne - 1] * 0.05
                    net = productPrice[chosenOne - 1] - discount
                } else if ((productPrice[chosenOne - 1] >= 20000.00) && (productPrice[chosenOne - 1] <= 50000.00)) {
                    discount = productPrice[chosenOne - 1] * 0.10
                    net = productPrice[chosenOne - 1] - discount
                } else if ((productPrice[chosenOne - 1] >= 50001.00) && (productPrice[chosenOne - 1] <= 100000.00)) {
                    discount = productPrice[chosenOne - 1] * 0.15
                    net = productPrice[chosenOne - 1] - discount
                } else if (productPrice[chosenOne - 1] > 100000.00) {
                    discount = productPrice[chosenOne - 1] * 0.20
                    net = productPrice[chosenOne - 1] - discount
                }

                println("**************************************")
                println("Do you want to buy another product?")
                println("[1] Yes")
                println("[2] No")
                print("Answer: ")
                again = readln().toInt()

                purchasedProduct.add(productList[chosenOne - 1])
                purchasedPrice.add(productPrice[chosenOne - 1])
                purchasedDiscount.add(discount)
                purchasedNet.add(net)

            }

            println("**************************************")
            var ctr: Int = 1
            var totalPurchased: Double = 0.0
            println("PURCHASED PRODUCTS: ")
            for (purchased in purchasedProduct) {
                println("[$ctr] $purchased ")
                println("Original Price: ${String.format("%,.2f", purchasedPrice[ctr - 1])}")
                println("Discount: ${String.format("%,.2f", purchasedDiscount[ctr - 1])}")
                println("Net: ${String.format("%,.2f", purchasedNet[ctr - 1])}")
                totalPurchased += purchasedNet[ctr - 1]
                ctr++
            }

            amountChange = 0.0
            println("**************************************")
            println("Total Amount to Pay: ${String.format("%,.2f", totalPurchased)}")

            while (amountTendered < totalPurchased) {
                print("Amount Paid: ")
                amountTendered = readln().toDouble()

                if (amountTendered > totalPurchased) {
                    amountChange = amountTendered - totalPurchased
                }
            }

            println("Your change is: ${String.format("%,.2f", amountChange)}")

        } else if (option == 0) {
            println("--Exit System--")
        }
    }

}