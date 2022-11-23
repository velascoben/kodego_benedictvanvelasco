package assignments


/*

Create an application that will accept 2 Integers.

It will identify the lower value and bigger value of the two inputs.

Then, your application will print all the prime numbers starting from the lower number up to the largest number.

Scope :

String

Loops



Input:

1, 4 -> 1, 2, 3

10 -> 1, 2, 3, 5, 7

 */

fun main() {

    // ------------------------------------------- DECLARATIONS ------------------------------- //

    var number1 : Int = 0
    var number2 : Int = 0
    var lowNum : Int = 0
    var highNum : Int = 0

    // ------------------------------------------- DECLARATIONS END ------------------------------- //

    println("Enter 1st Number: ")
    number1 = readln().toInt()

    println("Enter 2nd Number: ")
    number2 = readln().toInt()

    if(number1 > number2) {
        lowNum = number2 + 1
        highNum = number1
    } else {
        lowNum = number1 + 1
        highNum = number2
    }

    while (lowNum < highNum) {
        var flag = false // initial value

        for (i in 2..lowNum / 2) {
            //println("$i  $lowNum")
            // condition for Non-Prime number
            if (lowNum % i == 0) {
                flag = true // flag if number is prime
                break
            }
        }

        if (!flag)  { //
            print("$lowNum ")
        }

        ++lowNum
    }


}