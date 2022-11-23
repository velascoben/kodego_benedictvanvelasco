fun main() {
    lateinit var name : String
    lateinit var age : String
    lateinit var address : String

    println("Enter name: ")
    name = readln()
    println(name)

    var wordSet = mutableSetOf<Char>() // Put characters here

    for(letter in name) {
        wordSet.add(letter) // Put characters one-by-one
    }

    print(wordSet) // Display characters with no duplicates
}