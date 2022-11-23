package com.oop

open class Person {

    var name : String = ""
    var age : Int = 0

    // Abstraction
    // Encapsulation

    init {
        println("Object Created!")
        println("Name is $name, age is $age")
    }

    fun upAge() : Int {
        age++
        return age
    }

    open fun displayName(){
        println("Name is $name")
    }

    fun displayName(name : String) {
        println("Name is $name")
    }

    open fun displayName(numberOfTimes : Int) { // Polymorphism
        var ctr = numberOfTimes - 1
        while (ctr >= 0) {
            println("The name is $name")
            ctr++
        }
    }
}