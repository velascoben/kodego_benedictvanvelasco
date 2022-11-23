package com.study

open class Users {

    var user : String = ""
        get() = field
        set(value){
            if(value == "") {
                println("Username cannot be empty!")
            } else {
                field = value
            }
        }

    var pass : String = ""
        get() = field
        set(value){
            if(value == "") {
                println("Password cannot be empty!")
            } else {
                field = value
            }
        }

    var result : Boolean = false

    var usersList = mutableMapOf<String, String>("ben" to "benPass", "aziza" to "AzizaPass", "eugene" to "eugenePass", "francis" to "francisPass", "arnel" to "arnelPass", "pau" to "pauPass", "neil" to "neilPass" )

    var userType = mutableMapOf<String, String>("admin" to "ben","coordinator" to "aziza","dean" to "eugene","full_teacher" to "francis","part_teacher" to "arnel","student" to "pau", "student" to "neil")

}

class SearchUsers : Users() {

    fun searchUser(user : String, pass : String) : Boolean {

        var i : Int = 0
        while (i <= usersList.size) {
            for (userList in usersList.keys) {
                if(user == userList) {
                    var getPass : String? = usersList.get(userList)
                    result = getPass == pass
                }
            }
            i++
        }

        return result

    }
}