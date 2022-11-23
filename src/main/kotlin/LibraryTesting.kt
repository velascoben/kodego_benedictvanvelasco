fun main() {
    println("Available Books")
    var AvailableBooks = listOf<String>(
        "1. Educational",
        "2. Fictional"
    )
    AvailableBooks.forEach { AvailableBooks ->
        println(AvailableBooks)
    }
    println("Do you want to borrow books?")
    var answer : String = readln()

    if (answer == "Yes") {
        println("Good to borrow")
    } else {
        println("Thank you!")
    }
}