package assignments

import java.util.*

/*

You are tasked to automate a school’s library.

Identify the items that can be borrowed in a Library.

After listing the different items, identify the characteristics of the items.

Use the proper data types.

 */

fun main() {
    // ------------------------------------------- DECLARATIONS ------------------------------- //

    var bookCode : Int = 0
    var bookCategoryCode : String = ""
    var bookTitle : String = ""
    var bookBorrowed : Boolean = false
    var dateBorrowed : Date
    var dateReturned : Date

    // ------------------------------------------- DECLARATIONS END ------------------------------- //



    // ------------------------------------------- INITIAL UNDERSTANDING ------------------------------- //


    var horror : String = "HORROR: \n H1 - Halloween \n H2 - Friday the 13th"
    var fantasy : String = "FANTASY: \n F1 - Harry Potter and the Sorcerer's Stone \n F2 - Harry Potter and the Goblet of Fire"
    var general : String = "GENERAL INFORMATION: \n G1 - Encyclopedia \n G2 - Webster's Dictionary"

    println(horror)
    println(fantasy)
    println(general)

    println("\n Choose the book to borrow: ")
    var bookChosen : String = readln()

    if (bookChosen == "H1") {
        println("Title: Halloween")
        println("Genre: Horror")
        println("Plot: Two couples went to a cabin with friends and finds \n and gruesome murders start happening.")
    } else if (bookChosen == "H2") {
        println("Title: Friday the 13th")
        println("Genre: Horror")
        println("Plot: Scouts are having their annual jamboree in the lake \n then horror strikes them one by one.")
    } else if (bookChosen == "F1") {
        println("Title: Harry Potter and the Sorcerer's Stone")
        println("Genre: Fantasy")
        println("Plot: A young boy lives and introduced to the world of magic. \n Will he become the wizard he wants to be?")
    } else if (bookChosen == "F2") {
        println("Title: Harry Potter and the Goblet of Fire")
        println("Genre: Fantasy")
        println("Plot: The boy who lives grows up and joins a deadly tournament. \n Will he survive or will he meet his demise?")
    } else if (bookChosen == "G1") {
        println("Title: Encyclopedia")
        println("Genre: General Information")
        println("Plot: Everything you need to learn about the world and its mysteries. \n Grab your copy now!")
    } else if (bookChosen == "G2") {
        println("Title: Webster's Dictionary")
        println("Genre: General Information")
        println("Plot: Don't know the word? \n Webster's Dictionary is all you need.")
    }
}