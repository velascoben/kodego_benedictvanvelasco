package assignments

/*

Using Activity 01 - B, Implement a process where someone can borrow a book.

User: Librarian

Goal: Keep track book borrowed, who borrowed and how long it can be borrowed.

Scope :

Data Structures

 */

fun main() {

// ------------------------------------------- DECLARATIONS ------------------------------- //

    var answer : String = "y"
    var again : Boolean = true
    var option : String = "y"

    // Books Data
    var books = arrayOf<String>("Halloween","Friday the 13th","Harry Potter and the Sorcerer's Stone", "Harry Potter and the Goblet of Fire","Encyclopedia","Webster's Dictionary")
    var genre = arrayOf<String>("Horror","Horror","Fantasy","Fantasy","General","General")
    var status = arrayOf<String>("Borrowed","Available","Available","Available","Available","Available")
    var borrower = arrayOf<String>("Ben&Ben","","","","","")
    var returnDate = arrayOf<String>("12/01/2022","","","","","")

    // ------------------------------------------- DECLARATIONS END ------------------------------- //


    while (again == true) {

        println("WELCOME TO THE CITY LIBRARY")
        println("-Main Menu-")
        println("Choose:")
        println("[1] Show the books")
        println("[2] Borrow a book")
        println("[3] Return a book")
        println("[x] Exit Library")

        print("Answer: ")
        option = readln()

        if (option == "1") {

            println("-Books-")
            var ctr: Int = 0
            for (value in books) {
                println("[${ctr + 1}] ${books[ctr]} | ${genre[ctr]} | ${status[ctr]} | ${borrower[ctr]} | ${returnDate[ctr]}")
                ctr++
            }

            println("")
            print("[Press ENTER] Return to Main Menu:")
            option = readln()

        } else if (option == "2") {
            println("-Borrow Books-")
            println("\nChoose a Book to Borrow:")
            var itemNumber : Int = readln().toInt()
            println("\nBorrower's Name:")
            var borrowerName : String = readln()
            println("\nDate to Return Book:")
            var returnOn : String = readln()

            if (status[itemNumber - 1] == "Borrowed") {

                println("Warning! Book already borrowed. Choose another book.")

            } else {

                println("Title: ${books[itemNumber - 1]}")
                println("Genre: ${genre[itemNumber - 1]}")

                status.set(itemNumber - 1, "Borrowed")
                borrower.set(itemNumber - 1, borrowerName)
                returnDate.set(itemNumber - 1, returnOn)

                println("\nBOOK SUCCESSFULLY BORROWED!")
            }

            println("")
            print("[Press ENTER] Return to Main Menu:")
            option = readln()

        } else if (option == "3") {

            println("-Return Books-")
            println("\nChoose a Book to Return:")
            var itemNumber: Int = readln().toInt()

            if (status[itemNumber - 1] == "Available") {

                println("Warning! Book already returned. Error Processing.")

            } else {

                println("Title: ${books[itemNumber - 1]}")
                println("Genre: ${genre[itemNumber - 1]}")

                status.set(itemNumber - 1, "Available")
                borrower.set(itemNumber - 1, "")
                returnDate.set(itemNumber - 1, "")

                println("\nBOOK SUCCESSFULLY RETURNED!")

            }

            println("")
            print("[Press ENTER] Return to Main Menu:")
            option = readln()

        } else if (option == "x") {

            println("Thank you for using the system!")
            again = answer == "x"

        } else {

            println("Invalid option!")

        }

    }

}