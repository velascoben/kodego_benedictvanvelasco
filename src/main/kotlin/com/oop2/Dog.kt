package com.oop2

class Dog : Animal() {

    override fun walk() {
        println("A dog walks on four legs.")
    }

    override fun makeSound() {
        println("Aw aw aw")
    }

}