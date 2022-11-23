fun main(){
//    val fruits = arrayOf("apple", "melon", "orange", "grapes")
//
//    println(fruits[0])
//    println(fruits[1])
//    println(fruits[2])
//    println(fruits[3])
//
//    val fruits2 = listOf("apple", "melon", "melon", "orange", "grapes")
//
//    println(fruits2[0])
//    println(fruits2[1])
//    println(fruits2[2])
//    println(fruits2[3])
//
//    val fruits3 = setOf("apple", "melon", "melon", "orange", "grapes")
//
//    println(fruits3.elementAt(0))
//    println(fruits3.lastIndexOf("apple"))
//    println(fruits3.indexOf("grapes"))
//    println(fruits3.first())
//    println(fruits3.last())

    //val students = mapOf("Ben" to 1, "Albert" to 2, "John" to 3, "Joe" to 4, "Chris" to 5)


//    println("Map Entries : "+students.entries)
//
//    //println("Map Entries : "+students["Ben"])
//
//    println("Map Entries : "+students[1])
//
//    println("Map Keys: "+students.keys )
//
//    println("Map Values: "+students.values )
//
//    println("Team having rank #3 is: "+students.getValue(3))
//    //method 3
//    println("Team having rank #4 is: "+students.getOrDefault(4, 1))
//    // method  4
//    val team = students.getOrElse(0) { students.getValue(2) }
//    println(team)

    print("Enter name: ")
    var searchName : String = readln()

    println(searchThisName(searchName))

}

fun searchThisName(findThisName : String) : String {
    val students = mapOf(1 to "Ben", 2 to "Albert", 3 to "John", 4 to "Joe", 5 to "Chris")

    if(students.containsValue(findThisName)){
        return "Yes, the list contains the name: $findThisName"
    } else {
        return "Sorry, the list does not contain the name: $findThisName"
    }
}

