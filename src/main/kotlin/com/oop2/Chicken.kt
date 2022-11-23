package com.oop2

class Chicken : Animal() {

    override fun walk() {
        println("A chicken walks on two legs")
    }

    override fun makeSound() {
        println("Tiktilaok")
    }
}