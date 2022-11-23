package assignments

/*

Create an application that will accept 1 string.

Your application will print “Palindrome” if the string is a palindrome.

Scope :

String

Loops



Ex :

GIRAFARIG - Palindrome

101 - Palindrome

RACECAR - Palimdrome

GATE - Not Palindrome

 */

fun main() {

    var again : Boolean = true

    while(again) {

        // ------------------------------------------- DECLARATIONS ------------------------------- //

        var string1: String = ""
        var string2: String = ""
        var stringCount1: Int = 0
        var stringCount2: Int = 0
        var countDuplicate: Int = 0

        // ------------------------------------------- DECLARATIONS END ------------------------------- //

        println("Enter String: ")
        string1 = readln().lowercase().replace(" ","")

        stringCount1 = string1.length
        stringCount2 = stringCount1 - 1

        // Reverse string
        var ctr1: Int = -1
        while (stringCount2 > ctr1) {
            string2 += string1[stringCount2]
            stringCount2--
        }

        //println("Reverse string is $string2")
        //println("String count: $stringCount1")

        // Check duplicate
        var ctr2: Int = 0
        stringCount1--

        while (ctr2 <= stringCount1) {
            if (string2[ctr2] == string1[ctr2]) {
                //println(string2[ctr2] + " " + string1[ctr2])
                countDuplicate++
            }
            ctr2++
        }
        stringCount1++
        //println("Duplicate: $countDuplicate")

        if (countDuplicate == stringCount1) {
            println("Palindrome.")
        } else {
            println("Not palindrome.")
        }

        println("Try Again? YES or NO")
        var answer : String = readln().uppercase()

        again = answer == "YES"

    }

}