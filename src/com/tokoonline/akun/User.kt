package com.tokoonline.akun

class User(val username: String, val password: String, val email: String) {
    fun display(){
        println("\n=====AKUN SAYA=====")
        println("\nusername: $username")
        println("password: $password")
        println("email: $email\n")

        print("press any key to continue: ")
        readln()
    }
}