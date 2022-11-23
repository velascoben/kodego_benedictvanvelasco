package assignments

import java.lang.NumberFormatException

/*

Create an application that will accept 5 monetary amounts.



After the input is done, the user will be asked “Divide the value by how many?”. It will only accept an Integer as input.


The total of the 5  input will be divided by the answer in the second question input.


Note: Error checking must be done.

*/

fun main() {

    // ------------------------------------------- DECLARATIONS ------------------------------- //

    var amount : String = ""
    var amountDouble : Double = 0.00
    var divideBy : Double = 0.00
    var count : Int = 0
    var sum : Double = 0.00
    var total : Double = 0.00
    var flag : Boolean = true
    var flag2 : Boolean = true

    // ------------------------------------------- DECLARATIONS END ------------------------------- //
    while (count < 5) {
        flag = true
        while(flag) {
            flag = false
            try {
                print("Enter amount: ")
                amountDouble = readln().toDouble()
            } catch (e: NumberFormatException) {
                flag = true
                println("Input amount only!")
            }

        }

        sum += amountDouble
        count++

    }

    while(flag2) {
        flag2 = false

        try {
            println("Divide the value by how many?")
            divideBy = readln().toDouble()
        } catch (e: NumberFormatException) {
            flag2 = true
            println(e.message)
            println("Input amount only!")
        }
    }

    total = sum / divideBy

    println("The result is $total")

}
